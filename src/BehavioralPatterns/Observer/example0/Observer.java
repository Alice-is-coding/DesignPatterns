package BehavioralPatterns.Observer.example0;

// Note that I didn't extend the java.util.Observer because it has been deprecated since java 9.

/**
 * Observer.
 * Should be implemented by the objects that would like to be updated by the changes in the Subject.
 *
 * @author Alice B.
 * @version 23/2021
 */
public interface Observer{
    /**
     * To update the observer accordingly to the changes occurred in the Subject.
     *
     * @param observable The ConcreteSubject whose state changed.
     * @param args Arguments following the changes (Changes themselves or others).
     */
    void update(Subject observable, Object args);
}
