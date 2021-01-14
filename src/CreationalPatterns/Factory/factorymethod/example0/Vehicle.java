package CreationalPatterns.Factory.factorymethod.example0;

import java.awt.*;

public abstract class Vehicle {
    private Color color;

    protected abstract void start();

    public void testVehicle() {

    }

    public void setColor(Color color) {
        this.color = color;
    }
}
