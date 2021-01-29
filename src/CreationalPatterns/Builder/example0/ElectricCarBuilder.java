package CreationalPatterns.Builder.example0;

import java.awt.*;

/**
 * ConcreteBuilder.
 * In addition to the methods dedclared in the AbstractBuilder, it has a getResult method that returns the built product.
 */
public class ElectricCarBuilder extends CarBuilder {
    private Car car;

    @Override
    protected Car getResult() {
        return this.car;
    }

    @Override
    public void buildCar() {
        this.car = new Car();
    }

    @Override
    public void addEngine(String type) {
        this.car.setEngine(type);
    }

    @Override
    public void addWheel(String type) {
        this.car.addWheel(type);
    }

    @Override
    public void paint(Color color) {
        this.car.setColor(color);
    }

    @Override
    public void addTransmission(String type) {
        this.car.setTransmission(type);
    }

    @Override
    public void addGasTank() throws NoSuchThingInAnElectricCar{
        throw new NoSuchThingInAnElectricCar();
    }

    @Override
    public void addBatteries(String type) throws NoSuchThingInAGasolineCar {
        this.car.setBatteries(type);
    }
}
