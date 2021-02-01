package CreationalPatterns.Factory.factorymethod.example0;

import java.awt.*;

/**
 * AbstractProduct.
 *
 * @author Alice B.
 * @version 14/01/2021
 */
public abstract class Vehicle {
    /** The color of the Vehicle. */
    private Color color;

    /** To start the Vehicle. */
    public abstract void start();

    /** To test the Vehicle. */
    public void testVehicle() {
        System.out.println("Test OK. ");
    }

    /**
     * Color setter.
     *
     * @param color The color chosen for the Vehicle.
     */
    public void setColor(Color color) {
        this.color = color;
    }
}
