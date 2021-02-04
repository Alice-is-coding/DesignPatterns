package CreationalPatterns.ObjectPool;

/**
 * Just to display to the Client that the max number of instances created has been reached.
 *
 * @author Alice B.
 * @version 04/02/2021
 */
public class MaxInstancesCreatedException extends Exception{
    /**
     * Constructor.
     *
     * @param s Message to be displayed.
     */
    public MaxInstancesCreatedException(String s) {
        super(s);
    }
}
