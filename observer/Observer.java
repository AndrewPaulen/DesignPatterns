package observer;
import java.util.HashMap;

/**
 * Establishes the methods that need to be implemented within the observers
 * @author Andrew Paulen
 */
public interface Observer 
{
    public void update (HashMap <String, Integer> votes);
}