package BehavioralPatterns.Interpreter.example1.tests;

import BehavioralPatterns.Interpreter.example0.Context;
import BehavioralPatterns.Interpreter.example0.Memory;
import BehavioralPatterns.Interpreter.example1.Variable;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Alice B.
 * @version 24/02/2021
 */
class VariableTest {
    private Context context;
    private Variable var;

    @BeforeEach
    void setUp() {
        context = new Memory();
        var = new Variable(context, "a");
    }

    @Test
    void getName() {
        assertEquals("a", var.getName(), "Wrong name returned ?...");
        var = new Variable(context, "c", 5.F);
        assertEquals("c", var.getName(), "Wrong name returned ?...");
    }

    @Test
    void interpret() {
        assertEquals(var.getName() + "{"+ context.read(var.getName()) +"}", var.interpret(context), "Variable misinterpreted ?...");
        System.out.println(var.interpret(context));
        var = new Variable(context, "b", 18.45F);
        assertEquals(var.getName() + "{"+ context.read(var.getName()) +"}", var.interpret(context), "Variable misinterpreted ?...");
        System.out.println(var.interpret(context));
    }
}