package CreationalPatterns.Factory.factorymethod.example0;

/**
 * ConcreteProduct.
 */
public class SmallTruck extends Truck {

    @Override
    protected void start() {
        System.out.println("The SmallTruck is started !");
    }
}
