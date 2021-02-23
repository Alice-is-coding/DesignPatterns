package BehavioralPatterns.Interpreter.example0;

/**
 * TerminalExpression.
 *
 * @author Alice B.
 * @version 23/02/2021
 */
public class Variable extends Expression<Float> {
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
     * @return The value attached to the name of the variable.
     */
    @Override
    public Float interpret(Context context) {
        return context.read(this.name);
    }
}
