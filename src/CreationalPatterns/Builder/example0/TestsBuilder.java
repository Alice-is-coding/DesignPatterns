package CreationalPatterns.Builder.example0;

/**
 * Tests of the Builder pattern.
 *
 * @author Alice B.
 * @version 04/02/2021
 */
public class TestsBuilder extends junit.framework.TestCase {
    /**
     * Tests that the building of cars goes well.
     *
     * @throws NoSuchThingInAGasolineCar An exception occurred...
     * @throws NoSuchThingInAnElectricCar An exception occurred...
     */
    public void test_builderCreation() throws NoSuchThingInAGasolineCar, NoSuchThingInAnElectricCar {
        Director director = new Director();

        Car electricCar = director.buildElectricCar(new ElectricCarBuilder());
        assertTrue(electricCar.toString().contains("Electric"));

        Car gasolineCar = director.buildGasolineCar(new GasolineCarBuilder());
        assertTrue(gasolineCar.toString().contains("Gasoline"));
    }

    /**
     * Tests that the exceptions behave as expected.
     */
    public void test_exceptions() {
        Director director = new Director();

        try {
            Car electricCar = director.buildElectricCar(new GasolineCarBuilder());
            fail("NoSuchThingInAGasolineCar exception expected ! ");
        }catch (Exception e) {
            assertTrue(e instanceof NoSuchThingInAGasolineCar);
        }

        try {
            Car gasolineCar = director.buildGasolineCar(new ElectricCarBuilder());
            fail("NoSuchThingInAnElectricCar exception expected ! ");
        }catch (Exception e) {
            assertTrue(e instanceof NoSuchThingInAnElectricCar);
        }
    }
}
