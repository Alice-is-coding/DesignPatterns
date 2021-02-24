package BehavioralPatterns.Interpreter.example0;

/**
 * Client.
 *
 * Here, we chose to implement the interpreter pattern as a calculator interpreter.
 * So it allows us to process some calculation.
 *
 * Cf. [example1] to see another implementation of the interpreter pattern...
 *
 * @author Alice B.
 * @version 23/02/2021
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Memory();

        Expression<Float> exp = new Addition(new Variable(context, "a", 5.F), new Constant(6.F));
        System.out.println(exp.interpret(context));
        exp = new Addition(new Multiplication(new Constant(8.F), new Constant(5.F)), new Division(new Constant(8.F), new Constant(4.F)));
        System.out.println(exp.interpret(context));
    }
}
