package CreationalPatterns.Factory.factorymethod.example0;

/**
 * ConcreteProduct.
 *
 * @author Alice B.
 * @version 14/01/2021
 */
public class SedanCar extends Car {

    /**
     * To start the SedanCar.
     */
    @Override
    public void start() {
        System.out.println("The SedanCar is started !");
    }
}
