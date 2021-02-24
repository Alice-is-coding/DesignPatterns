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
class MultiplicationTest {
    private Context context;
    private Expression<String> expr;

    @BeforeEach
    void setUp() {
        context = new Memory();
    }

    @Test
    void interpret() {
        expr =
                new Multiplication(
                        new Constant(8.F),
                        new Constant(5.F)
                );

        assertEquals("(8.0 * 5.0)", expr.interpret(context), "Result misinterpreted ?...");

        expr = new Multiplication(
                new Addition(
                        new Division(new Variable(context, "a", 12.F), new Variable(context, "b", 4.F)),
                        new Multiplication(new Constant(context.read("a")), new Constant(1.F))
                ),
                new Variable(context, "x", 2.F)
        );

        assertEquals("(((a{12.0} / b{4.0}) + (12.0 * 1.0)) * x{2.0})", expr.interpret(context), "Result misinterpreted ?...");
        System.out.println(expr.interpret(context));
    }
}