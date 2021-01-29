package CreationalPatterns.Factory.factorymethod.example0;

/**
 * ConcreteProduct.
 */
public class MountainBike  extends Bike {
    @Override
    protected void start() {
        System.out.println("You are cycling with the MountainBike !");
    }
}
