package CreationalPatterns.Singleton.singletonLockFree;

/**
 * SingletonLockFree.
 * (Cf Readme.txt for precisions).
 *
 * @author Alice B.
 * @version 29/01/2021
 */
public class SingletonLockFree {
    private static SingletonLockFree instance = new SingletonLockFree();

    private SingletonLockFree(){
        System.out.println("SingletonLockFree is instantiated.");
    }

    public static synchronized SingletonLockFree getInstance() {
        return instance;
    }
}
