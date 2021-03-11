package BehavioralPatterns.Iterator.example1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * ConcreteAggregate.
 * Here : We implemented the java.util.Iterable (Good practice).
 * (If we wanted to go farther into the structure implementation, we could implement java.util.Collection instead;
 * which is an interface that extends the java.util.Iterable interface).
 *
 * @author Alice B.
 * @version 11/03/2021
 */
public class StringArray implements Iterable<String>{
    /** The structure internally implemented (not directly exposed). */
    private String[] values;

    /**
     * Constructor.
     *
     * @param values The values to be stored.
     */
    public StringArray(String[] values) {
        this.values = values;
    }

    /**
     * To get the iterator of the aggregate.
     * Note : Here, we deciding to return a ConcreteIterator implemented as a nested private class, but we also could
     * simply return values.stream.iterator() without creating a dedicated ConcreteIterator class because it's already been taken care of by the String[] structure.
     * @return
     */
    @Override
    public Iterator<String> iterator() {
        return new StringArrayIterator();
    }

    /**
     * ConcreteIterator.
     * Deals with a specific concrete aggregate class (here StringArray).
     *
     * @author Alice B.
     * @version 11/03/2021
     */
    private class StringArrayIterator implements Iterator<String> {
        /** We also could manage an index property as in example0. */
        private Iterator<String> iterator;

        /**
         * Constructor.
         */
        private StringArrayIterator() {
            iterator = Arrays.stream(values).iterator();
        }

        /**
         * To know if there's a next item to be returned or not.
         * Note : the hasNext() method should always be called before calling the next() method.
         *
         * @return true if there's a next item to be returned, false otherwise.
         */
        @Override
        public boolean hasNext() {
            return iterator.hasNext();
        }

        /**
         * To get the next item.
         *
         * @return The next String item.
         * @throws NoSuchElementException An exception occurred... Didn't you nest the next() call into a while(iterator.hasNext()) or simply used a foreach loop ?...
         */
        @Override
        public String next() throws NoSuchElementException {
            return iterator.next();
        }
    }
}
