package CreationalPatterns.ObjectPool;

import java.util.UUID;

/**
 * ConcreteResource.
 *
 * Doesn't take care of how the instances are created. Its job is to allow a user to do some operations with that kind of shape.
 *
 * @author Alice B.
 * @version 04/02/2021
 */
public class Dot implements Shape{
    /** An Id to identify the instance. */
    private UUID id;

    /**
     * Constructor.
     */
    public Dot() {
        this.id = UUID.randomUUID();
    }

    /**
     * To create a Dot.
     * (Made really, really, really simple for the example...)
     */
    @Override
    public void create() {
        System.out.println("Dot created   ->   id : " + this.id);
    }

    /**
     * To erase a Dot.
     * (Same as above...)
     */
    @Override
    public void erase() {
        System.out.println("Dot erased   ->  id : " + this.id);
    }

    /**
     * Id getter.
     *
     * @return The ID of the Dot object.
     */
    public UUID getId() {
        return this.id;
    }
}
