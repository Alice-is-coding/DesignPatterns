package CreationalPatterns.Factory.factorymethod.example0;

/**
 * ConcreteProduct.
 *
 * @author Alice B.
 * @version 14/01/2021
 */
public class LargeTruck extends Truck {

    /**
     * To start the LargeTruck.
     */
    @Override
    public void start() {
        System.out.println("The LargeTruck is started !");
    }
}
