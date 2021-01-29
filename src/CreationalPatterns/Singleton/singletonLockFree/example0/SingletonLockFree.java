package CreationalPatterns.Singleton.singletonLockFree.example0;

/**
 * SingletonLockFree.
 * (Cf Readme.txt for precisions).
 *
 * @author Alice B.
 * @version 29/01/2021
 */
public class SingletonLockFree {
    private static SingletonLockFree instance = new SingletonLockFree();

    /**
     * Private constructor.
     */
    private SingletonLockFree(){
        System.out.println("SingletonLockFree is instantiated.");
    }

    /**
     * Synchronized method to get the instance.
     *
     * @return The unique instance of the class.
     */
    public static synchronized SingletonLockFree getInstance() {
        return instance;
    }
}
