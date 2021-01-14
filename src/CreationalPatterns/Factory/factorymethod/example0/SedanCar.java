package CreationalPatterns.Factory.factorymethod.example0;

public class SedanCar extends Car {

    @Override
    protected void start() {
        System.out.println("The SedanCar is started !");
    }
}
