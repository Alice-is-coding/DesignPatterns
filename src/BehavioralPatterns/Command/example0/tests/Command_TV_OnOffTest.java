package BehavioralPatterns.Command.example0.tests;

import BehavioralPatterns.Command.example0.Command_TV_OnOff;
import BehavioralPatterns.Command.example0.ICommand;
import BehavioralPatterns.Command.example0.TV;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * ConcreteCommandTests.
 *
 * @author Alice B.
 * @version 16/02/2021
 */
class Command_TV_OnOffTest {

    @Test
    void execute() {
        TV tv = new TV();
        ICommand command = new Command_TV_OnOff(tv);

        assertFalse(tv.isOn());

        command.execute();
        command.execute();
        assertFalse(tv.isOn());

        command.execute();
        assertTrue(tv.isOn());

        command.execute();
        command.execute();
        command.execute();
        command.execute();
        command.execute();
        command.execute();
        command.execute();
        command.execute();
        command.execute();
        command.execute();
        assertTrue(tv.isOn());
        command.execute();
        assertFalse(tv.isOn());
    }

    @Test
    void undo() {
        TV tv = new TV();
        ICommand command = new Command_TV_OnOff(tv);

        assertFalse(tv.isOn());

        command.execute();
        assertTrue(tv.isOn());
        command.undo();
        assertFalse(tv.isOn());
        command.undo();
        command.undo();
        command.undo();
        command.undo();
        command.undo();
        assertFalse(tv.isOn());
    }
}