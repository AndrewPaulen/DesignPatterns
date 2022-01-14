/*
* Written by Andrew Paulen
*/

package strategy;
import java.util.ArrayList;

// Implments interface SortBehavior
public class InsertionSort implements SortBehavior
{
    public ArrayList <String> sort (ArrayList <String> data)
    {
        /* Original code devloped by David Landup, found on Stack Abuse, alterations made to fit code
        https://stackabuse.com/insertion-sort-in-java/ */

        // Repeats until the end of the ArrayList is reached
        for (int j = 1; j < data.size(); j++) 
        {
            // Set attributes that will be needed
            String current = data.get (j);
            int i = j - 1;

            // Repeats until the current value is where it needs to be alphabetically 
            while ((i > -1) && ((data.get (i).compareTo (current)) > 0)) 
            {
                data.set (i + 1, data.get (i));
                i--;
            }

            data.set (i + 1, current);
        }

        //Returns the ArrayList sorted alphabetically 
        return data;
    }
}