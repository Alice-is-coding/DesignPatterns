package BehavioralPatterns.ChainOfResponsibility.example0;

/**
 * The Client.
 * Interacts with the Handler to transfer its requests.
 * First of all, has to construct the chain in order to make the process effective.
 * (Note : With dependency injection, this construction could be injected. In that case, the Client would only have to use it).
 *
 * @author Alice B.
 * @version 12/02/2021
 */
public class Client {
    public static void main(String[] args) {
        // Building the chain.
        AnimationTechnic_Handler baseHandler = new AnimationTechnic_2DHandler();
        AnimationTechnic_Handler handler0 = new AnimationTechnic_3DHandler();
        AnimationTechnic_Handler handler1 = new AnimationTechnic_ARHandler();
        AnimationTechnic_Handler handler2 = new AnimationTechnic_VRHandler();

        // Be careful with stack overflows if you don't build the chain correctly.
        // Here, the chain creates a ring topology where every part of the chain is connected to the one next to it, the last being connected to the 1st.
        // By doing that way, we are able to use whatever handler we want to process a request. The Client doesn't need to know which handler do what.
        baseHandler.setSuccessor(handler0);
        handler0.setSuccessor(handler1);
        handler1.setSuccessor(handler2);
        handler2.setSuccessor(baseHandler);

        // Here, the Client requests some VR animation.
        handler0.handleRequest(new AnimationTechnic_VR());

        // Now, he would like to use some 3D.
        handler1.handleRequest(new AnimationTechnic_3D()); // Even if the client uses the next handler in the chain (3D being handled by handler0), the request will be successfully processed.
    }
}
