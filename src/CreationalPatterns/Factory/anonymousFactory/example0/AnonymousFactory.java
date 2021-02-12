package CreationalPatterns.Factory.anonymousFactory.example0;

import CreationalPatterns.Factory.factorymethod.example0.CityBike;
import CreationalPatterns.Factory.factorymethod.example0.MountainBike;
import CreationalPatterns.Factory.factorymethod.example0.Vehicle;
import CreationalPatterns.Factory.factorymethod.example0.VehicleFactory;

import java.awt.*;

/**
 * AnonymousFactory.
 *
 * @author Alice B.
 * @version 14/01/2021
 *
 * TODO: Readme.txt
 */
public class AnonymousFactory {
    public static void main(String[] args) {
        // We use an abstract factory...
       VehicleFactory vehicleFactory = new VehicleFactory() {
            @Override
            protected Vehicle createVehicle(String size) {
                if(size == "small") {
                    return new MountainBike();
                }else if(size == "large") {
                    return new CityBike();
                }
                return null;
            }
        };

        Vehicle vehicle = vehicleFactory.orderVehicle("small", Color.BLUE);
        vehicle.start();
    }
}
