package BehavioralPatterns.Command.example0;

/**
 * Receiver.
 *
 * @author Alice B.
 * @version 15/02/2021
 */
public class Radio {
    /** The volume of the radio. */
    private int volume;
    /** true if the radio is turned on, false otherwise. */
    private boolean on;

    /**
     * To turn the radio on.
     */
    public void on() {
        this.on = true;
        System.out.println("The radio is on.");
    }

    /**
     * To turn the radio off.
     */
    public void off() {
        this.on = false;
        System.out.println("The radio is off.");
    }

    /**
     * To volume++.
     */
    public void increase_volume() {
        if(!isOn()) {
            on();
        }
        this.volume++;
        System.out.println("The volume of the radio is : " + this.volume);
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
            System.out.println("The volume of the radio is : " + this.volume);
        }else {
            System.out.println("Volume of the radio is already at its lowest : " + this.volume);
        }
    }

    /**
     * Volume getter.
     *
     * @return The current volume of the radio.
     */
    public int getVolume() {
        return this.volume;
    }

    /**
     * To know if the radio is on or not.
     *
     * @return true if the radio is on, false otherwise.
     */
    public boolean isOn() {
        return this.on;
    }
}
