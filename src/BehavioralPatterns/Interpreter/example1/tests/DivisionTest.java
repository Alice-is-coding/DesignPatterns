package BehavioralPatterns.Interpreter.example1.tests;

import BehavioralPatterns.Interpreter.example0.Context;
import BehavioralPatterns.Interpreter.example0.Expression;
import BehavioralPatterns.Interpreter.example0.Memory;
import BehavioralPatterns.Interpreter.example1.Constant;
import BehavioralPatterns.Interpreter.example1.Division;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Alice B.
 * @version 24/02/2021
 */
class DivisionTest {
    private Context context;
    private Expression<String> expr;

    @BeforeEach
    void setUp() {
        context = new Memory();
    }

    @Test
    void interpret() {
        expr =
                new Division(
                        new Constant(8.F),
                        new Constant(4.F)
                );
        assertEquals("(8.0 / 4.0)", expr.interpret(context));

        try {
            Expression<String> expr1 = new Division(expr, new Constant(0.F));
            expr1.interpret(context);
            fail("Division by 0 !");
        }catch (Exception e) {
            assertTrue(e instanceof RuntimeException, "Another exception isn't managed ?...");
        }
    }
}