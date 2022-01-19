/*
 * Written by Andrew Paulen
 */

package observer;
import java.util.ArrayList;
import java.util.HashMap;

// Class implements interface Subject
public class StudentGovPoll implements Subject
{
    // Attributes
    private ArrayList <Observer> observers;
    private HashMap <String, Integer> votes;
    private String school;
    private int numUpdates;

    // Constructor
    public StudentGovPoll (String school)
    {
        this.school = school;
        numUpdates = 0;
        votes = new HashMap <String, Integer> ();
        observers = new ArrayList <Observer> ();
    }

    // Methods
    // Method to add an observer to the ArrayList of observers
    public void registerObserver (Observer observer)
    {
        observers.add (observer);
    }

    // Method to remove an observer from the ArrayList of observers
    public void removeObserver (Observer observer)
    {
        observers.remove (observer);
    }

    // Method that notifies and updates all observers in the ArrayList by calling the update method in observer class
    public void notifyObserver()
    {
        // Cycles though the whole of the observers ArrayList
        for (Observer observer : observers)
            observer.update (votes);
    }

    // Method that adds a candidate to the HashMap with 0 votes as long as the are not already in the HashMap
    public void addCandidate (String president)
    {
        if (votes.containsKey (president))
            return;
        
        votes.put (president, 0);
    }

    // Method that takes in a president and number of votes and adds the votes to the correct president
    public void enterVotes (String president, int num)
    {
        // Adds the votes to the existing votes
        int numVotes = votes.get (president);
        numVotes = numVotes + num;
        votes.replace (president, numVotes);

        // Changes update count 
        numUpdates++;

        // If the update count is a multiple of 4, updates the observers by calling the notifyObserver method
        if (numUpdates % 4 == 0)
            notifyObserver();
    }

// Method that returns the name of the school
    public String getSchool()
    {
        return school;
    }
}