package BehavioralPatterns.Observer.example0.tests;

import BehavioralPatterns.Observer.example0.BankAccount;
import BehavioralPatterns.Observer.example0.BankAccountOwner;
import BehavioralPatterns.Observer.example0.Observer;
import BehavioralPatterns.Observer.example0.Subject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * BankAccountOwnerTest.
 *
 * @author Alice B.
 * @version 24/03/2021
 */
class BankAccountOwnerTest {
    private BankAccountSubjectTest bankAccount;

    /**
     * BankAccountSubjectTest.
     * To be able to use the credit and debit method by using introspection.
     *
     * @author Alice B.
     * @version 24/03/2021
     */
    private class BankAccountSubjectTest extends BankAccount {
        @Override
        public List<Observer> getObservers() {
            try {
                Method m = this.getClass().getSuperclass().getSuperclass().getDeclaredMethod("getObservers");
                m.setAccessible(true);
                return super.getObservers();
            } catch (Exception e) {
                return null;
            }
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
    }

    @Test
    void update() {
        BankAccountOwnerObsTest obs0 = new BankAccountOwnerObsTest();
        BankAccountOwnerObsTest obs1 = new BankAccountOwnerObsTest();
        BankAccountOwnerObsTest obs2 = new BankAccountOwnerObsTest();
        BankAccountOwnerObsTest obs3 = new BankAccountOwnerObsTest();

        bankAccount.attachAll(obs0, obs2, obs1);
        assertEquals(0, obs0.getCount() + obs2.getCount() + obs1.getCount() + obs3.getCount());
        bankAccount.credit(155);
        bankAccount.credit(155);
        bankAccount.credit(155);
        bankAccount.credit(155);
        bankAccount.credit(155);
        bankAccount.credit(155);
        bankAccount.credit(155);
        bankAccount.credit(155);
        bankAccount.credit(155);
        bankAccount.credit(155);
        bankAccount.credit(155);
        bankAccount.credit(155);
        bankAccount.credit(155);
        bankAccount.credit(155);
        bankAccount.credit(155);
        bankAccount.credit(155);
        bankAccount.credit(155);
        bankAccount.credit(155);
        bankAccount.credit(155);
        bankAccount.credit(155);
        bankAccount.credit(155);
        bankAccount.credit(155);
        assertEquals(22, obs0.getCount());
        assertEquals(22, obs2.getCount());
        assertEquals(22, obs1.getCount());
        assertEquals(0, obs3.getCount());
        bankAccount.detachAll(obs0, obs1);
        bankAccount.attach(obs3);
        bankAccount.debit(145);
        bankAccount.debit(145);
        bankAccount.debit(145);
        bankAccount.debit(145);
        bankAccount.debit(145);
        bankAccount.debit(145);
        bankAccount.debit(145);
        bankAccount.credit(845);
        bankAccount.credit(845);
        bankAccount.credit(845);
        bankAccount.credit(845);
        assertEquals(33, obs2.getCount());
        assertEquals(22, obs0.getCount());
        assertEquals(22, obs1.getCount());
        assertEquals(11, obs3.getCount());
    }
}