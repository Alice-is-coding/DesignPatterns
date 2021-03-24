package BehavioralPatterns.Observer.example0;

/**
 * BankAccount.
 * ConcreteSubject.
 * To manage a bank account (really basic implementation).
 *
 * @author Alice B.
 * @version 23/03/2021
 */
public class BankAccount extends Subject{
    /** The bank account to manage. */
    private float bankAccount;

    /**
     * Constructor.
     */
    public BankAccount() {
        super();
    }

    /**
     * To attach a new observer to the list of observers in order for it to be notified when state changes.
     *
     * @param observer The ConcreteObserver to be attached to the list.
     * @return true if everything went ok, false otherwise.
     */
    @Override
    public boolean attach(Observer observer) {
        if(this.observers.contains(observer)) {
            return false;
        }
        return this.observers.add(observer);
    }

    /**
     * To attach an unlimited number of observers to the list of observers to notify.
     *
     * @param observers The ConcreteObserver objects to be attached to the list.
     * @return true if everything went ok, false otherwise.
     */
    @Override
    public boolean attachAll(Observer... observers) {
        boolean res = true;
        for(Observer observer : observers) {
            res &= attach(observer);
        }
        return res;
    }

    /**
     * To detach an observer from the list so that it won't be notified anymore.
     *
     * @param observer The ConcreteObserver to be detached from the list.
     * @return true if everything went ok, false otherwise.
     */
    @Override
    public boolean detach(Observer observer) {
        if(!this.observers.contains(observer)) {
            return false;
        }
        return this.observers.remove(observer);
    }

    /**
     * To detach an unlimited number of observers from the list of observers so that they won't be notified anymore.
     *
     * @param observers The ConcreteObserver objects to be detached from the list.
     * @return true if everything went ok, false otherwise.
     */
    @Override
    public boolean detachAll(Observer... observers) {
        boolean res = true;
        for(Observer observer : observers) {
            res &= detach(observer);
        }
        return res;
    }

    /** To notify the observers from the list (should be called when the state changed). */
    @Override
    public void notifyObservers() {
        for(Observer observer : this.observers) {
            observer.update(this, this.bankAccount);
        }
    }

    /**
     * To credit a certain amount of money to the bank account.
     *
     * @param amount The amount to be credited.
     */
    public void credit(float amount) {
        this.bankAccount += amount;
        notifyObservers();
    }

    /**
     * To debit a certain amount of money from the bank account.
     *
     * @param amount The amount to be debited.
     */
    public void debit(float amount) {
        this.bankAccount -= amount;
        notifyObservers();
    }
}
