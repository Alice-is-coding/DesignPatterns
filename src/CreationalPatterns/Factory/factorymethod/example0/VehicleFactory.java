package CreationalPatterns.Factory.factorymethod.example0;

import java.awt.*;

/**
 * AbstractFactory.
 *
 * @author Alice B.
 * @version 14/01/2021
 */
public abstract class VehicleFactory {
    // Also usage of the Template Method.
    // The concrete factories have to implement this method !

    /**
     * To create the Vehicle.
     *
     * @param item The item which will make the difference between what to create...
     *             Ex: The size of the Vehicle.
     * @return A new Vehicle.
     */
    protected abstract Vehicle createVehicle(String item);

    /**
     * To order a Vehicle.
     * (Used by the Client).
     *
     * @param size  The size of the Vehicle.
     * @param color Its color.
     * @return
     */
    public Vehicle orderVehicle(String size, Color color) {
        Vehicle vehicle = createVehicle(size);
        if (vehicle != null) {
            vehicle.testVehicle();
            vehicle.setColor(color);
        }
        return vehicle;
    }
}
