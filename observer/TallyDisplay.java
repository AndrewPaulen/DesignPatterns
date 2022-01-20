package observer;
import java.util.HashMap;

/**
 * Display the total number of votes for the poll
 * Implements Observer
 * @author Andrew Paulen
 */
public class TallyDisplay implements Observer
{
    private Subject poll;
    private HashMap <String, Integer> votes;

    /**
     * Creates an observer of the poll
     * @param poll The name of the poll subject
     */
    public TallyDisplay (Subject poll)
    {
        this.poll = poll;
        poll.registerObserver (this);
    }

    /**
     * Updates the tally display observer with the results
     * @param votes The results of the poll
     */
    public void update (HashMap <String, Integer> votes)
    {
        this.votes = votes;
        display();
    }

    /**
     * Displays the total number of votes for each candidate
     */
    private void display()
    {
        System.out.println ("\nCurrent Tallies:");

        for (String name : votes.keySet())
        {
            String numVotes = votes.get (name).toString();
            System.out.println (name + ": " + numVotes);
        }
    }
}