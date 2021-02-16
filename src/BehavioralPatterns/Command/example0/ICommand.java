package BehavioralPatterns.Command.example0;

/**
 * Command Interface.
 * Make it mandatory for subclasses (concrete commands) to implement the 2 simple methods for this pattern : execute(), and undo().
 *
 * @author Alice B.
 * @version 16/02/2021
 */
public interface ICommand {
    /** To execute the command(s). */
    public void execute();
    /** To undo the previously executed command(s). */
    public void undo();
}
