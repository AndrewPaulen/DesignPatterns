/*
* Written by Andrew Paulen
*/

package strategy;
import java.util.ArrayList;

// Implments interface SortBehavior
public class BubbleSort implements SortBehavior
{
    public ArrayList <String> sort (ArrayList <String> data)
    {
        /* Originally developed by blackStar, found on Stack Overflow, alterations made to fit code
        https://stackoverflow.com/questions/8121176/java-sort-arraylist-using-bubblesort */

        // Temp value to store string
        String temp;

        // Checks for if data has more than 1 value
        if (data.size() > 1)
        {
            // Repeats for the whole length of the ArrayList
            for (int x = 0; x < data.size(); x++)
            {
                // Repeats for the whole length of the ArrayList
                for (int i = 0; i < data.size() - x - 1; i++) 
                {
                    // Checks to see if the current value and the value one space ahead are in the correct alphabetical order
                    if (data.get (i).compareTo (data.get (i + 1)) > 0)
                    {
                        // Swicthes the two Strings if they are not in alphabetical order
                        temp = data.get (i);
                        data.set (i, data.get (i + 1));
                        data.set (i + 1, temp);
                    }
                }
            }
        }

        // Returns the ArrayList sorted
        return data;
    }
}