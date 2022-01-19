/*
 * Written by Andrew Paulen
 */

package observer;
import java.util.ArrayList;
import java.util.HashMap;

public class StudentGovPoll implements Subject
{
    private ArrayList <Observer> observers;
    private HashMap <String, Integer> votes;
    private String school;
    private int numUpdates;
    private String div = "**************************************************";

    public StudentGovPoll (String school)
    {
        this.school = school;
        numUpdates = 0;
        votes = new HashMap <String, Integer> ();
        observers = new ArrayList <Observer> ();
    }

    public void registerObserver (Observer observer)
    {
        observers.add (observer);
    }

    public void removeObserver (Observer observer)
    {
        observers.remove (observer);
    }

    public void notifyObserver()
    {
        for (Observer observer : observers)
            observer.update (votes);
    }

    public void addCandidate (String president)
    {
        if (votes.containsKey (president))
            return;
        
        votes.put (president, 0);
    }

    public void enterVotes (String president, int num)
    {
        int numVotes = votes.get (president);
        numVotes = numVotes + num;
        votes.replace (president, numVotes);

        numUpdates++;

        if (numUpdates % 4 == 0)
            notifyObserver();
    }

    public String getSchool()
    {
        return school;
    }
}