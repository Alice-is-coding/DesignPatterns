package CreationalPatterns.Singleton.singletonSynchronizedDoubleCheckedLocking.example0;

/**
 * To start the lock mechanism only if the Singleton object isn't instantiated.
 *
 * @author Alice B.
 * @version 29/01/2021
 */
public class SingletonSynchronizedDoubleCheckedLockingMeca {
    private static SingletonSynchronizedDoubleCheckedLockingMeca instance;

    /**
     * Private constructor.
     */
    private SingletonSynchronizedDoubleCheckedLockingMeca() {
        System.out.println("SingletonSynchronizedDoubleCheckedLockingMeca is instantiated.");
    }

    /**
     * Thread-safe and double checking mechanism to avoid performance loss.
     *
     * @return The unique instance of the class.
     */
    public static synchronized SingletonSynchronizedDoubleCheckedLockingMeca getInstance() {
        // Adding an additional condition before the synchronized block will move the thread-safe locking
        // only when the singleton has not been instantiated yet.
        if(instance == null) {
            synchronized (SingletonSynchronizedDoubleCheckedLockingMeca.class) {
                // (instance == null) checked twice : Necessary to make sure a check is done in the synchronized block too.
                if(instance == null) {
                    instance = new SingletonSynchronizedDoubleCheckedLockingMeca();
                }
            }
        }
        return instance;
    }
}
