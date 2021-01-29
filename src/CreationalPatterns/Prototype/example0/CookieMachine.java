package CreationalPatterns.Prototype.example0;

/**
 * To abstract the use of the Prototype Pattern.
 * Here, a CookieMachine is able to make cookies (by cloning them).
 *
 * @author Alice B.
 * @version 18/01/2021
 */
public class CookieMachine {
    /** The cookie to clone/make. */
    private Cookie cookie;

    /**
     * Constructor.
     *
     * @param cookie The cookie to clone/make.
     */
    public CookieMachine(Cookie cookie) {
        this.cookie = cookie;
    }

    /**
     * Returns a cloned cookie from the one chosen.
     *
     * @return The cookie.
     * @throws CloneNotSupportedException The object doesn't support cloning (does it implement Cloneable ?...)
     */
    public Cookie makeCookie() throws CloneNotSupportedException {
        Cookie cookie = this.cookie.clone();
        System.out.println("Baking the cookie...");
        System.out.println(this.cookie.getClass().getSimpleName() + " ready ! Enjoy !");
        return cookie;
    }

    /**
     * Cookie setter.
     *
     * @param cookie The cookie to clone/make.
     * @return The CookieMachine instance in order to be able to chain the method calls.
     *         For example, thanks to that, we could do something like "machine.setCookie(new ACookie()).makeCookie();".
     */
    public CookieMachine setCookie(Cookie cookie) {
        this.cookie = cookie;
        return this;
    }
}
