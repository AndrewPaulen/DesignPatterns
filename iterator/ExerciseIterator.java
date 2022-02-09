import java.util.Iterator;

/**
 * An Exercise Iterator
 * @author Andrew Paulen
 */
public class ExerciseIterator implements Iterator
{
    private Exercise [] exercises;
    private int position = 0;

    /**
     * Creates the exercise iterator with a passed Exercise array
     * @param Exercises An array of exercises
     */
    public ExerciseIterator (Exercise [] exercises)
    {
        this.exercises = exercises;
    }

    /**
     * Checks to see if the array of exercises has an exercise after the current exercise
     * @return A boolean value, true if the array has more values and false if there is nothing else
     */
    public boolean hasNext()
    {
        return position < exercises.length && exercises [position] != null;
    }

    /**
     * Gives the next value in the array of exercises but first check if there are more exercises
     * @return An exericse if there is one, null if not
     */
    public Exercise next()
    {
        if (hasNext() == false)
            return null;

        Exercise exercise = exercises [position];
        position++;
        return exercise;
    }
}