package BehavioralPatterns.ChainOfResponsibility.example0;

/**
 * Handler.
 * Handles client requests concerning animation technics.
 *
 * @author Alice B.
 * @version 11/02/2021
 */
public abstract class AnimationTechnic_Handler {
    /** The successor of the chain of responsibility. */
    protected AnimationTechnic_Handler successor;

    /**
     * Handle the Client request or pass it on to the next successor.
     *
     * @param animationTechnic The animation technic requested.
     * @return The handler of handled the Client request.
     */
    public AnimationTechnic_Handler handleRequest(AnimationTechnic animationTechnic) {
        if (canHandleRequest(animationTechnic)) {
            System.out.println(animationTechnic.draw());
            System.out.println(animationTechnic.animate() + "\n");
            return this;
        }
        return successor.handleRequest(animationTechnic);
    }

    /**
     * To know if the handler can handle the request or not.
     *
     * @param animationTechnic The animation technic requested.
     * @return true if the handler can handle the request, false
     */
    protected abstract boolean canHandleRequest(AnimationTechnic animationTechnic);

    /**
     * Successor setter.
     *
     * @param successor The next handler to be set.
     */
    protected void setSuccessor(AnimationTechnic_Handler successor) {
        this.successor = successor;
    }
}
