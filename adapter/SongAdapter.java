/**
 * The song adapter 
 * @author Andrew Paulen
 */
public class SongAdapter extends Song
{
    private Tune tune;

    /**
     * Creates the song adapter
     * @param tune The tune the adapter alters
     */
    public SongAdapter (Tune tune)
    {
        this.tune = tune;
    }

    /**
     * Returns the name of the song
     * @return The title of the song
     */
    public String getTitle()
    {
        String displayTitle = tune.getDisplayTitle();
        return displayTitle.substring (0, displayTitle.indexOf (":") - 1);
    }

    /**
     * Returns the name of the album the song is on
     * @return The album of the song
     */
    public String getAlbum()
    {
        String displayTitle = tune.getDisplayTitle();
        return displayTitle.substring (displayTitle.indexOf(":") + 2);
    }

    /**
     * Returns the first name of the artist
     * @return The artist first name
     */
    public String getArtistFirstName()
    {
        String artistName = tune.getArtistName();
        return artistName.substring (0, artistName.indexOf (" "));
    }

    /**
     * Returns the last name of the artist
     * @return The artist last name
     */
    public String getArtistLastName()
    {
        String artistName = tune.getArtistName();
        return artistName.substring (artistName.indexOf (" ") + 1);
    }

    /**
     * Returns the genre that the song falls under
     * @return The genre of the song
     */
    public String getGenre()
    {
        String category = tune.getCategory();

        switch (category)
        {
            case "Country and Western":
                return "Country";
            case "R&B and Soul":
                return "Other";
            case "Easy Listening": 
                return "Other";
            case "Rock": 
                return "Rock";
            case "Classic Rock": 
                return "Rock";
            default:
                return "Genre error";
        }
    }
}
