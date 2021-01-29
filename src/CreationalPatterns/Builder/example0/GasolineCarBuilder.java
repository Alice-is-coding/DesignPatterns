package CreationalPatterns.Builder.example0;

import java.awt.*;

/**
 * ConcreteBuilder.
 */
public class GasolineCarBuilder extends CarBuilder {
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
    public void addGasTank() throws NoSuchThingInAnElectricCar {
        this.car.setGasTank();
    }

    @Override
    public void addBatteries(String type) throws NoSuchThingInAGasolineCar {
        throw new NoSuchThingInAGasolineCar();
    }
}
