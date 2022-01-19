/*
 * Written by Andrew Paulen
 */

package observer;

// Interface for the subject to implement and the methods it needs to implement 
public interface Subject 
{
    public void registerObserver (Observer observer);

    public void removeObserver (Observer observer);

    public void notifyObserver();
}