package BehavioralPatterns.Iterator.example0;

import java.util.NoSuchElementException;

/**
 * ConcreteAggregate.
 * Here, implements an array structure and exposes a ConcreteIterator which deals with traversing the aggregate.
 * Remember : Concrete aggregates can implement internally different structures, but expose the concrete iterator, which deals with traversing the aggregates.
 *
 * Note : For simplicity, methods such as add() remove() addAll(), ... have not been implemented to focus deeply on the iterator pattern.
 *
 * @author Alice B.
 * @version 10/03/2021
 */
public class StringArray implements Aggregate<String>{
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
     * Values setter.
     *
     * @param values The values to be stored.
     */
    public void setValues(String[] values) {
        this.values = values;
    }

    /**
     * To get the iterator of the aggregate.
     *
     * @return The aggregate's iterator.
     */
    @Override
    public Iterator<String> iterator() {
        return new StringArrayIterator();
    }

    /**
     * ConcreteIterator.
     * Deals with a specific concrete aggregate class (here StringArray).
     * Remember : For each concrete aggregate, we should implement a ConcreteIterator.
     * Nesting the ConcreteIterator class in the ConcreteAggregate class is the best option because the iterator needs access
     * to the internal variables of the aggregator.
     *
     * @author Alice B.
     * @version 11/03/2021
     */
    private class StringArrayIterator implements Iterator<String> {
        /** Index. */
        private int position;

        /**
         * To know if there's a next item to be returned or not.
         * Note : the hasNext() method should always be called before calling the next() method.
         *
         * @return true if there's a next item to be returned, false otherwise.
         */
        @Override
        public boolean hasNext() {
            return this.position < values.length;
        }

        /**
         * To get the next item.
         *
         * @return The next String item.
         * @throws NoSuchElementException An exception occurred... Didn't you nest the next() call into a while(iterator.hasNext()) ?...
         */
        @Override
        public String next() throws NoSuchElementException {
            if(this.hasNext()) {
                return values[position++];
            }
            throw new NoSuchElementException();
        }
    }
}
