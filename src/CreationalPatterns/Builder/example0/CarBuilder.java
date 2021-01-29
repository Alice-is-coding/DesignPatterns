package CreationalPatterns.Builder.example0;

import java.awt.*;

/**
 * The AbstractBuilder.
 * Its role is to expose only the functionality required to build the Product, hiding the rest.
 */
public abstract class CarBuilder {
    protected abstract Car getResult();
    public abstract void buildCar();
    public abstract void addEngine(String type);
    public abstract void addWheel(String type);
    public abstract void paint(Color color);
    public abstract void addTransmission(String type);
    public abstract void addGasTank() throws NoSuchThingInAnElectricCar;
    public abstract void addBatteries(String type) throws NoSuchThingInAGasolineCar;

    public Car getCar() {
        return getResult();
    }
}
