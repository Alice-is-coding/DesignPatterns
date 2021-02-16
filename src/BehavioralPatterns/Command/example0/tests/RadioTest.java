package BehavioralPatterns.Command.example0.tests;

import BehavioralPatterns.Command.example0.Radio;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * ReceiverTests.
 * @author Alice B.
 * @version 16/02/2021
 */
class RadioTest {

    @Test
    void on() {
        Radio radio = new Radio();

        assertFalse(radio.isOn());

        radio.on();
        assertTrue(radio.isOn());
        radio.on();
        radio.off();
        radio.on();
        radio.off();
        radio.on();
        radio.off();
        radio.on();
        radio.off();
        radio.on();
        radio.off();
        radio.off();
        radio.off();
        radio.on();
        assertTrue(radio.isOn());
    }

    @Test
    void off() {
        Radio radio = new Radio();

        assertFalse(radio.isOn());

        radio.on();
        assertTrue(radio.isOn());
        radio.on();
        radio.off();
        assertFalse(radio.isOn());
        radio.on();
        radio.off();
        radio.on();
        radio.off();
        radio.on();
        radio.off();
        radio.on();
        radio.off();
        radio.off();
        assertFalse(radio.isOn());
        radio.off();
        assertFalse(radio.isOn());
    }

    @Test
    void increase_volume() {
        Radio radio = new Radio();

        assertEquals(radio.getVolume(), 0);

        radio.increase_volume();
        radio.increase_volume();
        radio.increase_volume();
        radio.increase_volume();
        radio.increase_volume();
        radio.increase_volume();
        radio.increase_volume();
        assertEquals(radio.getVolume(), 7);

        radio.increase_volume();
        radio.increase_volume();
        radio.increase_volume();
        radio.decrease_volume();
        radio.increase_volume();
        radio.decrease_volume();
        radio.decrease_volume();
        radio.decrease_volume();
        radio.decrease_volume();
        radio.decrease_volume();
        radio.increase_volume();
        radio.increase_volume();
        radio.increase_volume();
        assertEquals(radio.getVolume(), 8);
    }

    @Test
    void decrease_volume() {
        Radio radio = new Radio();

        assertEquals(radio.getVolume(), 0);

        radio.increase_volume();
        radio.increase_volume();
        radio.increase_volume();
        radio.increase_volume();
        radio.increase_volume();
        radio.increase_volume();
        radio.increase_volume();
        assertEquals(radio.getVolume(), 7);

        radio.increase_volume();
        radio.increase_volume();
        radio.increase_volume();
        radio.decrease_volume();
        radio.increase_volume();
        radio.decrease_volume();
        radio.decrease_volume();
        radio.decrease_volume();
        radio.decrease_volume();
        radio.decrease_volume();
        assertEquals(radio.getVolume(), 5);
        radio.increase_volume();
        radio.increase_volume();
        radio.increase_volume();
        radio.decrease_volume();
        radio.decrease_volume();
        radio.decrease_volume();
        radio.decrease_volume();
        radio.decrease_volume();
        radio.decrease_volume();
        radio.decrease_volume();
        radio.decrease_volume();
        radio.decrease_volume();
        assertEquals(radio.getVolume(),0);
    }

    @Test
    void getVolume() {
        Radio radio = new Radio();
        int volume_count = 0;

        assertEquals(radio.getVolume(), volume_count);

        radio.increase_volume();
        volume_count++;
        radio.increase_volume();
        volume_count++;
        radio.increase_volume();
        volume_count++;
        radio.increase_volume();
        volume_count++;
        radio.increase_volume();
        volume_count++;
        radio.increase_volume();
        volume_count++;
        radio.increase_volume();
        volume_count++;
        assertEquals(radio.getVolume(), volume_count);

        radio.increase_volume();
        volume_count++;
        radio.increase_volume();
        volume_count++;
        radio.increase_volume();
        volume_count++;
        radio.decrease_volume();
        volume_count--;
        radio.increase_volume();
        volume_count++;
        radio.decrease_volume();
        volume_count--;
        radio.decrease_volume();
        volume_count--;
        radio.decrease_volume();
        volume_count--;
        assertEquals(radio.getVolume(), volume_count);
    }

    @Test
    void isOn() {
        Radio radio = new Radio();

        assertFalse(radio.isOn());

        radio.increase_volume();
        assertTrue(radio.isOn());

        radio.off();
        assertFalse(radio.isOn());
        radio.off();
        assertFalse(radio.isOn());

        radio.on();
        assertTrue(radio.isOn());
        radio.off();
        radio.decrease_volume();
        assertTrue(radio.isOn());
        radio.off();
        assertFalse(radio.isOn());
    }
}