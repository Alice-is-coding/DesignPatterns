package CreationalPatterns.Factory.simplefactory.example0;

/**
 * Tests of the Simple Factory pattern.
 *
 * @author Alice B.
 * @version 04/02/2021
 */
public class TestsSimpleFactory extends junit.framework.TestCase {
    public void testFactory() {
        Vehicle vehicle = VehicleFactory.create(VehicleFactory.VehicleType.Bike);
        assertTrue(vehicle instanceof Bike);

        vehicle = VehicleFactory.create(VehicleFactory.VehicleType.Car);
        assertTrue(vehicle instanceof Car);

        vehicle = VehicleFactory.create(VehicleFactory.VehicleType.Truck);
        assertTrue(vehicle instanceof Truck);
    }
}
