package BehavioralPatterns.Iterator.example0;

import java.util.NoSuchElementException;

/**
 * Iterator.
 * Defines the operations to traverse the aggregate object along with the one to return the object.
 * Corresponds to java.util.Iterator interface.
 *
 * @author Alice B.
 * @version 10/03/2021
 *
 * @param <E> Generic type of Iterator.
 */
public interface Iterator<E> {
    boolean hasNext();
    E next() throws NoSuchElementException;
}
