/*
 * Written by Andrew Paulen
 */

package observer;
import java.util.HashMap;

// Class implements class Observer
public class TallyDisplay implements Observer
{
    // Attributes
    private Subject poll;
    private HashMap <String, Integer> votes;

    // Constructor
    public TallyDisplay (Subject poll)
    {
        this.poll = poll;
        poll.registerObserver (this);
    }

    // Methods
    // Method to update the stored results, the calls to display results
    public void update (HashMap <String, Integer> votes)
    {
        this.votes = votes;
        display();
    }

    // Method to display the results
    private void display()
    {
        System.out.println ("\nCurrent Tallies:");

        // For every name in the HashMap prints name and number of votes
        for (String name : votes.keySet())
        {
            String numVotes = votes.get (name).toString();
            System.out.println (name + ": " + numVotes);
        }
    }
}