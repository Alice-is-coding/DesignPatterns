package CreationalPatterns.Prototype.example0;

/**
 * A ConcretePrototype.
 *
 * @author Alice B.
 * @version 18/01/2021
 */
public class ChocolateChipCookie extends Cookie{
    /**
     * To clone the object.
     * (Cf. (README.TXT) Notes about deep cloning and shallow cloning)).
     *
     * (NB : The ConcretePrototypes should override this method when, especially when the Prototype abstract class/interface implements it).
     *
     * @return The cookie clone.
     * @throws CloneNotSupportedException The object doesn't support cloning (does it implement the Cloneable interface ?...)
     */
    @Override
    public ChocolateChipCookie clone() throws CloneNotSupportedException {
        return (ChocolateChipCookie)super.clone();
    }
}
