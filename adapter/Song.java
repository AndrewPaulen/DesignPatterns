/**
 * A song object
 * @author Andrew Paulen
 */
abstract class Song 
{
    public abstract String getTitle();
    public abstract String getAlbum();
    public abstract String getArtistFirstName();
    public abstract String getArtistLastName();
    public abstract String getGenre();

    /**
     * A method that returns all info in a specific format
     * @return All info on the song in a specific structure 
     */
    public String toString()
    {
        return (getTitle() + 
                "\nAlbum: " + getAlbum() +
                "\nBy: " + getArtistFirstName() + " " + getArtistLastName() +
                "\nGenre: " + getGenre() + "\n");
    }
}