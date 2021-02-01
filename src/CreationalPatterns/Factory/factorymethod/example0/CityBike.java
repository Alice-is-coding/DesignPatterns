package CreationalPatterns.Factory.factorymethod.example0;

/**
 * ConcreteProduct.
 *
 * @author Alice B.
 * @version 14/01/2021
 */
public class CityBike extends Bike {
    /**
     * To start using the CityBike.
     */
    @Override
    public void start() {
        System.out.println("You are cycling with the CityBike !");
    }
}
