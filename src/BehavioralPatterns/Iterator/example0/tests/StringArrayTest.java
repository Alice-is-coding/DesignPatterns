package BehavioralPatterns.Iterator.example0.tests;

import BehavioralPatterns.Iterator.example0.Iterator;
import BehavioralPatterns.Iterator.example0.StringArray;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class StringArrayTest {
    private String[] values;
    private StringArray stringArray;

    @BeforeEach
    void setUp() {
        stringArray = new StringArray(null);
    }

    @Test
    void iterator() {
        int count = 0;
        values = new String[]{"a", "b", "c", "hello", "goodbye", "test", "enjoy", "coding"};
        stringArray.setValues(values);
        for(Iterator<String> itr = stringArray.iterator(); itr.hasNext();) {
            assertEquals(values[count], itr.next());
            count++;
        }
        count = 0;
        for(int i = 0; i < 8 - 1; i++) {
            values[i] = values[i + 1];
        }
        for(Iterator<String> itr = stringArray.iterator(); itr.hasNext();) {
            assertEquals(values[count], itr.next());
            count++;
        }
    }
}