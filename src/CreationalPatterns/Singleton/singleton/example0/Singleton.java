package CreationalPatterns.Singleton.singleton.example0;

/**
 * Classic Singleton pattern.
 *
 * @author Alice B.
 * @version 29/01/2021
 */
public class Singleton {
    // An instance of the class itself. (STATIC)
    private static Singleton instance;

    /**
     * Private Constructor.
     */
    private Singleton() {
        System.out.println("Singleton is instanciated.");
    }

    // A STATIC method to get the unique instance of the class.

    /**
     * Static method to get the unique instance of the class.
     *
     * @return The unique instance of the class.
     */
    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    /**
     * Just for the example.
     */
    public void aMethod() {
        System.out.println("Something is done...");
    }
}
