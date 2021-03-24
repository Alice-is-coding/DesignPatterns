package BehavioralPatterns.Observer.example0.tests;

import BehavioralPatterns.Observer.example0.BankAccount;
import BehavioralPatterns.Observer.example0.BankAccountOwner;
import BehavioralPatterns.Observer.example0.Observer;
import BehavioralPatterns.Observer.example0.Subject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * BankAccountTest.
 *
 * @author Alice B.
 * @version 24/03/2021
 */
class BankAccountTest {
    private List<Observer> observers;
    private BankAccountSubjectTest bankAccount;

    /**
     * BankAccountSubjectTest.
     * To be able to use the credit and debit method by using introspection, and to be able to get the amounts.
     *
     * @author Alice B.
     * @version 24/03/2021
     */
    private class BankAccountSubjectTest extends BankAccount {
        private float bankAccount1;

        @Override
        public List<Observer> getObservers() {
            try {
                Method m = this.getClass().getSuperclass().getSuperclass().getDeclaredMethod("getObservers");
                m.setAccessible(true);
                return super.getObservers();
            }catch (Exception e) {
                return null;
            }
        }

        @Override
        public void credit(float amount) {
            bankAccount1 += amount;
            super.credit(amount);
        }

        @Override
        public void debit(float amount) {
            bankAccount1 -= amount;
            super.debit(amount);
        }

        public float getBankAccount() {
            return ((int)(this.bankAccount1 * 100)) / 100.F;
        }
    }

    /**
     * BankAccountOwnerObsTest.
     * To be able to count the number of time the observer was notified.
     *
     * @author Alice B.
     * @version 24/03/2021
     */
    private class BankAccountOwnerObsTest extends BankAccountOwner {
        private int count;

        @Override
        public void update(Subject observable, Object args) {
            count++;
            super.update(observable, args);
        }

        public int getCount() {
            return count;
        }
    }

    @BeforeEach
    void setUp() {
        bankAccount = new BankAccountSubjectTest();
        observers = bankAccount.getObservers();
    }

    @Test
    void attach() {
        Observer obs0 = new BankAccountOwner();
        Observer obs1 = new BankAccountOwner();
        Observer obs2 = new BankAccountOwner();
        Observer obs3 = new BankAccountOwner();
        boolean res;
        res = bankAccount.attach(obs0);
        assertTrue(observers.contains(obs0));
        assertTrue(res);
        res = bankAccount.attach(obs0);
        assertFalse(res);

        res = bankAccount.attach(obs1);
        assertTrue(observers.contains(obs1));
        assertTrue(res);
        res = bankAccount.attach(obs1);
        assertFalse(res);

        res = bankAccount.attach(obs2);
        assertTrue(observers.contains(obs2));
        assertTrue(res);
        res = bankAccount.attach(obs2);
        assertFalse(res);

        res = bankAccount.attach(obs3);
        assertTrue(observers.contains(obs3));
        assertTrue(res);
        res = bankAccount.attach(obs3);
        assertFalse(res);

        assertEquals(4, observers.size());
    }

    @Test
    void attachAll() {
        Observer obs0 = new BankAccountOwner();
        Observer obs1 = new BankAccountOwner();
        Observer obs2 = new BankAccountOwner();
        Observer obs3 = new BankAccountOwner();
        boolean res;

        res = bankAccount.attachAll(obs0, obs1, obs2);
        assertTrue(res);
        assertEquals(3, observers.size());
        assertTrue(observers.contains(obs0));
        assertTrue(observers.contains(obs1));
        assertTrue(observers.contains(obs2));

        res = bankAccount.attachAll(obs0, obs1, obs3);
        assertFalse(res);
        assertEquals(4, observers.size());
        assertTrue(observers.contains(obs3));
    }

    @Test
    void detach() {
        Observer obs0 = new BankAccountOwner();
        Observer obs1 = new BankAccountOwner();
        Observer obs2 = new BankAccountOwner();
        Observer obs3 = new BankAccountOwner();
        boolean res;

        bankAccount.attachAll(obs0, obs1);
        res = bankAccount.detach(obs2);
        assertFalse(res);

        res = bankAccount.detach(obs1);
        assertEquals(1, observers.size());
        assertFalse(observers.contains(obs1));
        assertTrue(observers.contains(obs0));

        bankAccount.attachAll(obs2, obs3);
        res = bankAccount.detach(obs3);
        assertTrue(res);
        assertFalse(observers.contains(obs3));
        assertEquals(2, observers.size());

        res = bankAccount.detach(obs1);
        assertFalse(res);

        res = bankAccount.detach(obs0);
        assertTrue(res);

        res = bankAccount.detach(obs2);
        assertTrue(res);
        assertTrue(observers.isEmpty());
    }

    @Test
    void detachAll() {
        Observer obs0 = new BankAccountOwner();
        Observer obs1 = new BankAccountOwner();
        Observer obs2 = new BankAccountOwner();
        Observer obs3 = new BankAccountOwner();
        boolean res;

        bankAccount.attachAll(obs0, obs1, obs3);
        assertEquals(3, observers.size());
        res = bankAccount.detachAll(obs0, obs1, obs2, obs3);
        assertFalse(res);
        assertTrue(observers.isEmpty());

        bankAccount.attachAll(obs1, obs2, obs3, obs0);
        res = bankAccount.detachAll(obs2, obs1, obs3);
        assertTrue(res);
        assertEquals(1, observers.size());
        assertTrue(observers.contains(obs0));
    }

    @Test
    void notifyObservers() {
        BankAccountOwnerObsTest obs0 = new BankAccountOwnerObsTest();
        BankAccountOwnerObsTest obs1 = new BankAccountOwnerObsTest();
        BankAccountOwnerObsTest obs2 = new BankAccountOwnerObsTest();
        BankAccountOwnerObsTest obs3 = new BankAccountOwnerObsTest();

        bankAccount.attachAll(obs0, obs2);
        bankAccount.credit(150);
        assertEquals(1, obs0.getCount());
        assertEquals(1, obs2.getCount());
        bankAccount.credit(1500);
        bankAccount.debit(256);
        assertEquals(3, obs0.getCount());
        assertEquals(3, obs2.getCount());
        bankAccount.detach(obs0);
        bankAccount.credit(845);
        assertEquals(3, obs0.getCount());
        assertEquals(4, obs2.getCount());
        bankAccount.attachAll(obs1, obs3);
        assertEquals(0, obs1.getCount());
        assertEquals(0, obs3.getCount());
        bankAccount.debit(845.25F);
        bankAccount.credit(147.84F);
        bankAccount.credit(25.0F);
        assertEquals(3, obs0.getCount());
        assertEquals(7, obs2.getCount());
        assertEquals(3, obs1.getCount());
        assertEquals(3, obs3.getCount());
    }

    @Test
    void credit() {
        bankAccount.credit(1852);
        bankAccount.credit(845.45F);
        assertEquals(2697.45F, bankAccount.getBankAccount());
        bankAccount.credit(954.23F);
        bankAccount.debit(2000);
        assertEquals(1651.68F, bankAccount.getBankAccount());
        bankAccount.debit(2500.50F);
        assertEquals(-848.82F, bankAccount.getBankAccount());
    }

    @Test
    void debit() {
        bankAccount.credit(1852);
        bankAccount.credit(845.45F);
        assertEquals(2697.45F, bankAccount.getBankAccount());
        bankAccount.credit(954.23F);
        bankAccount.debit(2000);
        assertEquals(1651.68F, bankAccount.getBankAccount());
        bankAccount.debit(2500.50F);
        assertEquals(-848.82F, bankAccount.getBankAccount());
    }

    /**
     * Here, I decided to use introspection to keep the generic aspect offered by the Subject interface.
     * Indeed, one weakness of this pattern is that every observable extending the Subject interface has to be the "same" :
     *
     *     Here, if we declare :
     *     Subject subject = new BankAccount();
     *     We won't be able to call directly the methods credit() and debit() -> There're not present in the interface, so it's not possible to call them.
     *
     * BUT here we would like to get a generic Observable/Subject interface. We know BankAccount has a credit() and a debit() method,
     * so we decided to use introspection instead in order to be able to use these methods even when we use the Subject interface to declare the object.
     *
     * Note : Even using introspection, the weakness is that, if we switch this declaration below from :
     *     Subject subject = new BankAccount();
     *     to :
     *     Subject subject = new ConcreteSubject2();
     * Introspection as used here won't work anymore (unless ConcreteSubject2 implements a credit and debit method).
     * Finally, note that it's all about finding the most appropriate solution.
     *
     * @throws NoSuchMethodException An Exception occurred... Did you change the ConcreteSubject as explained right above ? If it's the case, the problem might come from that change.
     * @throws InvocationTargetException An Exception occurred...
     * @throws IllegalAccessException An Exception occurred... As it is, you don't have the rights to invoke the method -> Try calling method.setAccessible(true) (!! Be careful with that method...).
     */
    @Test
    void testObservable() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Subject bankAccount = new BankAccount();
        Observer observer0 = new BankAccountOwner();
        Observer observer1 = new BankAccountOwner();
        Observer observer2 = new BankAccountOwner();
        bankAccount.attachAll(observer0, observer1, observer2);

        Method credit = bankAccount.getClass().getMethod("credit", float.class);
        Method debit = bankAccount.getClass().getMethod("debit", float.class);

        credit.invoke(bankAccount, 1522);
        credit.invoke(bankAccount, 152);
        debit.invoke(bankAccount, 1522);
        credit.invoke(bankAccount, 152);
        credit.invoke(bankAccount, 71);
        debit.invoke(bankAccount, 156);
    }

    /**
     * Here, I used a more "natural" way to proceed.
     */
    @Test
    void testObservable2() {
        // Here I used a more natural way to proceed.
        BankAccount bankAccount = new BankAccount();
        Observer observer0 = new BankAccountOwner();
        Observer observer1 = new BankAccountOwner();
        Observer observer2 = new BankAccountOwner();

        bankAccount.attachAll(observer0, observer1, observer2);
        bankAccount.credit(1522);
        bankAccount.credit( 152);
        bankAccount.debit( 1522);
        bankAccount.credit( 152);
        bankAccount.credit( 71);
        bankAccount.debit( 156);
    }
}