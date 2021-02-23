package BehavioralPatterns.Interpreter.example0;

/**
 * TerminalExpression.
 *
 * @author Alice B.
 * @version 23/02/2021
 */
public class Multiplication extends BinaryExpression<Float> {

    /**
     * Constructor.
     *
     * @param op1 Left operand.
     * @param op2 Right operand.
     */
    public Multiplication(Expression<Float> op1, Expression<Float> op2) {
        super(op1, op2);
    }

    /**
     * To interpret the Multiplication instance.
     * Browse the composite structure by calling recursively the interpret() method of the left operand and right operand.
     * Note : The left/right operand can either be a terminal expression or a non terminal expression...
     *
     * @param context Context useful for all interpreters.
     * @return The result of the operation.
     */
    @Override
    public Float interpret(Context context) {
        return this.op1.interpret(context) * this.op2.interpret(context);
    }
}
