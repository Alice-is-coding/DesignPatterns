package BehavioralPatterns.Iterator.example0;

import java.util.NoSuchElementException;

public interface Iterator<E> {
    boolean hasNext();
    E next() throws NoSuchElementException;
}
