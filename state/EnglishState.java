import java.util.ArrayList;

/**
 * The english language state
 * @author Andrew Paulen
 */
public class EnglishState implements State
{
    private MusicBox box;

    /**
     * Puts the music box into the english language state
     * @param box The music box that is playing the songs
     */
    public EnglishState (MusicBox box)
    {
        this.box = box;
    }

    /**
     * Creates an ArrayList of the lyrics to "twinkle twinkle little star" in english
     * Calls the method that will play the ArrayList of lyrics
     */
    public void pressStarButton()
    {
        String songName = "Twinkle Twinkle Little Star";
        ArrayList <String> lyrics = new ArrayList <String>();

        lyrics.add ("Twinkle, twinkle, little star,");
        lyrics.add ("How I wonder what you are!");
        lyrics.add ("Up above the world so high,");
        lyrics.add ("Like a diamond in the sky.");
        lyrics.add ("Twinkle, twinkle, little star,");
        lyrics.add ("How I wonder what ou are!");

        box.playSong (songName, lyrics);
    }

    /**
     * Creates an ArrayList of the lyrics to "if you're happy and you know it" in english
     * Calls the method that will play the ArrayList of lyrics
     */
    public void pressHappyButton()
    {
        String songName = "If You're Happy and You Know It";
        ArrayList <String> lyrics = new ArrayList <String>();

        lyrics.add ("If you're happy and you know it clap your hands");
        lyrics.add ("If you're happy and you know it clap your hands");
        lyrics.add ("If you're happy and you know it");
        lyrics.add ("And you really want to show it");
        lyrics.add ("If you're happy and you know it clap your hands");

        box.playSong (songName, lyrics);
    }

    /**
     * Displays that the state is already english
     */
    public void pressEnglishButton()
    {
        System.out.println ("You are already in English mode");
    }

    /**
     * Changes the state of the music box to the french language 
     */
    public void pressFrenchButton()
    {
        box.setState (box.getFrenchState());
    }

    /**
     * Changes the state of the music box to the spanish language
     */
    public void pressSpanishButton()
    {
        box.setState (box.getSpanishState());
    }
}