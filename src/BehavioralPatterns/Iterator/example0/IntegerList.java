package BehavioralPatterns.Iterator.example0;

import java.util.List;
import java.util.NoSuchElementException;

public class IntegerList implements Aggregate<Integer>{
    private List<Integer> list;

    public IntegerList(List<Integer> list) {
        this.list = list;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new IntegerListIterator();
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }

    private class IntegerListIterator implements Iterator<Integer> {
        private int position;

        @Override
        public boolean hasNext() {
            return this.position < list.size();
        }

        @Override
        public Integer next() throws NoSuchElementException {
            if(this.hasNext()) {
                return list.get(position++);
            }
            throw new NoSuchElementException();
        }
    }
}
