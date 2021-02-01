package CreationalPatterns.Factory.factorymethod.example0;

/**
 * ConcreteFactory.
 *
 * @author Alice B.
 * @version 14/01/2021
 */
public class TruckFactory extends VehicleFactory{

    /**
     * To create a Truck.
     *
     * @param size The size of the Truck.
     * @return A new Truck.
     */
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
