package CreationalPatterns.Factory.factorymethod.example0;

import java.awt.*;

/**
 * The factory method pattern is an improvement upon the static factory. The factory class is
 * made abstract and the code to instantiate specific products is moved to subclasses that
 * implement an abstract method. This way, the factory class can be extended without being
 * modified.
 */
public abstract class VehicleFactory {
    // Also usage of the Template Method.
    protected abstract Vehicle createVehicle(String item);

    public Vehicle orderVehicle(String size, Color color) {
        Vehicle vehicle = createVehicle(size);
        vehicle.testVehicle();
        vehicle.setColor(color);
        return vehicle;
    }
}
