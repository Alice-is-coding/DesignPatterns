package CreationalPatterns.ObjectPool.example0;

import java.util.Stack;
import java.util.UUID;

/**
 * Tests class.
 *
 * @author Alice B.
 * @version 04/02/2021
 */
public class TestsObjectsPool extends junit.framework.TestCase {
    /**
     * Just in case it would be useful to get the Stack of available resources...
     */
    private static class Test_DotPool extends DotPool {

        public Stack<Dot> getAvailable() {
            return super.getAvailable();
        }
    }

    /**
     * Show how the pattern behaves.
     */
    public void tests0() throws MaxInstancesCreatedException {
        Stack<Dot> availableResources = new Test_DotPool().getAvailable();

        Dot dot0 = DotPool.acquireResource();
        assertTrue("The Dot ID should be instance of UUID.", dot0.getId() instanceof UUID);
        UUID id_dot0 = dot0.getId();

        Dot dot1 = DotPool.acquireResource();
        UUID id_dot1 = dot1.getId();

        Dot dot2 = DotPool.acquireResource();
        UUID id_dot2 = dot2.getId();

        DotPool.releaseResource(dot0);
        assertEquals("It's a Stack so -> LIFO. The peek should correspond to the last acquired resource." ,availableResources.peek().getId(), id_dot0);

        DotPool.releaseResource(dot2);

        Dot dot3 = DotPool.acquireResource();
        UUID id_dot3 = dot3.getId();
        assertEquals("Unless it's not, dot2 has been just released, remember LIFO. So the 1st to be given by the pool is the last freed. Solution expected : id_dot2.equals(id_dot3)", id_dot2, id_dot3);

        Dot dot4 = DotPool.acquireResource();
        UUID id_dot4 = dot4.getId();
        assertEquals("Answer expected : id_dot0.equals(id_dot4)", id_dot0, id_dot4);

        DotPool.releaseResource(dot4);
        DotPool.releaseResource(dot1);

        dot4 = DotPool.acquireResource();
        id_dot4 = dot4.getId();
        assertEquals("Answer expected : id_dot1.equals(id_dot4)", id_dot1, id_dot4);
    }

    public void testExceptionMaxNbReached() throws MaxInstancesCreatedException {
        new Test_DotPool().reset();

        Dot dot0 = DotPool.acquireResource();
        Dot dot1 = DotPool.acquireResource();
        Dot dot2 = DotPool.acquireResource();
        Dot dot3 = DotPool.acquireResource();
        Dot dot4 = DotPool.acquireResource();
        Dot dot5 = DotPool.acquireResource();
        Dot dot6 = DotPool.acquireResource();
        Dot dot7 = DotPool.acquireResource();
        Dot dot8 = DotPool.acquireResource();

        try {
            Dot dot9 = DotPool.acquireResource();
            fail("Max number of instances should be reached ! Cf. MAX_NB constant in DotPool.java...");
        }catch (Exception e) {
            assertTrue("MaxInstancesCreatedException expected.    Actual : " + e, e instanceof MaxInstancesCreatedException);
        }

    }
}
