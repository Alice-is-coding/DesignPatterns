package BehavioralPatterns.Command.example0.tests;

import BehavioralPatterns.Command.example0.Command_TV_VolumeDecrease;
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
class Command_TV_VolumeDecreaseTest {

    @Test
    void execute() {
        TV tv = new TV();
        ICommand command = new Command_TV_VolumeDecrease(tv);

        assertEquals(tv.getVolume(), 0);

        command.execute();
        command.execute();
        command.execute();
        assertEquals(tv.getVolume(), 0);

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

        command.execute();
        command.execute();
        command.execute();
        command.execute();
        assertEquals(tv.getVolume(), 6);
    }

    @Test
    void undo() {
        TV tv = new TV();
        ICommand command = new Command_TV_VolumeDecrease(tv);

        assertEquals(tv.getVolume(), 0);

        command.undo();
        command.undo();
        command.undo();
        command.undo();
        command.undo();
        command.undo();
        command.undo();
        command.execute();
        command.execute();
        command.undo();
        command.undo();
        command.undo();
        assertEquals(tv.getVolume(), 8);
    }
}