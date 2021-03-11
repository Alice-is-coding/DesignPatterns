package BehavioralPatterns.Iterator.example1.tests;

import BehavioralPatterns.Iterator.example1.StringArray;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * StringArrayTest.
 *
 * @author Alice B.
 * @version 11/03/2021
 */
class StringArrayTest {
    private String[] values;
    private StringArray stringArray;

    @BeforeEach
    void setUp() {
        values = new String[]{"Hello", "World", "!", "How", "are", "you", "?", ":)"};
        stringArray = new StringArray(values);
    }

    @Test
    void iterator() {
        int count = 0;
        for(String string : stringArray) {
            assertEquals(values[count], string);
            count++;
        }
        count = 0;
        for(int i = 0; i < values.length - 1; i++) {
            values[i] = values[i + 1];
        }
        for(String string : stringArray) {
            assertEquals(values[count], string);
            count++;
        }
    }
}