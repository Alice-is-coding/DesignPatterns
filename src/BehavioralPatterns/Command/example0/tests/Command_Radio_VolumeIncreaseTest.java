package BehavioralPatterns.Command.example0.tests;

import BehavioralPatterns.Command.example0.Command_Radio_VolumeIncrease;
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
class Command_Radio_VolumeIncreaseTest {

    @Test
    void execute() {
        Radio radio = new Radio();
        ICommand command = new Command_Radio_VolumeIncrease(radio);

        command.execute();
        command.execute();
        command.execute();
        command.execute();
        command.execute();
        command.execute();
        command.execute();
        assertEquals(radio.getVolume(), 7);

        command.undo();
        command.undo();
        command.undo();
        command.undo();
        command.execute();
        command.undo();
        command.execute();
        assertEquals(radio.getVolume(), 4);
    }

    @Test
    void undo() {
        Radio radio = new Radio();
        ICommand command = new Command_Radio_VolumeIncrease(radio);

        command.undo();
        assertEquals(radio.getVolume(), 0);

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
        command.execute();

        command.undo();
        command.undo();
        command.undo();
        command.undo();

        assertEquals(radio.getVolume(), 7);

        command.execute();
        command.undo();

        assertEquals(radio.getVolume(), 7);

        command.undo();
        command.undo();
        command.undo();
        command.undo();
        command.undo();
        command.undo();
        command.undo();
        command.undo();
        command.undo();

        assertEquals(radio.getVolume(), 0);
    }
}