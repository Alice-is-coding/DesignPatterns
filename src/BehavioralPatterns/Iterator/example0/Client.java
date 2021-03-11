package BehavioralPatterns.Iterator.example0;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Client.
 * Uses ConcreteAggregate classes and iterate through them thanks to their respective iterator.
 *
 * @author Alice B.
 * @version 11/03/2021
 */
public class Client {
    public static void main(String[] args) {
        String[] values = {"Hello", "world", "!"};
        Aggregate<String> stringArray = new StringArray(values);

        for(Iterator<String> itr = stringArray.iterator(); itr.hasNext();) {
            System.out.println(itr.next());
        }

        List<Integer> list = new LinkedList<>(Arrays.asList(56, 145, 1, 178, 1988, 1234, 7894));
        Aggregate<Integer> integerList = new IntegerList(list);

        for(Iterator<Integer> itr = integerList.iterator(); itr.hasNext();) {
            System.out.println(itr.next());
        }
    }
}
