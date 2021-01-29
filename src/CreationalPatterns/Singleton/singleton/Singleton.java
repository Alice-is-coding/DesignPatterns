package CreationalPatterns.Singleton.singleton;

/**
 * Classic Singleton pattern.
 */
public class Singleton {
    // An instance of the class itself. (STATIC)
    private static Singleton instance;

    // A private constructor.
    private Singleton() {
        System.out.println("Singleton is instanciated.");
    }

    // A STATIC method to get the unique instance of the class.
    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void aMethod() {
        System.out.println("Something is done...");
    }
}
