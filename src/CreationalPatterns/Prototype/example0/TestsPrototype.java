package CreationalPatterns.Prototype.example0;

/**
 * Test class.
 * Tests the Prototype design pattern implemented through a CookieMachine example.
 *
 * @author Alice B.
 * @version 29/01/2021
 */
public class TestsPrototype extends junit.framework.TestCase {
    /**
     * Nested class for the tests.
     *
     * @author Alice B.
     * @version 29/01/2021
     */
    private class Brookie extends Cookie {
        /**
         * Cf. Comments in Cookie abstract class.
         *
         * @return The cookie cloned.
         * @throws CloneNotSupportedException An exception has occured...
         */
        @Override
        public Cookie clone() throws CloneNotSupportedException {
            return (Brookie)super.clone();
        }
    }

    public void testPrototype() {
        Cookie cookie = new ChocolateChipCookie();
        CookieMachine machine = new CookieMachine(cookie);
        try {
            Cookie cookie1 = machine.makeCookie();
            assertTrue(cookie1 instanceof ChocolateChipCookie);

            machine.setCookie(new CoconutCookie());
            Cookie cookie2 = machine.makeCookie();
            assertTrue(cookie2 instanceof CoconutCookie);
        }catch(CloneNotSupportedException e) {
            fail("No exception expected here !");
        }
    }

    public void testNestedTestClass() {
        CookieMachine machine = new CookieMachine(new Brookie());

        try {
            Cookie cookie = machine.makeCookie();
            assertTrue(cookie instanceof Brookie);

            cookie = machine.setCookie(new ChocolateChipCookie()).makeCookie();
            assertTrue(cookie instanceof ChocolateChipCookie);
        }catch(CloneNotSupportedException e) {

        }
    }
}
