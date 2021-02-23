package BehavioralPatterns.Interpreter.example0;

import java.util.Iterator;

/**
 * Context interface.
 * Contains all the information that needs to be accessible by all the Interpreters.
 *
 * @author Alice B.
 * @version 23/02/2021
 */
public interface Context extends Iterable<String> {
    /**
     * To read some information at a certain address.
     *
     * @param address The address where the info is stored.
     * @return The corresponding information.
     */
    Float read(String address);

    /**
     * To write some information at a certain address.
     *
     * @param address The address from which the info will be accessible.
     * @param value The information to be stored.
     */
    void write(String address, Float value);

    /**
     * To iterate through the context.
     *
     * @return An iterator.
     */
    Iterator<String> iterator();
}
