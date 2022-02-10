import java.util.ArrayList;
import java.util.Arrays;

/**
 * A PT
 * @author Andrew Paulen
 */
public class PT 
{
    private String firstName;
    private String lastName;
    private String bio;
    private Exercise [] exercises;
    private int numExercises;
    private int i;

    /**
     * Creates a PT with passed first and last name and bio, establishes the array of exercises 
     * @param firstName The first name of the physical trainer
     * @param lastName The last name of the physical trainer
     * @param bio The bio of the physcial trainer
     */
    public PT (String firstName, String lastName, String bio)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bio = bio;
        exercises = new Exercise [2];
        numExercises = 0;
    }

    /**
     * Adds an exercise to the array of exercises and if array is full, call to double the size
     * @param title The title of the exercise
     * @param muscleGroups An ArrayList of the muscle groups worked in the exercise
     * @param directions An ArrayList of the directions for the exercise 
     */
    public void addExercise (String title, ArrayList <String> muscleGroups, ArrayList <String> directions)
    {
        // Creates the exercise 
        Exercise exercise = new Exercise (title, muscleGroups, directions);

        // Cycles through the array looking for a spot to add the exercise
        for (int slot = 0; slot < exercises.length; slot++)
        {
            // Puts the exercise in the empty slot
            if (exercises [slot] == null)
            {
                exercises [slot] = exercise;
                break;
            }

            // If no empty slot, calls to double the size of the array
            if (slot == exercises.length - 1 && exercises [slot] != null)
                exercises = growArray (exercises);
        }

        numExercises++;
    }

    /**
     * Get the first name of the PT
     * @return The first name of the PT
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     * Get the last name of the PT
     * @return The last name of the PT
     */
    public String getLastName()
    {
        return lastName;
    }

    /**
     * Get the bio of the PT
     * @return The bio of the PT
     */
    public String getBio()
    {
        return bio;
    }

    /**
     * Doubles the size of the passed array and keeps the values already in the array
     * @param exercises The array of exercises
     * @return An array with the same values that is double the length
     */
    private Exercise [] growArray (Exercise [] exercises)
    {
       return exercises = Arrays.copyOf (exercises, exercises.length * 2);
    }

    /**
     * Creates an Exercise Iterator
     * @return The new Exercise Iterator 
     */
    public ExerciseIterator createIterator()
    {
        ExerciseIterator exerciseIterator = new ExerciseIterator (exercises);
        return exerciseIterator;
    }

    /**
     * Puts all of the PTs information into a String
     * @return A string with all of the PTs information in it
     */
    public String toString()
    {
        return (firstName + " " + lastName + "\n" + bio + "\n");
    }
}