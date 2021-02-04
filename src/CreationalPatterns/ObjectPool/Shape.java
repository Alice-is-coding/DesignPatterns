package CreationalPatterns.ObjectPool;

/**
 * AbstractResource.
 *
 * @author Alice B.
 * @version 04/02/2021
 */
public interface Shape {
    /** To create a new Shape. */
    public void create();
    /** To erase it. */
    public void erase();
}
