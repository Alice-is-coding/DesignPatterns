package BehavioralPatterns.Interpreter.example0.tests;

import BehavioralPatterns.Interpreter.example0.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Alice B.
 * @version 24/02/2021
 */
class MultiplicationTest {
    private Context context;
    private Expression<Float> expr;

    @BeforeEach
    void setUp() {
        context = new Memory();
    }

    @Test
    void interpret() {
        expr = new Multiplication(new Constant(8.F), new Constant(5.F));

        assertEquals(40.F, expr.interpret(context), "Wrong result returned ?...");

        expr = new Multiplication(
                new Addition(
                        new Division(new Variable(context, "a", 12.F), new Variable(context, "b", 4.F)),
                        new Multiplication(new Constant(context.read("a")), new Constant(1.F))
                ),
                new Variable(context, "x", 2.F)
        );

        assertEquals(30.F, expr.interpret(context), "Wrong result returned ?...");
    }
}