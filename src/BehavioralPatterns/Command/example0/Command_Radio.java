package BehavioralPatterns.Command.example0;

/**
 * AbstractCommand.
 * (Used to group commands if we would like to centralize commands for a same Radio object for instance).
 *
 * @author Alice B.
 * @version 16/02/2021
 */
public abstract class Command_Radio implements ICommand{
    /** The receiver. */
    protected Radio radio;

    /**
     * Constructor.
     *
     * @param radio The receiver used for executing the commands.
     */
    protected Command_Radio(Radio radio) {
        this.radio = radio;
    }
}
