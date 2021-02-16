package BehavioralPatterns.Command.example0;

/**
 * ConcreteCommand.
 * Manages the volume of a TV.
 *
 * @author Alice B.
 * @version 16/02/2021
 */
public class Command_TV_VolumeIncrease extends Command_TV{

    /**
     * Constructor.
     *
     * @param tv The receiver used to execute the commands.
     */
    public Command_TV_VolumeIncrease(TV tv) {
        super(tv);
    }

    /**
     * To increase the volume.
     */
    @Override
    public void execute() {
        tv.increase_volume();
    }

    /**
     * To decrease the volume.
     */
    @Override
    public void undo() {
        tv.decrease_volume();
    }
}
