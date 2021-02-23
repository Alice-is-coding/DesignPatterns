package BehavioralPatterns.Interpreter.example0;

/**
 * TerminalExpression.
 *
 * @author Alice B.
 * @version 23/02/2021
 */
public class Constant extends Expression<Float> {
    /** The value of the constant. */
    private final Float value;

    /**
     * Constructor.
     *
     * @param value The value of the constant.
     */
    public Constant(Float value) {
        this.value = value;
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
     * @return The value of the Constant instance.
     */
    @Override
    public Float interpret(Context context) {
        return this.value;
    }
}
