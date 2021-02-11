package CreationalPatterns.Factory.factorymethod.example0;

import java.awt.*;

/**
 * Tests of the Factory Method pattern.
 *
 * @author Alice B.
 * @version 04/02/2021
 */
public class TestsFactoryMethod extends junit.framework.TestCase {
    public void testCarFactory() {
        VehicleFactory vehicleFactory = new CarFactory();

        Vehicle vehicle0 = vehicleFactory.orderVehicle("small", Color.DARK_GRAY);
        assertTrue(vehicle0 instanceof SportCar);

        Vehicle vehicle1 = vehicleFactory.orderVehicle("large", Color.WHITE);
        assertTrue(vehicle1 instanceof SedanCar);

        Vehicle vehicle2 = vehicleFactory.orderVehicle("fast", Color.RED);
        assertNull(vehicle2);
    }

    public void testTruckFactory() {
        VehicleFactory vehicleFactory = new TruckFactory();

        Vehicle vehicle0 = vehicleFactory.orderVehicle("small", Color.ORANGE);
        assertTrue(vehicle0 instanceof SmallTruck);

        Vehicle vehicle1 = vehicleFactory.orderVehicle("large", Color.BLUE);
        assertTrue(vehicle1 instanceof LargeTruck);

        Vehicle vehicle2 = vehicleFactory.orderVehicle("fast", Color.RED);
        assertNull(vehicle2);
    }
}
