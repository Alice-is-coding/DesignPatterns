package CreationalPatterns.Factory.simplefactorywithregistration2.example0;

public class Bike extends Vehicle {

    @Override
    public Vehicle newInstance() {
        return new Bike();
    }
}
