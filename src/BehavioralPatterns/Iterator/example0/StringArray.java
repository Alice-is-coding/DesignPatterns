package BehavioralPatterns.Iterator.example0;

import java.util.NoSuchElementException;

public class StringArray implements Aggregate<String>{
    private String[] values;

    public StringArray(String[] values) {
        this.values = values;
    }

    public void setValues(String[] values) {
        this.values = values;
    }

    @Override
    public Iterator<String> iterator() {
        return new StringArrayIterator();
    }

    private class StringArrayIterator implements Iterator<String> {
        private int position;

        @Override
        public boolean hasNext() {
            return this.position < values.length;
        }

        @Override
        public String next() throws NoSuchElementException {
            if(this.hasNext()) {
                return values[position++];
            }
            throw new NoSuchElementException();
        }
    }
}
