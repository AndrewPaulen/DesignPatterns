/**
 * An Oldie song, formatted differently from a regular song
 * @author Andrew Paulen
 */
public class Oldie implements Tune
{
    private String artistName;
    private String songTitle;
    private String recordTitle;
    private String category;

    /**
     * Creates an Oldie song with the given information
     * @param artistName The artist name of the song
     * @param songTitle The title of the song
     * @param recordTitle The title of the record that the song is on
     * @param category The category of the song
     */
    public Oldie (String artistName, String songTitle, String recordTitle, String category)
    {
        this.artistName = artistName;
        this.songTitle = songTitle;
        this.recordTitle = recordTitle;
        this.category = category;
    }

    /**
     * Returns the name of the artist
     * @return The artists name
     */
    public String getArtistName()
    {
        return artistName;
    }

    /**
     * Returns the name of the song and record in a specific format
     * @return The song and record name
     */
    public String getDisplayTitle()
    {
        return (songTitle + " : " + recordTitle);
    }

    /**
     * Returns the category that the song falls into
     * @return The category name
     */
    public String getCategory()
    {
        return category;
    }
}