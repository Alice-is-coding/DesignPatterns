package BehavioralPatterns.Interpreter.example1.tests;

import BehavioralPatterns.Interpreter.example0.Context;
import BehavioralPatterns.Interpreter.example0.Expression;
import BehavioralPatterns.Interpreter.example0.Memory;
import BehavioralPatterns.Interpreter.example1.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Alice B.
 * @version 24/02/2021
 */
class AdditionTest {
    private Context context;
    private Expression<String> expr;

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
        assertEquals("((a{6.0} / 2.0) + 8.0)", expr.interpret(context), "Result misinterpreted ?...");

        Expression<String> expr1 =
                new Addition(
                        expr,
                        new Multiplication(
                                new Variable(context, "b", 8.F),
                                new Variable(context, "c", 2.F)
                        )
                );
        assertEquals("(((a{6.0} / 2.0) + 8.0) + (b{8.0} * c{2.0}))", expr1.interpret(context), "Result misinterpreted ?...");
    }
}