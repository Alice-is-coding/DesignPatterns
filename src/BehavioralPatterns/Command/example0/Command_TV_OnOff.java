package BehavioralPatterns.Command.example0;

/**
 * ConcreteCommand.
 * Manages the On/Off functionality of a TV.
 *
 * @author Alice B.
 * @version 16/02/2021
 */
public class Command_TV_OnOff extends Command_TV{

    /**
     * Constructor.
     *
     * @param tv The receiver used to execute the commands.
     */
    public Command_TV_OnOff(TV tv) {
        super(tv);
    }

    /**
     * To turn the tv On/Off.
     * (Works as a "binary button" (1 clic == on ; 1 other clic == off, ...)).
     */
    @Override
    public void execute() {
        if(tv.isOn()) {
            undo();
        }else {
            tv.on();
        }
    }

    /**
     * To turn the tv off.
     */
    @Override
    public void undo() {
        tv.off();
    }
}
