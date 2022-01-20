package observer;
import java.util.HashMap;
import java.text.DecimalFormat;

/**
 * Display the perentage of votes for the poll
 * Implements Observer
 * @author Andrew Paulen
 */
public class PercentageDisplay implements Observer
{
    private Subject poll;
    private HashMap <String, Integer> votes;
    private int numVotes;

    /**
     * Creates an observer of the poll
     * @param poll The name of the poll subject
     */
    public PercentageDisplay (Subject poll)
    {
        this.poll = poll;
        poll.registerObserver (this);
    }

    /**
     * Updates the percentage display oberver with the poll results
     * @param votes The results of the poll
     */
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

    /**
     * Calculates and displays the percentage of votes for each candidate 
     */
    private void display()
    {
        System.out.println ("\nCurrent Percent of Votes:");

        // Formats the decimal number to only show to the nearest tenth
        DecimalFormat df1 = new DecimalFormat ("0.0");

        // For each key in the HashMap prints out the name and then prints the percentage after calculating it
        for (String name : votes.keySet())
        {
            double percent = votes.get (name);
            percent = (percent / numVotes) * 100;
            System.out.println (name + ": " + df1.format (percent) + "%");
        }
    }
}