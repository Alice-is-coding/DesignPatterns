package BehavioralPatterns.Interpreter.example0;

/**
 * NonTerminalExpression.
 * Defines binary operations to be implemented (Ex : Addition).
 *
 * @author Alice B.
 * @version 23/02/2021
 *
 * @param <T> The type of BynaryExpression.
 */
public abstract class BinaryExpression<T> extends Expression<T> {
    /** Left operand. */
    protected Expression<T> op1;
    /** Right operand. */
    protected Expression<T> op2;

    /**
     * Constructor.
     *
     * @param op1 Left operand.
     * @param op2 Right operand.
     */
    protected BinaryExpression(Expression<T> op1, Expression<T> op2) {
        this.op1 = op1;
        this.op2 = op2;
    }

    /**
     * Left operand getter.
     *
     * @return The left operand.
     */
    public Expression<T> getOp1() {
        return this.op1;
    }

    /**
     * Right operand getter.
     *
     * @return The right operand.
     */
    public Expression<T> getOp2() {
        return this.op2;
    }
}
