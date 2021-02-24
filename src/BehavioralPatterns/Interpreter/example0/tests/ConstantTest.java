package BehavioralPatterns.Interpreter.example0.tests;

import BehavioralPatterns.Interpreter.example0.Constant;
import BehavioralPatterns.Interpreter.example0.Context;
import BehavioralPatterns.Interpreter.example0.Memory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Alice B.
 * @version 23/02/2021
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
        assertEquals(5.5F, constant.getValue(), "Wrong value returned ?...");
        constant = new Constant(null);
        assertEquals(0.F, constant.getValue(), "null case not managed ?...");
    }

    @Test
    void interpret() {
        assertEquals(5.5F, constant.interpret(context), "Wrong value interpreted ?");
        constant = new Constant(null);
        assertEquals(0.F, constant.interpret(context), "null case wrongly interpreted ?...");
    }
}