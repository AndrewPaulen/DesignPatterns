/*
 * Written by Andrew Paulen
 */ 

package observer;
import java.util.HashMap;
import java.text.DecimalFormat;

// Class implements Observer class
public class PercentageDisplay implements Observer
{
    // Attributes
    private Subject poll;
    private HashMap <String, Integer> votes;
    private int numVotes;

    // Constructor
    public PercentageDisplay (Subject poll)
    {
        this.poll = poll;
        poll.registerObserver (this);
    }

    // Methods
    // Method to update the stored results, then calls to display the results
    public void update (HashMap <String, Integer> votes)
    {
        this.votes = votes;
        
        // Updates the total number of votes 
        for (String name : votes.keySet())
        {
            int temp = votes.get (name);
            numVotes = numVotes + temp;
        }
        
        display();
    }

    // Method to display the results
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