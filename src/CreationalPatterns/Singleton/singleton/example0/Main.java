
package CreationalPatterns.Singleton.singleton.example0;

/**
 * The Main.
 *
 * @author Alice B.
 * @version 29/01/2021
 */
public class Main {
    public static void main(String[] args) {
        // We take the unique instance of Singleton and we do something.
        Singleton.getInstance().aMethod();   // The singleton is created.

        Singleton instance = Singleton.getInstance();
        instance.aMethod();  // The singleton is already created (l.6)
    }
}
