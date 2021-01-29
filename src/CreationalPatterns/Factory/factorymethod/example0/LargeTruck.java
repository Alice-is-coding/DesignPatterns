package CreationalPatterns.Factory.factorymethod.example0;

/**
 * ConcreteProduct.
 */
public class LargeTruck extends Truck {

    @Override
    protected void start() {
        System.out.println("The LargeTruck is started !");
    }
}
