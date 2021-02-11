package CreationalPatterns.Factory.simplefactorywithregistration.example0;

import CreationalPatterns.Factory.simplefactory.example0.Bike;
import CreationalPatterns.Factory.simplefactory.example0.Car;
import CreationalPatterns.Factory.simplefactory.example0.Vehicle;

import java.lang.reflect.InvocationTargetException;

public class TestsSimpleFactoryRegistration0 extends junit.framework.TestCase {
    public void testSimpleFactoryWithRegistration() throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        SimpleFactoryWithRegistration factory = new SimpleFactoryWithRegistration();
        factory.registerVehicle(new Car());
        factory.registerVehicle(new Bike());

        Vehicle vehicle = factory.create(0);
        assertTrue("Vehicle : " + vehicle, vehicle instanceof Car);

        Vehicle vehicle1 = factory.create(1);
        assertTrue(vehicle1 instanceof Bike);

        Vehicle vehicle2 = factory.create(2);
        assertNull(vehicle2);
    }
}
