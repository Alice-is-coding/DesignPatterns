package BehavioralPatterns.Interpreter.example0.tests;

import BehavioralPatterns.Interpreter.example0.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Alice B.
 * @version 23/02/2021
 */
class DivisionTest {
    private Context context;
    private Expression<Float> expr;

    @BeforeEach
    void setUp() {
        context = new Memory();
    }

    @Test
    void interpret() {
        expr = new Division(new Constant(8.F), new Constant(4.F));
        assertEquals(2.F, expr.interpret(context));

        try {
            Expression<Float> expr1 = new Division(expr, new Constant(0.F));
            expr1.interpret(context);
            fail("Division by 0 !");
        }catch (Exception e) {
            assertTrue(e instanceof RuntimeException, "Another exception isn't managed ?...");
        }
    }
}