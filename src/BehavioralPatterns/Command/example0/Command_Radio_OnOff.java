package BehavioralPatterns.Command.example0;

/**
 * ConcreteCommand.
 * Manages the On/Off functionality of a radio.
 *
 * @author Alice B.
 * @version 16/02/2021
 */
public class Command_Radio_OnOff extends Command_Radio{

    /**
     * Constructor.
     *
     * @param radio The receiver used to execute the commands.
     */
    public Command_Radio_OnOff(Radio radio) {
        super(radio);
    }

    /**
     * To turn the radio On/Off.
     * (Works as a "binary button" (1 clic == on ; 1 other clic == off, ...)).
     */
    @Override
    public void execute() {
        if(radio.isOn()) {
            undo();
        } else {
            radio.on();
        }
    }

    /**
     * To turn the radio off.
     */
    @Override
    public void undo() {
        radio.off();
    }
}
