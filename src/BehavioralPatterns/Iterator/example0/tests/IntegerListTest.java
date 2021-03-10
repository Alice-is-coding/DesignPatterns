package BehavioralPatterns.Iterator.example0.tests;

import BehavioralPatterns.Iterator.example0.IntegerList;
import BehavioralPatterns.Iterator.example0.Iterator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class IntegerListTest {
    private List<Integer> list;
    private IntegerList integerList;

    @BeforeEach
    void setUp() {
        integerList = new IntegerList(null);
    }

    @Test
    void iterator() {
        int count = 0;
        list = new LinkedList<>(Arrays.asList(189, 100, 1, 0, 23, 78, 15469));
        integerList.setList(list);
        for(Iterator<Integer> itr = integerList.iterator(); itr.hasNext();) {
            assertEquals(list.get(count), itr.next());
            count++;
        }
        count = 0;
        list.addAll(Arrays.asList(15, 150, 1, 9, 7));
        for(Iterator<Integer> itr = integerList.iterator(); itr.hasNext();) {
            assertEquals(list.get(count), itr.next());
            count++;
        }
    }
}