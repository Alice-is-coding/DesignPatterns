package BehavioralPatterns.Interpreter.example0.tests;

import BehavioralPatterns.Interpreter.example0.Context;
import BehavioralPatterns.Interpreter.example0.Memory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Alice B.
 * @version 23/02/2021
 */
class MemoryTest {
    private Context context;

    @BeforeEach
    void setUp() {
        context = new Memory();
        context.write("a", 7.F);
    }

    @Test
    void read() {
        assertEquals(7.F, context.read("a"), "The address doesn't return the value expected ?...");

        try{
            context.read("b");
            fail("An exception is expected ! 'b' isn't a valid address for now !");
        }catch (Exception e) {
            assertTrue(e instanceof RuntimeException);
        }

        context.write("b", 15.5F);
        assertEquals(7.F, context.read("a"), "The address doesn't return the value expected ?...");
        assertEquals(15.5F, context.read("b"), "The address doesn't return the value expected ?...");

        try{
            context.read("c");
            fail("An exception is expected ! 'b' isn't a valid address for now !");
        }catch (Exception e) {
            assertTrue(e instanceof RuntimeException, "The exception expected is a RuntimeException... Is there another exception that is not managed ?...");
        }
    }

    @Test
    void write() {
        context.write("b", 18.F);

        try {
            context.write(null, 45.F);
            fail("An excpetion is expected ! 'null' isn't a valid address at all !");
        }catch (Exception e) {
            assertTrue(e instanceof RuntimeException, "The exception expected is a RuntimeException... Is there another exception that is not managed ?...");
        }

        context.write("c", null);
        assertEquals(0.F, context.read("c"));

        Iterator<String> itr = context.iterator();
        int count = 0;
        while (itr.hasNext()) {
            itr.next();
            count++;
        }
        assertEquals(3, count, "There is more or less than " + count + " number of entries in the memory context ?...");
    }
}