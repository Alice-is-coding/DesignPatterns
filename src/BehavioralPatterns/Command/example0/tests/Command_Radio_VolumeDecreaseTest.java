package BehavioralPatterns.Command.example0.tests;

import BehavioralPatterns.Command.example0.Command_Radio_VolumeDecrease;
import BehavioralPatterns.Command.example0.ICommand;
import BehavioralPatterns.Command.example0.Radio;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * ConcreteCommandTests.
 *
 * @author Alice B.
 * @version 16/02/2021
 */
class Command_Radio_VolumeDecreaseTest {

    @Test
    void execute() {
        Radio radio = new Radio();
        ICommand command = new Command_Radio_VolumeDecrease(radio);

        command.execute();
        assertEquals(radio.getVolume(), 0);
        command.undo();
        command.undo();
        command.execute();
        assertEquals(radio.getVolume(), 1);

        command.undo();
        command.undo();
        command.undo();
        command.undo();
        assertEquals(radio.getVolume(), 5);

        command.execute();
        command.execute();
        assertEquals(radio.getVolume(), 3);
    }

    @Test
    void undo() {
        Radio radio = new Radio();
        ICommand command = new Command_Radio_VolumeDecrease(radio);

        command.undo();
        assertEquals(radio.getVolume(), 1);
        command.undo();
        command.undo();
        command.undo();
        command.undo();
        command.undo();
        command.undo();
        command.undo();
        command.undo();
        command.undo();
        command.undo();
        command.undo();
        command.undo();
        command.undo();
        command.undo();
        command.undo();
        assertEquals(radio.getVolume(),16);

        command.execute();
        command.execute();
        command.undo();
        assertEquals(radio.getVolume(),15);
    }
}