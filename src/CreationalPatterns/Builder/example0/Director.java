package CreationalPatterns.Builder.example0;

import java.awt.*;

/**
 * The Director.
 * A class that directs how the object is built.
 * (In some variants of the Builder Pattern, this class is removed, its role being taken by either the client or the builder).
 */
public class Director {

    public Car buildElectricCar(CarBuilder builder) throws NoSuchThingInAGasolineCar {
        builder.buildCar();
        builder.addEngine("Electric 150 KW");
        builder.addBatteries("1500 KWh");
        builder.addTransmission("Manual");

        for(int i = 0; i < 4; i++) {
            builder.addWheel("20x12x30");
        }
        builder.paint(Color.RED);
        return builder.getCar();
    }

    public Car buildGasolineCar(CarBuilder builder) throws NoSuchThingInAnElectricCar {
        builder.buildCar();
        builder.addEngine("Gasoline");
        builder.addGasTank();
        builder.addTransmission("Automatic");

        for(int i = 0; i < 4; i++) {
            builder.addWheel("20x12x30");
        }
        builder.paint(Color.darkGray);
        return builder.getCar();
    }


}
