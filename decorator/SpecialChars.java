/**
 * Adds special characters to the password
 * @author Andrew Paulen
 */
public class SpecialChars extends PasswordDecorator
{
    /**
     * Creates a new SpecialChars password
     * @param passwordBeginning The current password
     */
    public SpecialChars (Password passwordBeginning)
    {
        super (passwordBeginning);
    }

    /**
     * With a 30% chance adds certain special characters with a random chance throughout the password then returns the new password
     */
    public String getPassword()
    {
        password = passwordBeginning.getPassword();

        for (int x = 0; x < password.length(); x++)
        {
            double chance = (Math.random() * 10);

            if (chance <= 3)
            {
                int specialChar = (int) (Math.random() * 7) + 1;
                String theChar = "";

                switch (specialChar)
                {
                    case 1: 
                        theChar = "*";
                        break;
                    case 2:
                        theChar = "!";
                        break;
                    case 3:
                        theChar = "%";
                        break;
                    case 4:
                        theChar = "+";
                        break;
                    case 5:
                        theChar = ".";
                        break;
                    case 6:
                        theChar = "{";
                        break;
                    case 7:
                        theChar = "}";
                        break;
                }

                password = password.substring (0, x + 1) + theChar + password.substring (x + 1, password.length());
                x++;
            }
        }

        return password;
    }
}