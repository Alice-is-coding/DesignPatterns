package BehavioralPatterns.Iterator.example1.tests;

import BehavioralPatterns.Iterator.example1.IntegerList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * IntegerListTest.
 *
 * @author Alice B.
 * @version 11/03/2021
 */
class IntegerListTest {
    private List<Integer> list;
    private IntegerList integerList;

    @BeforeEach
    void setUp() {
        list = new LinkedList<>(Arrays.asList(150, 15, 156, 156, 951, 159, 753, 852, 456));
        integerList = new IntegerList(list);
    }

    @Test
    void iterator() {
        int count = 0;
        for(Integer integer : integerList) {
            assertEquals(list.get(count), integer);
            count++;
        }
        count = 0;
        list.addAll(Arrays.asList(625123, 1155884455));
        for(Integer integer : integerList) {
            assertEquals(list.get(count), integer);
            count++;
        }
    }
}