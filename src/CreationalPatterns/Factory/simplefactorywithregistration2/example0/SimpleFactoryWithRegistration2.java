package CreationalPatterns.Factory.simplefactorywithregistration2.example0;

import java.util.HashMap;
import java.util.Map;

public class SimpleFactoryWithRegistration2 {
    private Map<Integer, Vehicle> registeredProducts = new HashMap<>();
    private static Integer index = 0;

    public void registerProduct(Vehicle vehicle) {
        registeredProducts.put(index, vehicle);
        index++;
    }

    // Dynamic linking usage in order to return the right instance of the right class.
    public Vehicle create(Vehicle vehicle) {
        if(registeredProducts.containsValue(vehicle)) {
            return vehicle.newInstance();
        }
        return null;
    }
}
