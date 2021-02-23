package BehavioralPatterns.Interpreter.example1;

import BehavioralPatterns.Interpreter.example0.Context;
import BehavioralPatterns.Interpreter.example0.Expression;

/**
 * TerminalExpression.
 *
 * @author Alice B.
 * @version 23/02/2021
 */
public class Variable extends Expression<String> {
    /** The name of the variable. */
    private String name;

    /**
     * Constructor.
     *
     * @param context The context used to store the variable.
     * @param name The name of the variable.
     * @param value The value attached to the variable.
     */
    public Variable(Context context, String name, Float value) {
        this.name = name;
        context.write(this.name, value);
    }

    /**
     * Constructor1.
     *
     * @param context The context used to store the variable.
     * @param name The name of the variable.
     */
    public Variable(Context context, String name) {
        this(context, name, 0.F);
    }

    /**
     * Name getter.
     *
     * @return The name of the variable.
     */
    public String getName() {
        return this.name;
    }

    /**
     * To interpret the Variable instance.
     *
     * @param context Context useful for all interpreters.
     * @return Chain of characters -> format : varName{value}.
     */
    @Override
    public String interpret(Context context) {
        return this.name + "{" + context.read(this.name).toString() + "}";
    }
}
