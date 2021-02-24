package BehavioralPatterns.Interpreter.example0.tests;

import BehavioralPatterns.Interpreter.example0.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Alice B.
 * @version 23/02/2021
 */
class AdditionTest {
    private Context context;
    private Expression<Float> expr;

    @BeforeEach
    void setUp() {
        context = new Memory();
    }

    @Test
    void interpret() {
        expr = new Addition(
                new Division(
                        new Variable(context, "a", 6.F),
                        new Constant(2.F)),
                new Constant(8.F)
        );
        assertEquals(11.F, expr.interpret(context), "Result isn't the one expected ?...");

        Expression<Float> expr1 = new Addition(expr, new Multiplication(new Variable(context, "b", 8.F), new Variable(context, "c", 2.F)));
        assertEquals(27.F, expr1.interpret(context), "Result isn't the one expected ?...");
    }
}