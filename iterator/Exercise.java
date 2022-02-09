import java.util.ArrayList;

/**
 * An Exercise 
 * @author Andrew Paulen
 */
public class Exercise 
{
    private String title;
    private ArrayList <String> targetMuscles;
    private ArrayList <String> directions;
    private String makePretty = "...";

    /**
     * Creates an exercise with only a passed title
     * @param title The title of the exercise 
     */
    public Exercise (String title)
    {
        this.title = title;
    }

    /**
     * Creates an exercise with a passed title, target muscles, and directions
     * @param title The title of the exercise
     * @param targetMuscles An ArrayList of target muscles for the exercise
     * @param directions An ArrayList of directions for the exercise
     */
    public Exercise (String title, ArrayList <String> targetMuscles, ArrayList <String> directions)
    {
        this.title = title;
        this.targetMuscles = targetMuscles;
        this.directions = directions;
    }

    /**
     * Add a target muscle to its ArrayList
     * @param muscle The name of the muscle 
     */
    public void addTargetMuscle (String muscle)
    {
        targetMuscles.add (muscle);
    }

    /**
     * Remove a target muscle from its ArrayList
     * @param muscle The name of the muscle
     */
    public void removeTargetMuscle (String muscle)
    {
        targetMuscles.remove (muscle);
    }

    /**
     * Puts all of the exercise information into a string 
     * @return A string with all of the exercise information in it
     */
    public String toString()
    {
        String format = "";

        format = format + ("\n" + makePretty + " " + title + " " + makePretty + "\n");
        format = format + ("Muscles: ");

        for (int slot = 0; slot < targetMuscles.size(); slot++)
        {
            if (slot == targetMuscles.size() - 1)
                format = format + (targetMuscles.get (slot));

            else
                format = format + (targetMuscles.get (slot) + ", ");
        }

        format = format + ("\nExercises: \n");

        for (String direction : directions)
            format = format + ("- " + direction + "\n");

        return format;
    }
}