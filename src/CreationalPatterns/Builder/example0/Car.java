package CreationalPatterns.Builder.example0;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Product.
 */
public class Car {
    private String engine;
    private List<String> wheels;
    private Color color;
    private String transmission;
    private boolean gasTank;
    private String batteries;

    public Car() {
        this.wheels = new ArrayList<>();
    }

    public void setEngine(String type) {
        this.engine = type;
    }

    public void addWheel(String type) {
        this.wheels.add(type);
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setTransmission(String type) {
        this.transmission = type;
    }

    public void setGasTank() {
        this.gasTank = true;
    }

    public void setBatteries(String type) {
        this.batteries = type;
    }

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
