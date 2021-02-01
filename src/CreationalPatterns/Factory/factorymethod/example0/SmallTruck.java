package CreationalPatterns.Factory.factorymethod.example0;

/**
 * ConcreteProduct.
 *
 * @author Alice B.
 * @version 14/01/2021
 */
public class SmallTruck extends Truck {

    /**
     * To start the SmallTruck.
     */
    @Override
    public void start() {
        System.out.println("The SmallTruck is started !");
    }
}
