/**
 * Creates a password begining 
 * @author Andrew Paulen
 */
public abstract class PasswordDecorator extends Password
{
    protected Password passwordBeginning;

    /**
     * Creates a new passwordBeginning
     * @param passwordBeginning The current password
     */
    public PasswordDecorator (Password passwordBeginning)
    {
        this.passwordBeginning = passwordBeginning;
    }

    public abstract String getPassword();
}