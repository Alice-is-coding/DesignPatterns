package CreationalPatterns.Builder.example0;

/**
 * The Main.
 *
 * @author Alice B.
 * @version 14/01/2021
 */
public class Main {
    public static void main(String[] args) throws NoSuchThingInAGasolineCar, NoSuchThingInAnElectricCar {
        Director director = new Director();
        Car electricCar = director.buildElectricCar(new ElectricCarBuilder());
        System.out.println(electricCar.toString());

        Car gasolineCar = director.buildGasolineCar(new GasolineCarBuilder());
        System.out.println(gasolineCar.toString());
    }
}
