/* 
 * Written by Andrew Paulen
 */

package observer;
import java.util.HashMap;

public interface Observer 
{
    public void update (HashMap <String, Integer> votes);
}