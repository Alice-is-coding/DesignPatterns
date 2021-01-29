package CreationalPatterns.Builder.example0;

import java.awt.*;

/**
 * The Director.
 * A class that directs how the object is built.
 * (In some variants of the Builder Pattern, this class is removed, its role being taken by either the client or the builder).
 *
 * @author Alice B.
 * @version 14/01/2021
 */
public class Director {

    /**
     * To build an electric Car.
     *
     * @param builder The builder in charge of building the Car object.
     * @return The Car built.
     * @throws NoSuchThingInAGasolineCar An exception has occured...  Does the builder is a gasoline car specialist ?...
     */
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

    /**
     * To build a gasoline Car.
     *
     * @param builder The builder in charge of building the Car object.
     * @return The Car built.
     * @throws NoSuchThingInAnElectricCar An exception has occured... Does the builder is an electric car specialist ?...
     */
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
