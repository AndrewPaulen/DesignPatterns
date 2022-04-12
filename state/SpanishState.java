import java.util.ArrayList;

/**
 * The spanish language state
 * @author Andrew Paulen
 */
public class SpanishState implements State
{
    private MusicBox box;

    /**
     * Puts the music box into the spanish language state
     * @param box The music box that is playing the songs
     */
    public SpanishState (MusicBox box)
    {
        this.box = box;
    }

    /**
     * Creates an ArrayList of the lyrics to "twinkle twinkle little star" in spanish
     * Calls the method that will play the ArrayList of lyrics
     */
    public void pressStarButton()
    {
        String songName = "Brilla brilla pequeña estrella";
        ArrayList <String> lyrics = new ArrayList <String>();

        lyrics.add ("Brilla brilla pequeña estrella,");
        lyrics.add ("¡Cómo me pregunto lo que eres!");
        lyrics.add ("Por encima del mundo tan arriba,");
        lyrics.add ("Como un diamante en el cielo.");
        lyrics.add ("Brilla brilla pequeña estrella,");
        lyrics.add ("¡Cómo me pregunto qué eres!");

        box.playSong (songName, lyrics);
    }

    /**
     * Creates an ArrayList of the lyrics to "if you're happy and you know it" in spanish
     * Calls the method that will play the ArrayList of lyrics
     */
    public void pressHappyButton()
    {
        String songName = "Si estás contento y lo sabes";
        ArrayList <String> lyrics = new ArrayList <String>();

        lyrics.add ("Si eres feliz y lo sabes aplaude");
        lyrics.add ("Si eres feliz y lo sabes aplaude");
        lyrics.add ("si estás contento y lo sabes");
        lyrics.add ("Y realmente quieres mostrarlo");
        lyrics.add ("Si eres feliz y lo sabes aplaude");

        box.playSong (songName, lyrics);
    }

    /**
     * Changes the state of the music box to the english language
     */
    public void pressEnglishButton()
    {
        box.setState (box.getEnglishState());
    }

    /**
     * Changes the state of the music box to the french language 
     */
    public void pressFrenchButton()
    {
        box.setState (box.getFrenchState());
    }

    /**
     * Displays that the state is already spanish 
     */
    public void pressSpanishButton()
    {
        System.out.println ("You are already in Spanish mode");
    } 
}