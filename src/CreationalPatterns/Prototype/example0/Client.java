package CreationalPatterns.Prototype.example0;

/**
 * The Client.
 *
 * @author Alice B.
 * @version 18/01/2021
 */
public class Client {
    public static void main(String[] args) {
        Cookie cookie = new ChocolateChipCookie();
        CookieMachine machine = new CookieMachine(cookie);
        try {
            Cookie cookie1 = machine.makeCookie();
            machine.setCookie(new CoconutCookie());
            Cookie cookie2 = machine.makeCookie();
            //System.out.println(cookie1.getClass().getSimpleName());
        }catch(CloneNotSupportedException e) {

        }
    }
}
