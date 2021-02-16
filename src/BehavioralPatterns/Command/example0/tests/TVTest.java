package BehavioralPatterns.Command.example0.tests;

import BehavioralPatterns.Command.example0.TV;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * ReceiverTests.
 *
 * @author Alice B.
 * @version 16/02/2021
 */
class TVTest {

    @Test
    void on() {
        TV tv = new TV();

        assertFalse(tv.isOn());
        tv.increase_volume();
        assertTrue(tv.isOn());
        tv.on();
        tv.on();
        assertTrue(tv.isOn());

        tv.on();
        tv.off();
        tv.on();
        tv.off();
        tv.on();
        tv.off();
        assertFalse(tv.isOn());
        tv.on();
        tv.off();
        tv.on();
        tv.off();
        tv.on();
        assertTrue(tv.isOn());
        tv.off();
        assertFalse(tv.isOn());
    }

    @Test
    void off() {
        TV tv = new TV();

        assertFalse(tv.isOn());

        tv.on();
        tv.on();
        assertTrue(tv.isOn());

        tv.on();
        tv.off();
        tv.off();
        tv.off();
        tv.off();
        assertFalse(tv.isOn());
        tv.on();
        tv.off();
        tv.on();
        tv.off();
        assertFalse(tv.isOn());
        tv.on();
        tv.off();
        tv.on();
        tv.off();
        tv.on();
        assertTrue(tv.isOn());
        tv.off();
        assertFalse(tv.isOn());
    }

    @Test
    void increase_volume() {
        TV tv = new TV();

        assertFalse(tv.isOn());
        tv.increase_volume();
        tv.increase_volume();
        tv.increase_volume();
        tv.increase_volume();
        tv.increase_volume();
        tv.increase_volume();
        assertEquals(6, tv.getVolume());
        tv.increase_volume();
        tv.increase_volume();
        tv.increase_volume();
        tv.increase_volume();
        assertEquals(10, tv.getVolume());
        tv.decrease_volume();
        tv.decrease_volume();
        tv.decrease_volume();
        assertEquals(7, tv.getVolume());
        tv.increase_volume();
        tv.increase_volume();
        tv.increase_volume();
        tv.increase_volume();
        tv.decrease_volume();
        assertEquals(10, tv.getVolume());
    }

    @Test
    void decrease_volume() {
        TV tv = new TV();

        assertFalse(tv.isOn());
        assertEquals(0, tv.getVolume());

        tv.decrease_volume();
        tv.decrease_volume();
        tv.decrease_volume();
        tv.decrease_volume();
        assertEquals(0, tv.getVolume());

        tv.increase_volume();
        tv.increase_volume();
        tv.increase_volume();
        tv.increase_volume();
        tv.increase_volume();
        tv.decrease_volume();
        tv.decrease_volume();
        assertEquals(3, tv.getVolume());
        tv.increase_volume();
        tv.increase_volume();
        tv.increase_volume();
        tv.decrease_volume();
        tv.decrease_volume();
        tv.decrease_volume();
        tv.decrease_volume();
        tv.decrease_volume();
        tv.decrease_volume();
        tv.decrease_volume();
        tv.decrease_volume();
        tv.decrease_volume();
        tv.decrease_volume();
        assertEquals(0, tv.getVolume());
    }

    @Test
    void getVolume() {
        TV tv = new TV();
        int volume_count = 0;

        assertEquals(0, tv.getVolume());

        tv.decrease_volume();
        tv.decrease_volume();
        tv.decrease_volume();
        tv.decrease_volume();
        assertEquals(0, tv.getVolume());

        tv.increase_volume();
        volume_count++;
        tv.increase_volume();
        volume_count++;
        tv.increase_volume();
        volume_count++;
        tv.increase_volume();
        volume_count++;
        tv.increase_volume();
        volume_count++;
        tv.decrease_volume();
        volume_count--;
        tv.decrease_volume();
        volume_count--;
        assertEquals(volume_count, tv.getVolume());
        tv.increase_volume();
        volume_count++;
        tv.increase_volume();
        volume_count++;
        tv.increase_volume();
        volume_count++;
        tv.decrease_volume();
        volume_count--;
        assertEquals(volume_count, tv.getVolume());
        tv.decrease_volume();
        volume_count--;
        tv.decrease_volume();
        volume_count--;
        tv.decrease_volume();
        volume_count--;
        tv.decrease_volume();
        volume_count--;
        tv.decrease_volume();
        volume_count--;
        assertEquals(volume_count, tv.getVolume());
        tv.decrease_volume();
        tv.decrease_volume();
        tv.decrease_volume();
        tv.decrease_volume();
        assertEquals(volume_count, tv.getVolume());
    }

    @Test
    void isOn() {
        TV tv = new TV();

        assertFalse(tv.isOn());
        tv.decrease_volume();
        assertTrue(tv.isOn());
        tv.off();
        assertFalse(tv.isOn());
        tv.on();
        tv.off();
        tv.on();
        tv.on();
        assertTrue(tv.isOn());
        tv.on();
        tv.off();
        tv.on();
        tv.off();
        tv.off();
        assertFalse(tv.isOn());
        tv.on();
    }
}