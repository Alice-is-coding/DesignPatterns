package CreationalPatterns.Factory.factorymethod.example0;

/**
 * ConcreteFactory.
 *
 * @author Alice B.
 * @version 14/01/2021
 */
public class CarFactory extends VehicleFactory{

    /**
     * To create a Car.
     *
     * @param size The size of the Car.
     * @return A new Car.
     */
    @Override
    protected Vehicle createVehicle(String size) {
        if(size == "small") {
            return new SportCar();
        }else if(size == "large") {
            return new SedanCar();
        }
        return null;
    }
}
