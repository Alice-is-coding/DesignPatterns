package CreationalPatterns.Builder.example0;

import java.awt.*;

/**
 * The AbstractBuilder.
 * Its role is to expose only the functionality required to build the Product, hiding the rest.
 *
 * @author Alice 14/01/2021
 */
public abstract class CarBuilder {
    /**
     * Return the car built.
     * The final result.
     *
     * @return The car built.
     */
    protected abstract Car getResult();

    /**
     * Create a new instance of the Car in order to construct it.
     * (The main structure of the Car).
     */
    public abstract void buildCar();

    /**
     * To add an engine to the Car.
     *
     * @param type The type of engine to add.
     */
    public abstract void addEngine(String type);

    /**
     * To add a wheel to the Car.
     *
     * @param type The type of wheel to add to the Car.
     */
    public abstract void addWheel(String type);

    /**
     * To paint the car with a specific color.
     *
     * @param color The color chosen for the Car.
     */
    public abstract void paint(Color color);

    /**
     * To add a transmission to the Car.
     *
     * @param type The type of transmission to add to the car.
     */
    public abstract void addTransmission(String type);

    /**
     * To add a gas tank to the Car.
     *
     * @throws NoSuchThingInAnElectricCar An electric car isn't supposed to have a gas tank...
     */
    public abstract void addGasTank() throws NoSuchThingInAnElectricCar;

    /**
     * To add batteries to the Car.
     *
     * @param type The type of batteries to add to the Car.
     * @throws NoSuchThingInAGasolineCar A gasoline car isn't supposed to have batteries...
     */
    public abstract void addBatteries(String type) throws NoSuchThingInAGasolineCar;

    /**
     * Car getter.
     *
     * @return The final result.
     */
    public Car getCar() {
        return getResult();
    }
}
