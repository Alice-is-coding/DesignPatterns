package BehavioralPatterns.Interpreter.example1;

import BehavioralPatterns.Interpreter.example0.Context;
import BehavioralPatterns.Interpreter.example0.Expression;

/**
 * TerminalExpression.
 *
 * @author Alice B.
 * @version 23/02/2021
 */
public class Constant extends Expression<String> {
    /** The value of the constant. */
    private final Float value;

    /**
     * Constructor.
     *
     * @param value The value of the constant.
     */
    public Constant(Float value) {
        if(value == null) {
            this.value = 0.F;
        } else {
            this.value = value;
        }
    }

    /**
     * Value getter.
     *
     * @return The value of the constant.
     */
    public Float getValue() {
        return this.value;
    }

    /**
     * To interpret the Constant instance.
     *
     * @param context Context useful for all interpreters.
     * @return The value of the Constant instance as a String.
     */
    @Override
    public String interpret(Context context) {
        return this.value.toString();
    }
}
