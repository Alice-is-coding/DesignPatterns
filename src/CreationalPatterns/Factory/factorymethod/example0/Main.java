package CreationalPatterns.Factory.factorymethod.example0;

import java.awt.*;

/**
 * The Main.
 *
 * @author Alice B.
 * @version 14/01/2021
 */
public class Main {
    public static void main(String[] args) {
        VehicleFactory carFactory = new CarFactory();
        Vehicle vehicle = carFactory.orderVehicle("small", Color.BLACK);
        vehicle.start();

        VehicleFactory truckFactory = new TruckFactory();
        Vehicle truck = truckFactory.orderVehicle("small", Color.RED);
        truck.start();
    }
}

