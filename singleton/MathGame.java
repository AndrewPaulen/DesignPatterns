import java.util.Random;
import java.util.Scanner;

/**
 * A Math Game
 * @author Andrew Paulen
 */
public class MathGame 
{
    private static MathGame mathGame;
    private int score;
    private Random rand;
    private Scanner reader;
    private String [] operands = {"+", "-", "*", "/"};

    /**
     * Creates a Math Game
     */
    private MathGame()
    {
        rand = new Random();
        reader = new Scanner (System.in);
        score = 0;
        System.out.println ("Let's have fun with Math!");
    }

    /**
     * Get the current instance of Math Game
     * @return The current instance of MathGame if one exists, will create one if one does not exist
     */
    public static MathGame getInstance()
    {
        if (mathGame == null)
            mathGame = new MathGame();

        return mathGame;
    }

    /**
     * Plays the game for as long as the user wants to 
     */
    public void play()
    {
        boolean keepPlaying = true;

        while (keepPlaying)
        {
            boolean inputValid = false;

            while (!inputValid)
            {
                System.out.print ("(P)lay or (Q)uit: ");
                String input = reader.nextLine();
                
                if (input.equalsIgnoreCase ("p"))
                {
                    inputValid = true;
                    boolean outcome = playRound();

                    if (outcome)
                        score++;
                }

                else if (input.equalsIgnoreCase ("q"))
                {
                    inputValid = true;
                    System.out.println ("You won " + score + " games!\nGoodbye");
                    keepPlaying = false;
                }

                else
                {
                    System.out.println ("Sorry, you must enter p or q");
                }
            }
        }
    }

    /**
     * Plays a round of the game, asking the math question and displaying right or wrong
     * @return If the user gets the question right returns true, if the user got it wrong returns false
     */
    private boolean playRound()
    {
        System.out.println();
        int randNum1 = rand.nextInt (100) + 1;
        int randNum2 = rand.nextInt (100) + 1;
        int operandNumber = rand.nextInt (4);
        String operand = operands [operandNumber];
        double answer = 0;

        if (operandNumber == 0)
            answer = (double) randNum1 + (double) randNum2;

        if (operandNumber == 1)
            answer = (double) randNum1 - (double) randNum2;

        if (operandNumber == 2)
            answer = (double) randNum1 * (double) randNum2;

        if (operandNumber == 3)
            answer = (double) randNum1 / (double) randNum2;

        answer = Math.round (answer * 10) / 10.0;

        System.out.println ("Round your answer to 1 decimal place");
        System.out.print (randNum1 + " " + operand + " " + randNum2 + " = ");
        double input = reader.nextDouble();
        reader.nextLine();

        if (answer == input)
        {
            System.out.println ("You got it!");
            return true;
        }

        System.out.println ("The correct answer is: " + answer);
        return false;
    }
}