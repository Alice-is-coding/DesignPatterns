package CreationalPatterns.Singleton;

/**
 * To avoid locking mechanisms and additional checking (much easier).
 * By instantiated the static member directly when declared, we make sure we have a single instance of the class.
 *
 * The lock-free thread-safe singleton is considered an early-loading singleton in the first version of Java.
 * However, in the latest version of Java, classes are loaded when they are needed,
 * so that version is also a lazy-loading version.
 *
 * Furthermore, the moment that a class is loaded depends on the JVM implementation and
 * may differ from one version to another.
 * Making design decisions based on JVM implementation should be avoided.
 *
 * Currently, there is no reliable option in Java for creating an early loading singleton. If we
 * really need an early instantiation, we should enforce it at the start of the application, by
 * simply invoking the getInstance() method, as shown in the following code:
 *     Singleton.getInstance();
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
