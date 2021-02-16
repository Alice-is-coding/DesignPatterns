package BehavioralPatterns.Command.example0;

/**
 * ConcreteCommand.
 * Manages the volume of a TV.
 *
 * @author Alice B.
 * @version 16/02/2021
 */
public class Command_TV_VolumeDecrease extends Command_TV{

    /**
     * Constructor.
     *
     * @param tv The receiver used to execute the commands.
     */
    public Command_TV_VolumeDecrease(TV tv) {
        super(tv);
    }

    /**
     * To decrease the volume.
     */
    @Override
    public void execute() {
        tv.decrease_volume();
    }

    /**
     * To increase the volume.
     */
    @Override
    public void undo() {
        tv.increase_volume();
    }
}
