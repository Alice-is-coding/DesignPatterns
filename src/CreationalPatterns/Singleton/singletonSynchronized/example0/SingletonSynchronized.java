package CreationalPatterns.Singleton.singletonSynchronized.example0;

/**
 * Useful for multithreading.
 *
 * @author Alice B.
 * @version 29/01/2021
 */
public class SingletonSynchronized {
    private static SingletonSynchronized instance;

    /**
     * Private constructor.
     */
    private SingletonSynchronized(){
        System.out.println("SingletonSinchronized is instanciated");
    }

    /**
     * Making the method thread-safe by adding the "synchronized" keyword to its declaration.
     *
     * @return The unique instance of the class.
     */
    public static synchronized SingletonSynchronized getInstance() {
        // Wrapping the (instance == null) in a synchronized block.
        // When using the synchronized block in this context, we need to specify an objet that provides the lock.
        synchronized (SingletonSynchronized.class) {
            if(instance == null) {
                instance = new SingletonSynchronized();
            }
            return instance;
        }
    }
}
