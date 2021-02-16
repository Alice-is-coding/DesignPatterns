package BehavioralPatterns.Command.example0.tests;

import BehavioralPatterns.Command.example0.Command_Radio_OnOff;
import BehavioralPatterns.Command.example0.ICommand;
import BehavioralPatterns.Command.example0.Radio;

/**
 * ConcreteCommandTests.
 *
 * @author Alice B.
 * @version 16/02/2021
 */
class Command_Radio_OnOffTest {

    @org.junit.jupiter.api.Test
    void execute() {
        Radio radio = new Radio();
        ICommand command = new Command_Radio_OnOff(radio);

        command.execute();
        org.junit.jupiter.api.Assertions.assertTrue(radio.isOn());
        command.execute();
        org.junit.jupiter.api.Assertions.assertFalse(radio.isOn());
        command.execute();
        command.execute();
        org.junit.jupiter.api.Assertions.assertFalse(radio.isOn());
    }

    @org.junit.jupiter.api.Test
    void undo() {
        Radio radio = new Radio();
        ICommand command = new Command_Radio_OnOff(radio);

        command.execute();
        command.undo();
        org.junit.jupiter.api.Assertions.assertFalse(radio.isOn());
        command.undo();
        org.junit.jupiter.api.Assertions.assertFalse(radio.isOn());
        command.execute();
        org.junit.jupiter.api.Assertions.assertTrue(radio.isOn());
        command.execute();
        command.execute();
        command.undo();
        org.junit.jupiter.api.Assertions.assertFalse(radio.isOn());
    }
}