package CreationalPatterns.Factory.factorymethod.example0;

public class SportCar extends Car {
    @Override
    protected void start() {
        System.out.println("The SportCar is started !");
    }
}
