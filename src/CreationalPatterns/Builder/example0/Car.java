package CreationalPatterns.Builder.example0;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Product.
 *
 * @author Alice B.
 * @version 14/01/2021
 */
public class Car {
    /** The engine of the Car. */
    private String engine;
    /** The list of wheels used for the Car. */
    private List<String> wheels;
    /** The color of the Car. */
    private Color color;
    /** The transmission of the Car. */
    private String transmission;
    /** true if the car has a gasTank, false otherwise. */
    private boolean gasTank;
    /** The batteries of the Car (optional...). */
    private String batteries;

    /**
     * Constructor.
     */
    public Car() {
        this.wheels = new ArrayList<>();
    }

    /**
     * Engine setter.
     *
     * @param type The type of engine to set.
     */
    public void setEngine(String type) {
        this.engine = type;
    }

    /**
     * To add a wheel to the car.
     *
     * @param type The type of wheel to be added.
     */
    public void addWheel(String type) {
        this.wheels.add(type);
    }

    /**
     * Color setter.
     *
     * @param color The color to set for the Car.
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * Transmission setter.
     *
     * @param type The type of transmission to set for the Car.
     */
    public void setTransmission(String type) {
        this.transmission = type;
    }

    /**
     * GasTank boolean setter.
     */
    public void setGasTank() {
        this.gasTank = true;
    }

    /**
     * Batteries setter.
     *
     * @param type The type of batteries to set for the Car.
     */
    public void setBatteries(String type) {
        this.batteries = type;
    }

    /**
     * An understandable representation of the object.
     *
     * @return The object state readable for a Human Being.
     */
    @Override
    public String toString() {
        String result = "";

        result += "Engine : " + this.engine + "\n";
        result += "Wheels : Number " + this.wheels.size() + " ; Type : " + this.wheels.get(0) + "\n";
        result += "Color : "+ this.color.toString() +"\n";
        result += "Transmission : "+ this.transmission +"\n";
        result += "GasTank : "+ this.gasTank +"\n";
        if(this.batteries != null) {
            result += "Batteries : " + this.batteries + "\n";
        }else {
            result += "Batteries : None.";
        }
        return result;
    }
}
