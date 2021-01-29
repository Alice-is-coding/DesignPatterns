package CreationalPatterns.Factory.factorymethod.example0;

/**
 * ConcreteProduct.
 *
 * @author Alice B.
 * @version 14/01/2021
 */
public class SportCar extends Car {
    /**
     * To start the SportCar.
     */
    @Override
    public void start() {
        System.out.println("The SportCar is started !");
    }
}
