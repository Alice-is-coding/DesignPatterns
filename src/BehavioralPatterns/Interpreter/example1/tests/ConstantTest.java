package BehavioralPatterns.Interpreter.example1.tests;

import BehavioralPatterns.Interpreter.example0.Context;
import BehavioralPatterns.Interpreter.example0.Memory;
import BehavioralPatterns.Interpreter.example1.Constant;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Alice B.
 * @version 24/02/2021
 */
class ConstantTest {
    private Context context;
    private Constant constant;

    @BeforeEach
    void setUp() {
        context = new Memory();
        constant = new Constant(5.5F);
    }

    @Test
    void getValue() {
        assertEquals(5.5F, constant.getValue(), "Wrong value stored ?...");
        constant = new Constant(null);
        assertEquals(0.F, constant.getValue(), "null value wrongly managed ?...");
    }

    @Test
    void interpret() {
        assertEquals("5.5", constant.interpret(context), "Wrong value stored ?...");
        constant = new Constant(null);
        assertEquals("0.0", constant.interpret(context), "null value wrongly managed ?...");
    }
}