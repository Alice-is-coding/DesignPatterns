package BehavioralPatterns.Iterator.example1;

import java.util.Iterator;
import java.util.List;

/**
 * ConcreteAggregate.
 * Here : We implement the java.util.Iterable (Good practice).
 * (If we wanted to go farther into the structure implementation, we could implement java.util.Collection instead,
 * which is an interface that extends the java.util.Iterable interface).
 *
 * @author Alice B.
 * @version 11/03/2021
 */
public class IntegerList implements Iterable<Integer>{
    /** The structure internally implemented (not directly exposed).*/
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
     * Note : Here, we decided to return directly the List ConcreteIterator instead of implementing a private ConcreteIterator class as in example0.
     * In example0 is said that for each ConcreteAggregate it should be implemented a ConcreteIterator which is true -> here we directly
     * return the iterator of the List aggregate as the java.util.List is an interface that extends the java.util.Collection interface
     * which extends the java.util.Iterable interface (because a list is, in itself, already an aggregate, so we gain some little time).
     *
     * @return The iterator of the aggregate.
     */
    @Override
    public Iterator<Integer> iterator() {
        return list.iterator();
    }
}
