package CreationalPatterns.Factory.simplefactorywithregistration.example1;

/**
 * ConcreteProduct.
 *
 * @author Alice B.
 * @version 14/01/2021
 */
public class Car extends Vehicle{

    /**
     * Returns a new instance of the class.
     *
     * @return A new Car instance.
     */
    @Override
    public Vehicle newInstance() {
        return new Car();
    }
}
