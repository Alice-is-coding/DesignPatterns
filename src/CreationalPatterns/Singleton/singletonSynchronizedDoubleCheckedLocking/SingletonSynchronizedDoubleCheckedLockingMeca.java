package CreationalPatterns.Singleton.singletonSynchronizedDoubleCheckedLocking;

/**
 * To start the lock mecanism only if the Singleton object isn't instantiated.
 */
public class SingletonSynchronizedDoubleCheckedLockingMeca {
    private static SingletonSynchronizedDoubleCheckedLockingMeca instance;

    private SingletonSynchronizedDoubleCheckedLockingMeca() {
        System.out.println("SingletonSynchronizedDoubleCheckedLockingMeca is instantiated.");
    }

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
