package BehavioralPatterns.Interpreter.example1;

import BehavioralPatterns.Interpreter.example0.BinaryExpression;
import BehavioralPatterns.Interpreter.example0.Context;
import BehavioralPatterns.Interpreter.example0.Expression;

/**
 * TerminalExpression.
 *
 * @author Alice B.
 * @version 23/02/2021
 */
public class Addition extends BinaryExpression<String> {

    /**
     * Constructor.
     *
     * @param op1 Left operand.
     * @param op2 Right operand.
     */
    public Addition(Expression<String> op1, Expression<String> op2) {
        super(op1, op2);
    }

    /**
     * To interpret the Addition instance.
     * Browse the composite structure by calling recursively the interpret() method of the left operand and right operand.
     * Note : The left/right operand can either be a terminal expression or a non terminal expression...
     *
     * @param context Context useful for all interpreters.
     * @return The string interpretation of the operation.
     */
    @Override
    public String interpret(Context context) {
        return "("+ this.op1.interpret(context) +" + "+ this.op2.interpret(context) + ")";
    }
}
