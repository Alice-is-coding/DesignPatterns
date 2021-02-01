package CreationalPatterns.Factory.simplefactory.example0;

/**
 * SimpleFactory.
 *
 * @author Alice B.
 * @version 14/01/2021
 */
public class VehicleFactory {

    /**
     * Define a collection of constants.
     * Note : Enum is a special kind of Java class and is used when we know all possible values at compile time, such as
     *        choices on a menu, ...
     */
    public enum VehicleType {
        Bike, Car, Truck
    }

    /**
     * Create a Vehicle depending on its type.
     *
     * @param type The type of Vehicle chosen.
     * @return A new Vehicle (ConcreteProduct).
     */
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
