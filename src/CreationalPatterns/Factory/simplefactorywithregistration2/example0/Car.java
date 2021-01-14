package CreationalPatterns.Factory.simplefactorywithregistration2.example0;

public class Car extends Vehicle{
    @Override
    public Vehicle newInstance() {
        return new Car();
    }
}
