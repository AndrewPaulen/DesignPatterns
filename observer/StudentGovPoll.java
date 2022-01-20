package observer;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * A student poll for student government
 * Implements Subject
 * @author Andrew Paulen
 */
public class StudentGovPoll implements Subject
{
    private ArrayList <Observer> observers;
    private HashMap <String, Integer> votes;
    private String school;
    private int numUpdates;

    /**
     * Creates a new poll with the given name of the school
     * @param school The name of the schhol
     */
    public StudentGovPoll (String school)
    {
        this.school = school;
        numUpdates = 0;
        votes = new HashMap <String, Integer> ();
        observers = new ArrayList <Observer> ();
    }

    /**
     * Adds an observer to an ArrayList of observers
     * @param observer The instance of the observer 
     */
    public void registerObserver (Observer observer)
    {
        observers.add (observer);
    }

    /**
     * Removes an observer from the ArrayList of observers
     * @param observer The instance of the observer
     */
    public void removeObserver (Observer observer)
    {
        observers.remove (observer);
    }

    /**
     * Tells all the observers in the observers ArrayList to update their stored poll results with the passed reults
     */
    public void notifyObserver()
    {
        for (Observer observer : observers)
            observer.update (votes);
    }

    /**
     * Adds a candidate to the list of candidates as long as they are not on the list alreay
     * @param president The name of the president
     */
    public void addCandidate (String president)
    {
        if (votes.containsKey (president))
            return;
        
        votes.put (president, 0);
    }

    /**
     * Adds the number of votes for a candidate to their total number of votes. If the number of updates to the poll made is a multiple of 4, calls to display the current results
     * @param president The name of the president
     * @param num The number of votes the president is recieving
     */
    public void enterVotes (String president, int num)
    {
        int numVotes = votes.get (president);
        numVotes = numVotes + num;
        votes.replace (president, numVotes);
        numUpdates++;

        if (numUpdates % 4 == 0)
            notifyObserver();
    }

    /**
     * Returns the name of the school
     * @return The name of the school
     */
    public String getSchool()
    {
        return school;
    }
}