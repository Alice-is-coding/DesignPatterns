package CreationalPatterns.ObjectPool;

/**
 * Client.
 *
 * Asks for Resource (Dot) to the ResourcePool (DotPool) in order to use Resource (Dot).
 *
 * @author Alice B.
 * @version 04/02/2021
 */
public class Client {
    /**
     * The main.
     *
     * @param args Arguments from the command line.
     */
    public static void main(String[] args) throws MaxInstancesCreatedException {
        // We get 2 resources.
        Dot dot0 = DotPool.acquireResource();
        Dot dot1 = DotPool.acquireResource();
        System.out.println();

        // We use one of them.
        dot0.create();
        dot0.erase();
        // Then we release it.
        DotPool.releaseResource(dot0);
        System.out.println();

        // We get a resource (We get the previously released).
        Dot dot2 = DotPool.acquireResource();
        System.out.println();

        // We use 2 resources.
        dot1.create();
        dot2.erase();
        System.out.println();

        // We release them.
        DotPool.releaseResource(dot1);
        DotPool.releaseResource(dot2);
        System.out.println();

        // We get 2 resources (We get the 2 previously released).
        Dot dot3 = DotPool.acquireResource();
        Dot dot4 = DotPool.acquireResource();
        System.out.println();
    }
}
