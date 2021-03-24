package BehavioralPatterns.Observer.example0;


import java.util.LinkedList;
import java.util.List;

// Note that I didn't extend the java.util.Observable because it has been deprecated since java 9.

/**
 * Subject.
 *
 * Chose to declare it as an abstract class instead of an interface so that the ConcreteSubject classes haven't to manage
 * the list of observers which is, that way, accessible through the super class (Subject).
 *
 * @author Alice B.
 * @version 23/03/2021
 */
public abstract class Subject {
    /** The list of observers attached to this observable. Each one of them should be notified when the state changes. */
    protected List<Observer> observers;

    /**
     * Constructor.
     */
    protected Subject() {
        this.observers = new LinkedList<>();
    }

    /**
     * To attach a new observer to the list of observers in order for it to be notified when state changes.
     *
     * @param observer The ConcreteObserver to be attached to the list.
     * @return true if everything went ok, false otherwise.
     */
    public abstract boolean attach(Observer observer);

    /**
     * To attach an unlimited number of observers to the list of observers to notify.
     *
     * @param observers The ConcreteObserver objects to be attached to the list.
     * @return true if everything went ok, false otherwise.
     */
    public abstract boolean attachAll(Observer... observers);

    /**
     * To detach an observer from the list so that it won't be notified anymore.
     *
     * @param observer The ConcreteObserver to be detached from the list.
     * @return true if everything went ok, false otherwise.
     */
    public abstract boolean detach(Observer observer);

    /**
     * To detach an unlimited number of observers from the list of observers so that they won't be notified anymore.
     *
     * @param observers The ConcreteObserver objects to be detached from the list.
     * @return true if everything went ok, false otherwise.
     */
    public abstract boolean detachAll(Observer... observers);

    /** To notify the observers from the list (should be called when the state changed). */
    public abstract void notifyObservers();

    protected List<Observer> getObservers() {
        return this.observers;
    }
}
