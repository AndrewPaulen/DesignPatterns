/*
 * Written by Andrew Paulen
 */ 

package observer;
import java.util.HashMap;
import java.text.DecimalFormat;

public class PercentageDisplay implements Observer
{
    private Subject poll;
    private HashMap <String, Integer> votes;
    private int numVotes;

    public PercentageDisplay (Subject poll)
    {
        this.poll = poll;
        poll.registerObserver (this);
    }

    public void update (HashMap <String, Integer> votes)
    {
        this.votes = votes;
        
        for (String name : votes.keySet())
        {
            int temp = votes.get (name);
            numVotes = numVotes + temp;
        }
        
        display();
    }

    private void display()
    {
        System.out.println ("\nCurrent Percent of Votes:");
        DecimalFormat df1 = new DecimalFormat ("0.0");

        for (String name : votes.keySet())
        {
            double percent = votes.get (name);
            percent = (percent / numVotes) * 100;
            System.out.println (name + ": " + df1.format (percent) + "%");
        }
    }
}