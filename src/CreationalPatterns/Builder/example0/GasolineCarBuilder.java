package CreationalPatterns.Builder.example0;

import java.awt.*;

/**
 * ConcreteBuilder.
 *
 * @author Alice B.
 * @version 14/01/2021
 */
public class GasolineCarBuilder extends CarBuilder {
    /** The Car to build. */
    private Car car;

    /**
     * Return the gasoline car built.
     * The final result.
     *
     * @return The gasoline car built.
     */
    @Override
    protected Car getResult() {
        return this.car;
    }

    /**
     * Create a new instance of the Car in order to construct it.
     * (The main structure of the Car).
     */
    @Override
    public void buildCar() {
        this.car = new Car();
    }

    /**
     * To add an engine to the Car.
     *
     * @param type The type of engine to add.
     */
    @Override
    public void addEngine(String type) {
        this.car.setEngine(type);
    }

    /**
     * To add a wheel to the Car.
     *
     * @param type The type of wheel to add to the Car.
     */
    @Override
    public void addWheel(String type) {
        this.car.addWheel(type);
    }

    /**
     * To paint the car with a specific color.
     *
     * @param color The color chosen for the Car.
     */
    @Override
    public void paint(Color color) {
        this.car.setColor(color);
    }

    /**
     * To add a transmission to the Car.
     *
     * @param type The type of transmission to add to the car.
     */
    @Override
    public void addTransmission(String type) {
        this.car.setTransmission(type);
    }

    /**
     * To add a gas tank to the Car.
     *
     * @throws NoSuchThingInAnElectricCar An electric car isn't supposed to have a gas tank...
     */
    @Override
    public void addGasTank() throws NoSuchThingInAnElectricCar {
        this.car.setGasTank();
    }

    /**
     * To add batteries to the Car.
     *
     * @param type The type of batteries to add to the Car.
     * @throws NoSuchThingInAGasolineCar A gasoline car isn't supposed to have batteries...
     */
    @Override
    public void addBatteries(String type) throws NoSuchThingInAGasolineCar {
        throw new NoSuchThingInAGasolineCar();
    }
}
