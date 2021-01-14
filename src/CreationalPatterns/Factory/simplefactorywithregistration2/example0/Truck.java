package CreationalPatterns.Factory.simplefactorywithregistration2.example0;

public class Truck extends Vehicle{

    @Override
    public Vehicle newInstance() {
        return new Truck();
    }
}
