package BehavioralPatterns.Observer.example0;

/**
 * BankAccountOwner.
 * ConcreteObserver.
 *
 * To watch a bank account.
 *
 * @author Alice B.
 * @version 23/03/2021
 */
public class BankAccountOwner implements Observer {
    /**
     * To update the observer accordingly to the changes occurred in the Subject.
     *
     * @param observable The ConcreteSubject whose state changed.
     * @param args       Arguments following the changes (Changes themselves or others).
     */
    @Override
    public void update(Subject observable, Object args) {
        System.out.println(this + " updated by : " + observable + " - New balance : " + args);
    }
}
