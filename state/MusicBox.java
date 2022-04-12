import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/**
 * A music box that plays songs 
 * @author Andrew Paulen
 */
public class MusicBox 
{
    private State englishState;
    private State frenchState;
    private State spanishState;
    private State state;

    /**
     * Creates the language states that the music box can use
     */
    public MusicBox()
    {
        System.out.println ("Creating Our Music Box");
        System.out.println ("Starting up the Music Box");

        englishState = new EnglishState (this);
        frenchState = new FrenchState (this);
        spanishState = new SpanishState (this);
        this.state = englishState;
    }

    /**
     * Calls the pressStarButton method in the correct language state
     */
    public void pressStarButton()
    {
        state.pressStarButton();
    }

    /**
     * Calls the pressHappyButton method in the correct language state
     */
    public void pressHappyButton()
    {
        state.pressHappyButton();
    }

    /**
     * Calls the pressEnglishButton method in the correct language state
     */
    public void pressEnglishButton()
    {
        System.out.println ("Switching to English");
        state.pressEnglishButton();
    }

    /**
     * Calls the pressFrenchButton method in the correct language state
     */
    public void pressFrenchButton()
    {
        System.out.println ("Switching to French");
        state.pressFrenchButton();
    }

    /**
     * Calls the pressSpanishButton method in the correct language state
     */
    public void pressSpanishButton()
    {
        System.out.println ("Switching to Spanish");
        state.pressSpanishButton();
    }

    /**
     * Sets the state of the music box to the passed language state
     * @param state The language state that the user wants to use
     */
    public void setState (State state)
    {
        this.state = state;
    }

    /**
     * Returns the english language state that can be used
     * @return The english language state
     */
    public State getEnglishState()
    {
        return englishState;
    }

    /**
     * Returns the french language state that can be used
     * @return The french language state
     */
    public State getFrenchState()
    {
        return frenchState;
    }

    /**
     * Returns the spanish language state that can be used
     * @return The spanish language state
     */
    public State getSpanishState()
    {
        return spanishState;
    }

    /**
     * Displays the song to the console in the appropriate language
     * @param songName The name of the song being displayed
     * @param lyrics The lyrics of the song being displayed 
     */
    public void playSong (String songName, ArrayList <String> lyrics)
    {
        System.out.println ("\nPlaying: " + songName);
        for (String line : lyrics)
        {
            System.out.println (line);

            try
            {
                TimeUnit.SECONDS.sleep (1);
            }

            catch (InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println();
    }
}