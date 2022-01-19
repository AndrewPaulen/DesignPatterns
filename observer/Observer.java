/* 
 * Written by Andrew Paulen
 */

package observer;
import java.util.HashMap;

// Interface for the observer to implement and the methods it needs to implement 
public interface Observer 
{
    public void update (HashMap <String, Integer> votes);
}