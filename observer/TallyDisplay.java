/*
 * Written by Andrew Paulen
 */

package observer;
import java.util.HashMap;

public class TallyDisplay implements Observer
{
    private Subject poll;
    private HashMap <String, Integer> votes;

    public TallyDisplay (Subject poll)
    {
        this.poll = poll;
        poll.registerObserver (this);
    }

    public void update (HashMap <String, Integer> votes)
    {
        this.votes = votes;
        display();
    }

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