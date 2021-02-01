package CreationalPatterns.Factory.simplefactorywithregistration.example1;

/**
 * ConcreteProduct.
 *
 * @author Alice B.
 * @version 14/01/2021
 */
public class Bike extends Vehicle {

    /**
     * Returns a new instance of the class.
     *
     * @return A new Bike instance.
     */
    @Override
    public Vehicle newInstance() {
        return new Bike();
    }
}
