/**
 * Makes substitutions in the password
 * @author Andrew Paulen
 */
public class Symbols extends PasswordDecorator
{
    /**
     * Creates a new symbols password
     * @param passwordBeginning The current password
     */
    public Symbols (Password passwordBeginning)
    {
        super (passwordBeginning);
    }

    /**
     * Substitutes certain letters for symbols and returns the result
     */
    public String getPassword()
    {
        password = passwordBeginning.getPassword();

        password = password.replaceAll ("a", "@");
        password = password.replaceAll ("b", "8");
        password = password.replaceAll ("e", "3");
        password = password.replaceAll ("g", "9");
        password = password.replaceAll ("i", "!");
        password = password.replaceAll ("o", "0");
        password = password.replaceAll ("s", "\\$");
        password = password.replaceAll ("t", "7");

        return password;
    }
}