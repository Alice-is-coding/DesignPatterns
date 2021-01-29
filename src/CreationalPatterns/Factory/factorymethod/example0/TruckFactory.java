package CreationalPatterns.Factory.factorymethod.example0;

/**
 * ConcreteFactory.
 */
public class TruckFactory extends VehicleFactory{

    @Override
    protected Vehicle createVehicle(String size) {
        if(size == "small") {
            return new SmallTruck();
        }else if(size == "large") {
            return new LargeTruck();
        }
        return null;
    }
}
