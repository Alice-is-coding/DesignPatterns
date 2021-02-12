package BehavioralPatterns.ChainOfResponsibility.example0;

/**
 * Tests for the Chain of Responsibility pattern.
 *
 * @author Alice B.
 * @version 11/02/2021
 */
public class Tests_ChainOfResponsibility extends junit.framework.TestCase {
    public void test0() {
        // Instantiating the chain.
        AnimationTechnic_Handler baseHandler = new AnimationTechnic_2DHandler();
        AnimationTechnic_Handler handler0 = new AnimationTechnic_3DHandler();
        AnimationTechnic_Handler handler1 = new AnimationTechnic_ARHandler();
        AnimationTechnic_Handler handler2 = new AnimationTechnic_VRHandler();
        // Constructing the chain.
        baseHandler.setSuccessor(handler0);
        handler0.setSuccessor(handler1);
        handler1.setSuccessor(handler2);
        handler2.setSuccessor(baseHandler);

        AnimationTechnic_Handler handler = baseHandler.handleRequest(new AnimationTechnic_3D());
        assertTrue(handler instanceof AnimationTechnic_3DHandler);
        handler = handler1.handleRequest(new AnimationTechnic_2D());
        assertTrue(handler instanceof AnimationTechnic_2DHandler);
        handler = handler0.handleRequest(new AnimationTechnic_VR());
        assertTrue(handler instanceof AnimationTechnic_VRHandler);
        handler = handler2.handleRequest(new AnimationTechnic_AR());
        assertTrue(handler instanceof AnimationTechnic_ARHandler);
    }
}
