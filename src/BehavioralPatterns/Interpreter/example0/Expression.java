package BehavioralPatterns.Interpreter.example0;

/**
 * AbstractExpression.
 * Defines the interpret method to be implemented by all ConcreteExpressions.
 *
 * @author Alice B.
 * @version 23/02/2021
 *
 * @param <T> Generic parameter (The type of Expression).
 */
public abstract class Expression<T> {
    /**
     * To interpret the object structure.
     *
     * @param context Context useful for all interpreters.
     * @return The result of the interpretation.
     */
    public abstract T interpret(Context context);
}
