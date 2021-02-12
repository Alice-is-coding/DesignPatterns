package BehavioralPatterns.ChainOfResponsibility.example0;

/**
 * ConcreteHandler.
 * Handles 2D animation technics.
 *
 * @author Alice B.
 * @version 11/02/2021
 */
public class AnimationTechnic_2DHandler extends AnimationTechnic_Handler{

    /**
     * To know if the handler can handle the request or not.
     *
     * @param animationTechnic The animation technic requested.
     * @return true if the handler can handle the request, false
     */
    @Override
    protected boolean canHandleRequest(AnimationTechnic animationTechnic) {
        return animationTechnic instanceof AnimationTechnic_2D;
    }
}
