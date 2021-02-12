package CreationalPatterns.Prototype.example0;

/**
 * The Prototype.
 * It has to be Cloneable in order to clone it.
 *
 * @author Alice B.
 * @version 18/01/2021
 */
public abstract class Cookie implements Cloneable {
    /**
     * To clone the object.
     * (Cf. (Readme.txt) Notes about deep cloning and shallow cloning)).
     *
     * @return The cookie clone.
     * @throws CloneNotSupportedException The object doesn't support cloning (does it implement the Cloneable interface ?...)
     */
    @Override
    public Cookie clone() throws CloneNotSupportedException {
        return (Cookie)super.clone();
    }
}
