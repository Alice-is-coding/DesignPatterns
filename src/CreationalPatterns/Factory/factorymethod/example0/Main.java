package CreationalPatterns.Factory.factorymethod.example0;

import java.awt.*;

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

