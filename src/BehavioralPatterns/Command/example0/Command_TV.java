package BehavioralPatterns.Command.example0;

/**
 * AbstractCommand.
 * (Used to group commands if we would like to centralize commands for a same TV object for instance).
 *
 * @author Alice B.
 * @version 16/02/2021
 */
public abstract class Command_TV implements ICommand{
    /** The receiver. */
    protected TV tv;

    /**
     * Constructor.
     *
     * @param tv The receiver used to execute the commands.
     */
    protected Command_TV(TV tv) {
        this.tv = tv;
    }
}
