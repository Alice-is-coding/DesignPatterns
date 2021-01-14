package CreationalPatterns.Factory.simplefactorywithregistration.example0;

import CreationalPatterns.Factory.simplefactory.example0.Vehicle;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/**
 * Improvement of the simpleFactory.
 * Making the factory open for extension but closed for modification by using a mechanism to register new classes
 * that will be instantiated when needed -> 2 ways to do it :
 *      . Registering product class objects and instantiating them using reflection
 *      . Registering product objects and adding a newInstance method to each product that returns a new instance of the same class as itself
 */
public class SimpleFactoryWithRegistration {
    // Map to keep the product IDs along with their corresponding classes.
    private Map<Integer, Vehicle> registeredProducts = new HashMap<>();
    private static Integer index = 0;

    // Method to register new products.
    public void registerVehicle(Vehicle vehicle) {
        registeredProducts.put(index, vehicle);
        index++;
    }

    // If performance is an issue, reflection may slow the program and so should be avoided.
    public Vehicle create(Vehicle vehicle) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        if(registeredProducts.containsValue(vehicle)) {
            return vehicle.getClass().getConstructor().newInstance();
        }
        return null;
    }
}
