package CreationalPatterns.Factory.simplefactorywithregistration.example0;

import CreationalPatterns.Factory.simplefactory.example0.Vehicle;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/**
 * Improvement of the simpleFactory.
 * Making the factory open for extension but closed for modification by using a mechanism to register new classes
 * that will be instantiated when needed.
 *
 * @author Alice B.
 * @version 14/01/2021
 */
public class SimpleFactoryWithRegistration {

    // Map to keep the product IDs along with their corresponding classes.
    private Map<Integer, Vehicle> registeredProducts = new HashMap<>();
    private static Integer index = 0;

    /**
     * To register new Products.
     *
     * @param vehicle The new Product (Vehicle) to register.
     */
    public void registerVehicle(Vehicle vehicle) {
        registeredProducts.put(index, vehicle);
        index++;
    }

    // If performance is an issue, reflection may slow the program and so should be avoided.

    /**
     * To create a new instance of the Product requested if it's registered, thanks to reflection.
     * Note : If performance is an issue, reflection may slow the program and so should be avoided.
     *
     * @param vehicle The Product to create.
     * @return A new instance of the Product passed in param, null if it hasn't been previously registered.
     *
     * @throws NoSuchMethodException A matching method hasn't been found...
     * @throws IllegalAccessException Underlying constructor inaccessible...
     * @throws InvocationTargetException The underlying constructor threw an exception...
     * @throws InstantiationException The class that declares the underlying constructor is abstract...
     */
    public Vehicle create(Vehicle vehicle) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        if(registeredProducts.containsValue(vehicle)) {
            return vehicle.getClass().getConstructor().newInstance();
        }
        return null;
    }
}
