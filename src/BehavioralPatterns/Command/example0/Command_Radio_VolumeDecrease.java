package BehavioralPatterns.Command.example0;

/**
 * ConcreteCommand.
 * Manages the volume of a radio.
 *
 * @author Alice B.
 * @version 16/02/2021
 */
public class Command_Radio_VolumeDecrease extends Command_Radio{

    /**
     * Constructor.
     *
     * @param radio The receiver used to execute the commands.
     */
    public Command_Radio_VolumeDecrease(Radio radio) {
        super(radio);
    }

    /**
     * To decrease the volume.
     */
    @Override
    public void execute() {
        radio.decrease_volume();
    }

    /**
     * To increase the volume.
     */
    @Override
    public void undo() {
        radio.increase_volume();
    }
}
