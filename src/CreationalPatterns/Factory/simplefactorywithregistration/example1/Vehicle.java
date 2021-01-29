package CreationalPatterns.Factory.simplefactorywithregistration.example1;

/**
 * AbstractProduct.
 *
 * @author Alice B.
 * @version 14/01/2021
 */
public abstract class Vehicle {
    /**
     * Returns a new instance of the class.
     * Note : Alternative to reflection. Here, dynamic linking avoid performance loss.
     *
     * @return A new instance of the class that extends the AbstractProduct (Vehicle).
     */
    public abstract Vehicle newInstance();
}
