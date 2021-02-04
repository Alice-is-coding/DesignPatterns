package CreationalPatterns.ObjectPool.example0;

import java.util.Stack;

/**
 * ResourcePool.
 *
 * Its job is to manage a pool of objects in order to optimize performances.
 *
 * @author Alice B.
 * @version 04/02/2021
 */
public class DotPool {
    /** A Stack of available instances. */
    private static Stack<Dot> available = new Stack<>();
    private static final int MAX_NB = 10;
    private static int nb = 0;

    /**
     * Used by the Client to get a resource.
     *
     * @return An available resource.
     */
    public static Dot acquireResource() throws MaxInstancesCreatedException {
        if(available.size() == 0) {
            if(++nb < MAX_NB) {
                Dot dot = new Dot();
                System.out.println("Pool created a new Dot    -> id : " + dot.getId());
                return dot;
            }else {
                throw new MaxInstancesCreatedException("Max number of different instances reached ! " + MAX_NB + " instances in circulation...");
            }
        }
        Dot dot = available.peek();
        System.out.println("Pool gave an available Dot   ->  id : " + dot.getId());
        return available.pop();
    }

    /**
     * Used by the Client to release a resource he used.
     *
     * @param dot The resource to be released.
     */
    public static void releaseResource(Dot dot) {
        System.out.println("Pool stored an unused Dot   ->  id : " + dot.getId());
        available.add(dot);
    }

    /**
     * Stack getter.
     * (Maybe useful for tests...)
     *
     * @return The Stack of available resources.
     */
    protected Stack<Dot> getAvailable() {
        return DotPool.available;
    }

    /**
     * For the tests...
     */
    protected void reset()  {
        nb = 0;
        available.clear();
    }
}
