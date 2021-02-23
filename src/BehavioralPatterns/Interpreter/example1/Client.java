package BehavioralPatterns.Interpreter.example1;

import BehavioralPatterns.Interpreter.example0.*;

/**
 * Client.
 *
 * Here, we chose to implement the interpreter pattern as an interpretation of operations as chain of characters.
 * This example is useful to better understand the logic behind the implementation of the interpreter pattern in the package [example0].
 *
 * @author Alice B.
 * @version 23/02/2021
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Memory();

        // Here, an example of the interpreter pattern implementation : Chain of characters interpretation. [example1]
        Expression<String> exp0 = new Addition(new Variable(context, "a", 5.F), new Constant(6.F));
        System.out.println(exp0.interpret(context));

        exp0 = new Addition(
                new Multiplication(
                        new Constant(8.F), new Constant(5.F)),
                new Division(
                        new Constant(8.F), new Constant(4.F)));

        System.out.println(exp0.interpret(context));

        // Here, another example of the interpreter pattern implementation : Result of operations. [example0]
        Expression<Float> exp1 =
                new BehavioralPatterns.Interpreter.example0.Addition(
                        new BehavioralPatterns.Interpreter.example0.Variable(context, "a", 5.F),
                        new BehavioralPatterns.Interpreter.example0.Constant(6.F));

        System.out.println(exp1.interpret(context));

        exp1 =
                new BehavioralPatterns.Interpreter.example0.Addition(
                        new BehavioralPatterns.Interpreter.example0.Multiplication(
                                new BehavioralPatterns.Interpreter.example0.Constant(8.F),
                                new BehavioralPatterns.Interpreter.example0.Constant(5.F)),
                        new BehavioralPatterns.Interpreter.example0.Division(
                                new BehavioralPatterns.Interpreter.example0.Constant(8.F),
                                new BehavioralPatterns.Interpreter.example0.Constant(4.F)));

        System.out.println(exp1.interpret(context));
    }
}
