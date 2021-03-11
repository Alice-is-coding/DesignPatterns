package BehavioralPatterns.Iterator.example0;

/**
 * Aggregate.
 * Should be implemented by all the classes that can be traversed by an iterator.
 * Corresponds to the java.util.Iterable interface.
 *
 * @author Alice B.
 * @version 10/03/2021
 *
 * @param <T> Generic type of Aggregate.
 */
public interface Aggregate<T> {
    /**
     * To return the aggregate's iterator.
     *
     * @return The aggregate's iterator.
     */
    Iterator<T> iterator();
}
