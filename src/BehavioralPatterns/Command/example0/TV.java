package BehavioralPatterns.Command.example0;

/**
 * Receiver.
 *
 * @author Alice B.
 * @version 15/02/2021
 */
public class TV {
    /** The volume of the tv. */
    private int volume;
    /** true if the tv is turned on, false otherwise. */
    private boolean on;

    /**
     * To turn the tv on.
     */
    public void on() {
        this.on = true;
        System.out.println("The TV is on.");
    }

    /**
     * To turn the tv off.
     */
    public void off() {
        this.on = false;
        System.out.println("The TV is off.");
    }

    /**
     * To volume++.
     */
    public void increase_volume() {
        if(!isOn()) {
            on();
        }
        this.volume++;
        System.out.println("The volume of the TV is : " + this.volume);
    }

    /**
     * To volume--.
     */
    public void decrease_volume() {
        if(!isOn()) {
            on();
        }
        if(this.volume > 0) {
            this.volume--;
            System.out.println("The volume of the TV is : " + this.volume);
        }else {
            System.out.println("Volume of the TV is already at its lowest : " + this.volume);
        }
    }

    /**
     * Volume getter.
     *
     * @return The current volume of the tv.
     */
    public int getVolume() {
        return this.volume;
    }

    /**
     * To know if the tv is on or off.
     *
     * @return true if the tv is on, false otherwise.
     */
    public boolean isOn() {
        return this.on;
    }
}
