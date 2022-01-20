package observer;

/**
 * Establishes the methods that need to be implemented within the subject
 * @author Andrew Paulen
 */
public interface Subject 
{
    public void registerObserver (Observer observer);

    public void removeObserver (Observer observer);

    public void notifyObserver();
}