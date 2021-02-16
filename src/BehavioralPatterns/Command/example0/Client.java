package BehavioralPatterns.Command.example0;

/**
 * Client.
 *
 * @author Alice B.
 * @version 16/02/2021
 */
public class Client {
    public static void main(String[] args) {
        // Creation of 2 remote controls and 2 receivers (radio, tv).
        RemoteControl remoteControl_radio = new RemoteControl();
        RemoteControl remoteControl_tv = new RemoteControl();
        Radio radio = new Radio();
        TV tv = new TV();

        // Configuration of the universal remotes.
        // NOTE : With dependency injection we could avoid this kind of configuration as it would be injected instead.
        remoteControl_radio.addAll(new Command_Radio_OnOff(radio), new Command_Radio_VolumeIncrease(radio), new Command_Radio_VolumeDecrease(radio));
        remoteControl_tv.addAll(new Command_TV_OnOff(tv), new Command_TV_VolumeIncrease(tv), new Command_TV_VolumeDecrease(tv));

        // Testing the remote for the radio.
        remoteControl_radio.executeAll();
        remoteControl_radio.getCommand(0).execute();

        System.out.println();

        // Testing the remote for the TV.
        remoteControl_tv.executeAll();
        remoteControl_tv.getCommand(0).execute();
        remoteControl_tv.getCommand(0).execute();
        remoteControl_tv.getCommand(0).execute();
        remoteControl_tv.getCommand(0).execute();
        // NOTE : Here, remember, a real remote has only 1 button for turning, a tv for instance, on and off.
        // When the tv is on and you press the button, the tv turns off. When you press the same button again, the tv turns on.
    }
}
