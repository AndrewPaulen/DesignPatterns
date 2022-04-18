/**
 * A track
 * @author Andrew Paulen
 */
public class Track extends Song
{
    private String title;
    private String album;
    private String firstName;
    private String lastName;
    private Genre genre;   
    
    /**
     * Creates a track with the given info
     * @param title The title of the song
     * @param album The album the song is on
     * @param firstName The first name of the artist
     * @param lastName The last name of the artist
     * @param genre The genre of the song
     */
    public Track (String title, String album, String firstName, String lastName, Genre genre)
    {
        this.title = title;
        this.album = album;
        this.firstName = firstName;
        this.lastName = lastName;
        this.genre = genre;
    }

    /**
     * Returns the title of the song
     * @return The song title
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * Returns the name of the album the song is on
     * @return The name of the album
     */
    public String getAlbum()
    {
        return album;
    }

    /**
     * Returns the artists first name
     * @return The first name of the artist
     */
    public String getArtistFirstName()
    {
        return firstName;
    }

    /**
     * Returns the artists last name
     * @return The last name of the artist
     */
    public String getArtistLastName()
    {
        return lastName;
    }

    /**
     * Returns the genre of the song
     * @return The songs genre
     */
    public String getGenre()
    {
        switch (genre)
        {
            case ROCK:
                return "Rock";
            case POP:
                return "Pop";
            case HIPHOP: 
                return "HipHop";
            case JAZZ: 
                return "Jazz";
            case COUNTRY: 
                return "Country";
            case OTHER: 
                return "Other";
            default:
                return "Genre error";
        }   
    }
}