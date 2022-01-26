import java.util.Random;

/**
 * Randomly makes certain letter upper case
 * @author Andrew Paulen
 */
public class RandomCasing extends PasswordDecorator
{
    /**
     * Creates a new RandomCasing password
     * @param passwordBeginning The current password 
     */
    public RandomCasing (Password passwordBeginning)
    {
        super (passwordBeginning);
    }

    /**
     * With a 50% chance turns letters into upper case versions of themselves and then returns the new password
     * Original code found on Stack Overflow, written by aioobe, modified to fit code
     * https://stackoverflow.com/questions/4993912/randomize-capital-letters
     */
    public String getPassword()
    {
        password = passwordBeginning.getPassword();

        Random random = new Random();
        StringBuilder sb = new StringBuilder (password.length());
    
        for (char c : password.toCharArray())
        {
            sb.append (random.nextBoolean()
                ? Character.toLowerCase (c)
                : Character.toUpperCase (c));
        }
    
        return sb.toString();
    }
}