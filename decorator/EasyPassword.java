/**
 * Takes the phrase passed in then gets rid of all spaces and adds a number to the end
 * @author Andrew Paulen
 */
public class EasyPassword extends Password
{
    /**
     * Constructor that sets the password equal to the phrase passed in
     * @param phrase Phrase to be modified
     */
    public EasyPassword (String phrase)
    {
        this.password = phrase;
        password = password.replaceAll ("\\s", "");
        password = password + (int) (Math.random() * 100);
    }

    /**
     * Gets rid of all spaces in the phrase and adds a random number to the end of the phrase
     * @return The new password
     */
    public String getPassword()
    {
        return password;
    }
}