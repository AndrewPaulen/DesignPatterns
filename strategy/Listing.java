/*
* Written by Andrew Paulen
*/ 

package strategy;
import java.util.ArrayList;

public class Listing 
{
    // Attributes
    private String title;
    private ArrayList <String> items;
    SortBehavior sortBehavior;

    // Constructor
    /* Sets title according to title given, constructs the ArrayList, and sets BubbleSort as default sorting method 
    (code will not run if SortBehavior is null and no where in the driver is the sorting method set for the first list) */
    public Listing (String title)
    {
        this.title = title;
        items = new ArrayList <String> ();
        sortBehavior = new BubbleSort();
    }

   // Methods
   // Adds item to the list 
    public void add (String item)
    {
        items.add (item);
    }

    // Removes item from the list
    public void remove (String item)
    {
        items.remove (item);
    }

    // Returns the title of the list
    public String getTitle()
    {
        return title;
    }

    // Sets the way that the list of items will be sorted 
    public void setSortBehavior (SortBehavior sortBehavior)
    {
        this.sortBehavior = sortBehavior;
    }

    // Returns the list using the sort behavior 
    public ArrayList <String> getSortedList()
    {
        sortBehavior.sort (items);
        return items;
    }

    // Returns the list in its unsorted form 
    public ArrayList <String> getUnSortedList()
    {
        return items;
    }
}