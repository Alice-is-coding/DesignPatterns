package BehavioralPatterns.Iterator.example1;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Client.
 * Deals with the ConcreteAggregate classes and iterate through them by using there respective iterator.
 *
 * @author Alice B.
 * @version 11/03/2021
 */
public class Client {
    public static void main(String[] args) {
        IntegerList integerList = new IntegerList(new LinkedList<>(Arrays.asList(150, 2, 3, 456, 789, 951, 357)));
        for (Integer integer : integerList) {
            System.out.println(integer);
        }
        StringArray stringArray = new StringArray(new String[]{"Hello", "World", "!", "How", "are", "you", "?"});
        for(String string : stringArray) {
            System.out.println(string);
        }
    }
}
