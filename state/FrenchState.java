import java.util.ArrayList;

/**
 * The french language state
 * @author Andrew Paulen
 */
public class FrenchState implements State
{
    private MusicBox box;

    /**
     * Puts the music box into the french language state
     * @param box The music box that is playing the songs
     */
    public FrenchState (MusicBox box)
    {
        this.box = box;
    }

    /**
     * Creates an ArrayList of the lyrics to "twinkle twinkle little star" in french
     * Calls the method that will play the ArrayList of lyrics
     */
    public void pressStarButton()
    {
        String songName = "Petite étoile scintillante scintillante";
        ArrayList <String> lyrics = new ArrayList <String>();

        lyrics.add ("Scintille, scintille, petite étoile,");
        lyrics.add ("Comment je me demande ce que vous êtes!");
        lyrics.add ("Au-dessus du monde si haut,");
        lyrics.add ("Comme un diamant dans le ciel.");
        lyrics.add ("Scintille, scintille, petite étoile,");
        lyrics.add ("Comment je me demande ce que vous êtes!");

        box.playSong (songName, lyrics);
    }

    /**
     * Creates an ArrayList of the lyrics to "if you're happy and you know it" in french
     * Calls the method that will play the ArrayList of lyrics
     */
    public void pressHappyButton()
    {
        String songName = "Si tu es content et que tu le sais";
        ArrayList <String> lyrics = new ArrayList <String>();

        lyrics.add ("Si tu es heureux et que tu le sais, tape dans tes mains");
        lyrics.add ("Si tu es heureux et que tu le sais, tape dans tes mains");
        lyrics.add ("Si tu es content et que tu le sais");
        lyrics.add ("Et tu veux vraiment le montrer");
        lyrics.add ("Si tu es heureux et que tu le sais, tape dans tes mains");

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
     * Displays that the state is already french
     */
    public void pressFrenchButton()
    {
        System.out.println ("You are already in French mode");
    }

    /**
     * Changes the state of the music box to the spanish language
     */
    public void pressSpanishButton()
    {
        box.setState (box.getSpanishState());
    }
}