package CreationalPatterns.Factory.factorymethod.example0;

import java.awt.*;

public class AnonymousFactory {
    public static void main(String[] args) {
       VehicleFactory  vehicleFactory = new VehicleFactory() {
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
