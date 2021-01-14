package CreationalPatterns.Factory.simplefactory.example0;

/**
 * (Also called "Static Factory").
 * The factory pattern is used to encapsulate the logic to instantiate objects referred through a common interface.
 * New classes can be added with minimal changes.
 *
 * SimpleFactory.
 */
public class VehicleFactory {

    public enum VehicleType {
        Bike, Car, Truck
    }
    public static Vehicle create(VehicleType type) {
        if(type.equals(VehicleType.Bike)) {
            return new Bike();
        }
        if(type.equals(VehicleType.Car)) {
            return new Car();
        }
        if(type.equals(VehicleType.Truck)) {
            return new Truck();
        }
        return null;
    }
}
