package BehavioralPatterns.Interpreter.example0;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * ConcreteContext.
 * A map playing the role of a memory.
 *
 * @author Alice B.
 * @version 23/02/2021
 */
public class Memory implements Context {
    /** The map where all the information needed by interpreters is stored.. */
    private Map<String, Float> memory;

    /**
     * Constructor.
     */
    public Memory() {
        this.memory = new HashMap<>();
    }

    /**
     * To read some information at a certain address.
     *
     * @param address The address where the info is stored.
     * @return The corresponding information.
     */
    @Override
    public Float read(String address) {
        Float value = memory.get(address);
        if(value == null) {
            throw new RuntimeException("null value...");
        }
        return value;
    }

    /**
     * To write some information at a certain address.
     *
     * @param address The address from which the info will be accessible.
     * @param value The information to be stored.
     */
    @Override
    public void write(String address, Float value) {
        if(address == null) {
            throw new RuntimeException("Address cannot be null !");
        }
        if(value == null) {
            value = 0.F;
        }
        memory.put(address, value);
    }

    /**
     * To iterate through the memory.
     *
     * @return The iterator of the map (the memory).
     */
    @Override
    public Iterator<String> iterator() {
        return memory.keySet().iterator();
    }

    /**
     * To get an understandable view of the memory.
     *
     * @return Readable representation of the memory (the map).
     */
    @Override
    public String toString() {
        return this.memory.toString();
    }
}
