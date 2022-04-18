import java.util.HashMap;

/**
 * A Juke Box object
 * @author Andrew Paulen
 */
public class JukeBox 
{
    private HashMap <String, Song> songs;
    private int currentSong;

    /**
     * Creates the Juke Box so it can be used 
     */
    public JukeBox()
    {
        songs = new HashMap <String, Song>();
    }

    /**
     * Adds a song to the Hash Map of songs giving the program the ability to search for
     * A song based on the name of the song
     * @param song A song object
     */
    public void addSong (Song song)
    {
        songs.put (song.getTitle(), song);
    }

    /**
     * As long as the song is in the Hash Map it will search and play the song
     * @param songName The name of the song 
     */
    public void play (String songName)
    {
        if (songs.containsKey (songName))
            System.out.println (songs.get(songName).toString());

        else 
            System.out.println ("Sorry but it looks like we don't have that song!");
    }
}