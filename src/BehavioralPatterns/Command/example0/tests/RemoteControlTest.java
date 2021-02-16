package BehavioralPatterns.Command.example0.tests;

import BehavioralPatterns.Command.example0.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * InvokerTests.
 * Most interesting tests about the Command pattern implemented in this example.
 *
 * @author Alice B.
 * @version 16/02/2021
 */
class RemoteControlTest {

    @Test
    void getCommand() {
        RemoteControl remoteControl = new RemoteControl();
        Radio radio = new Radio();
        TV tv = new TV();

        assertNull(remoteControl.getCommand(0), "The list of commands is empty and shouldn't return any command.");

        remoteControl.addCommand(new Command_Radio_OnOff(radio));
        assertTrue(remoteControl.getCommand(0) instanceof Command_Radio_OnOff, "We added 1 command... Check which instance it is from (?) ");

        remoteControl.removeCommand(0);
        assertNull(remoteControl.getCommand(0), "We removed the previously added command, so no command should be returned.");

        remoteControl.addAll(new Command_Radio_OnOff(radio), new Command_Radio_VolumeIncrease(radio), new Command_TV_OnOff(tv), new Command_TV_VolumeIncrease(tv));
        assertTrue(remoteControl.getCommand(2) instanceof Command_TV_OnOff, "The list contains commands... Check the type of object at the index requested (?) ");

        assertNull(remoteControl.getCommand(6));
        assertTrue(remoteControl.getCommand(0) instanceof Command_Radio_OnOff, "The list contains commands... Check the type of object at the index requested (?) ");
        remoteControl.removeCommand(2);
        assertTrue(remoteControl.getCommand(2) instanceof Command_TV_VolumeIncrease, "The list contains commands... Check the type of object at the index requested (?) ");
        assertTrue(remoteControl.getCommand(1) instanceof Command_Radio_VolumeIncrease, "The list contains commands... Check the type of object at the index requested (?) ");
    }

    @Test
    void addCommand() {
        RemoteControl remoteControl = new RemoteControl();
        Radio radio = new Radio();
        TV tv = new TV();

        ICommand command0 = new Command_Radio_OnOff(radio);
        ICommand command1 = new Command_TV_OnOff(tv);
        ICommand command2 = new Command_Radio_VolumeIncrease(radio);

        assertEquals(0, remoteControl.addCommand(command0), "The list of commands doesn't contain the command just added, everything's fine and so should return 0...");
        assertEquals(-1, remoteControl.addCommand(command0), "The method shouldn't allow to add an already added command and so should return -1...");
        assertEquals(0, remoteControl.addCommand(command1), "The list of commands doesn't contain the command just added, everything's fine and so should return 0...");
        assertEquals(0, remoteControl.addCommand(command2), "The list of commands doesn't contain the command just added, everything's fine and so should return 0...");
        assertEquals(-1, remoteControl.addCommand(command2), "The method shouldn't allow to add an already added command and so should return -1...");
        assertEquals(-1, remoteControl.addCommand(command0), "The method shouldn't allow to add an already added command and so should return -1...");
        remoteControl.removeCommand(0);
        assertEquals(0, remoteControl.addCommand(command0), "The list of commands doesn't contain the command just added, everything's fine and so should return 0...");
        assertEquals(-1, remoteControl.addCommand(command0), "The method shouldn't allow to add an already added command and so should return -1...");
    }

    @Test
    void removeCommand() {
        RemoteControl remoteControl = new RemoteControl();
        Radio radio = new Radio();
        TV tv = new TV();

        ICommand command0 = new Command_Radio_OnOff(radio);
        ICommand command1 = new Command_TV_OnOff(tv);
        ICommand command2 = new Command_Radio_VolumeIncrease(radio);
        ICommand command3 = new Command_Radio_VolumeDecrease(radio);
        ICommand command4 = new Command_TV_VolumeIncrease(tv);
        ICommand command5 = new Command_TV_VolumeDecrease(tv);

        remoteControl.addAll(command0, command1, command2, command3, command4, command5);

        assertEquals(0, remoteControl.removeCommand(2), "The command requested to be removed shouldn't be a problem and so should return 0...");
        assertEquals(-1, remoteControl.removeCommand(5), "The index communicated is out of bound... The problem should be managed by the method and return -1...");
        assertEquals(0, remoteControl.removeCommand(4), "The command requested to be removed shouldn't be a problem and so should return 0...");

        assertEquals(0, remoteControl.removeCommand(command0), "The command requested to be removed shouldn't be a problem and so should return 0...");

        assertEquals(3, remoteControl.getCommands().size());
    }

    @Test
    void testRemoveCommand() {
        RemoteControl remoteControl = new RemoteControl();
        Radio radio = new Radio();
        TV tv = new TV();

        ICommand command0 = new Command_Radio_OnOff(radio);
        ICommand command1 = new Command_TV_OnOff(tv);
        ICommand command2 = new Command_Radio_VolumeIncrease(radio);
        ICommand command3 = new Command_Radio_VolumeDecrease(radio);
        ICommand command4 = new Command_TV_VolumeIncrease(tv);
        ICommand command5 = new Command_TV_VolumeDecrease(tv);

        remoteControl.addAll(command0, command1, command2, command3, command4);

        assertEquals(0, remoteControl.removeCommand(command4), "Removing this command shouldn't be a problem...");
        assertEquals(0, remoteControl.removeCommand(command1), "The index communicated is out of bound... The problem should be managed by the method and return -1...");
        assertEquals(3, remoteControl.getCommands().size(), "Check the number of removal and addition in the list (?)");
        assertEquals(-1, remoteControl.removeCommand(command5), "This command isn't in the list...Check its presence (?)");
        assertEquals(-1, remoteControl.removeCommand(command1), "This command has already been removed...Check if it's actually the case (?)");
        assertEquals(-1, remoteControl.removeCommand(command4), "This command has already been removed...Check if it's actually the case (?)");
        assertEquals(0, remoteControl.removeCommand(command2), "The index communicated is out of bound... The problem should be managed by the method and return -1...");
        assertEquals(0, remoteControl.removeCommand(command3), "The index communicated is out of bound... The problem should be managed by the method and return -1...");
        assertEquals(0, remoteControl.removeCommand(command0), "The index communicated is out of bound... The problem should be managed by the method and return -1...");
        assertEquals(0, remoteControl.getCommands().size(), "Check the number of removal and addition in the list (?)");
        assertEquals(-1, remoteControl.removeCommand(command3));
    }

    @Test
    void addAll() {
        RemoteControl remoteControl = new RemoteControl();
        Radio radio = new Radio();
        TV tv = new TV();

        ICommand command0 = new Command_Radio_OnOff(radio);
        ICommand command1 = new Command_TV_OnOff(tv);
        ICommand command2 = new Command_Radio_VolumeIncrease(radio);
        ICommand command3 = new Command_Radio_VolumeDecrease(radio);
        ICommand command4 = new Command_TV_VolumeIncrease(tv);
        ICommand command5 = new Command_TV_VolumeDecrease(tv);

        assertEquals(0, remoteControl.getCommands().size(), "The list of commands is empty... Check if it's actually the case (?)");
        assertTrue(remoteControl.addAll(command0, command1, command2, command3, command4, command5));
        assertEquals(6, remoteControl.getCommands().size(), "The size isn't correct (?) ... Check what's in this list (?)...");
        assertFalse(remoteControl.addAll(command0, command1, command2, command3, command4, command5));
    }

    @Test
    void removeAll() {
        RemoteControl remoteControl = new RemoteControl();
        Radio radio = new Radio();
        TV tv = new TV();

        ICommand command0 = new Command_Radio_OnOff(radio);
        ICommand command1 = new Command_TV_OnOff(tv);
        ICommand command2 = new Command_Radio_VolumeIncrease(radio);
        ICommand command3 = new Command_Radio_VolumeDecrease(radio);
        ICommand command4 = new Command_TV_VolumeIncrease(tv);
        ICommand command5 = new Command_TV_VolumeDecrease(tv);

        assertEquals(0, remoteControl.getCommands().size(), "The list of commands is empty... Check if it's actually the case (?)...");
        remoteControl.addAll(command0, command1, command2, command3, command4, command5);
        assertEquals(6, remoteControl.getCommands().size(), "The size isn't correct... Check what's in the list (?)...");

        remoteControl.removeAll(command0, command3, command1);
        assertEquals(3, remoteControl.getCommands().size(), "Commands has been removed... Check what's in the list (?) ");
        remoteControl.removeAll(command0, command3, command1);
        assertEquals(3, remoteControl.getCommands().size(), "These commands have already been removed... Check if it's actually the case (?)...");
        remoteControl.removeAll(command2, command4, command2);
        assertEquals(1, remoteControl.getCommands().size(), "Almost every commands have been removed... Is it the case (?)...");

        remoteControl.addAll(command0, command1, command2, command3, command4, command5);
        assertEquals(6, remoteControl.getCommands().size(), "Wrong list size... Check what's in the list (?)...");

        remoteControl.removeAll(command0, command1, command2, command2, command3, command0, command4, command5);
        assertEquals(0, remoteControl.getCommands().size(), "Every command previously added has been removed... Is it the case (?)...");
    }

    @Test
    void executeAll() {
        RemoteControl remoteControl = new RemoteControl();
        Radio radio = new Radio();
        TV tv = new TV();

        ICommand command0 = new Command_Radio_OnOff(radio);
        ICommand command1 = new Command_TV_OnOff(tv);
        ICommand command2 = new Command_Radio_VolumeIncrease(radio);
        ICommand command3 = new Command_Radio_VolumeDecrease(radio);
        ICommand command4 = new Command_TV_VolumeIncrease(tv);
        ICommand command5 = new Command_TV_VolumeDecrease(tv);

        remoteControl.addAll(command0, command1, command2, command4);
        remoteControl.executeAll();

        assertTrue(radio.isOn(), "The radio should be on...");
        assertTrue(tv.isOn(), "The radio should be on...");
        assertEquals(1, radio.getVolume(), "The volume of the radio should have been increased by one of the command previously added... Is the command actually added to the remote (?)...");
        assertEquals(1, tv.getVolume(), "The volume of the tv should have been increased by one of the command previously added... Is the command actually added to the remote (?)...");

        remoteControl.removeAll(command0, command1, command2, command4);
        remoteControl.addAll(command3, command5);
        remoteControl.executeAll();
        assertEquals(0, radio.getVolume(), "The volume of the radio should have been decreased... Is the dedicated command actually added to the remote (?)...");
        assertEquals(0, tv.getVolume(), "The volume of the tv should have been decreased... Is the dedicated command actually added to the remote (?)...");

        remoteControl.removeAll(command3, command5);
        assertEquals(0, remoteControl.getCommands().size(), "All commands have been removed from the remote... Is it the case (?)...");
        remoteControl.addAll(command0, command1);
        assertTrue(tv.isOn(), "The tv should be turned on...");
        assertTrue(radio.isOn(), "The radio should be turned on...");
        remoteControl.executeAll();
        assertFalse(tv.isOn(), "The tv should be turned off...");
        assertFalse(radio.isOn(), "The radio should be turned off...");
    }
}