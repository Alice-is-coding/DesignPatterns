package CreationalPatterns.Factory.factorymethod.example0;

public class SmallTruck extends Truck {

    @Override
    protected void start() {
        System.out.println("The SmallTruck is started !");
    }
}
