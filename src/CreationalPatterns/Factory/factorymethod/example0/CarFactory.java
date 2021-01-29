package CreationalPatterns.Factory.factorymethod.example0;

/**
 * ConcreteFactory.
 */
public class CarFactory extends VehicleFactory{

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
