package BehavioralPatterns.Iterator.example0;

import java.util.List;
import java.util.NoSuchElementException;

/**
 * ConcreteAggregate.
 * Here, implements a list structure and exposes a ConcreteIterator which deals with traversing the aggregate.
 * Remember : Concrete aggregates can implement internally different structures, but expose the concrete iterator, which deals with traversing the aggregates.
 *
 * Note : For simplicity, methods such as add() remove() addAll(), ... have not been implemented to focus deeply on the iterator pattern.
 *
 * @author Alice B.
 * @version 10/03/2021
 */
public class IntegerList implements Aggregate<Integer>{
    /** The structure internally implemented (not directly exposed). */
    private List<Integer> list;

    /**
     * Constructor.
     *
     * @param list The list to be stored.
     */
    public IntegerList(List<Integer> list) {
        this.list = list;
    }

    /**
     * To get the iterator of the aggregate.
     *
     * @return The aggregator's iterator.
     */
    @Override
    public Iterator<Integer> iterator() {
        return new IntegerListIterator();
    }

    /**
     * List setter.
     *
     * @param list The list to be stored.
     */
    public void setList(List<Integer> list) {
        this.list = list;
    }

    /**
     * ConcreteIterator.
     * Deals with a specific concrete aggregate class (here IntegerList).
     * Remember : For each concrete aggregate, we should implement a ConcreteIterator.
     * Nesting the ConcreteIterator class in the ConcreteAggregate class is the best option because the iterator needs access
     * to the internal variables of the aggregator.
     *
     * @author Alice B.
     * @version 11/03/2021
     */
    private class IntegerListIterator implements Iterator<Integer> {
        /** Index. */
        private int position;

        /**
         * To know if there's a next item to be returned or not.
         * Note : The hasNext() method should always be called before calling the next() method.
         *
         * @return true if there's a next item to be returned, false otherwise.
         */
        @Override
        public boolean hasNext() {
            return this.position < list.size();
        }

        /**
         * To get the next item.
         *
         * @return The next Integer item.
         * @throws NoSuchElementException An exception occurred... Didn't you nest the next() call into a while(iterator.hasNext()) ?...
         */
        @Override
        public Integer next() throws NoSuchElementException {
            if(this.hasNext()) {
                return list.get(position++);
            }
            throw new NoSuchElementException();
        }
    }
}
