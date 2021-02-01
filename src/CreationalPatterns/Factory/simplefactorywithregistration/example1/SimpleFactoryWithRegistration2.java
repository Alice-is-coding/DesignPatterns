package CreationalPatterns.Factory.simplefactorywithregistration.example1;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/**
 * Same as in "example0" BUT here we used dynamic linking in order to return the right instance of the right class !
 * Cf. method "newInstance" in abstract class Vehicle that has to be implemented in every subclass.
 *
 * @author Alice B.
 * @version 14/01/2021
 */
public class SimpleFactoryWithRegistration2 {

    // Map to keep the product IDs along with their corresponding classes.
    private Map<Integer, Vehicle> registeredProducts = new HashMap<>();
    private static Integer index = 0;

    /**
     * To register new Products.
     *
     * @param vehicle The new Product (Vehicle) to register.
     */
    public void registerProduct(Vehicle vehicle) {
        registeredProducts.put(index, vehicle);
        index++;
    }

    /**
     * To create a new instance of the Product requested if it's registered, thanks to dynamic linking usage.
     *
     * @param vehicle The Product to create.
     * @return A new instance of the Product passed in param, null if it hasn't been previously registered.
     */
    public Vehicle create(Vehicle vehicle) {
        if(registeredProducts.containsValue(vehicle)) {
            // Dynamic linking usage in order to return the right instance of the right class.
            return vehicle.newInstance();
        }
        return null;
    }
}
