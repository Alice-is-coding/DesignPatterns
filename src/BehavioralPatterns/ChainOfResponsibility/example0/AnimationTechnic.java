package BehavioralPatterns.ChainOfResponsibility.example0;

/**
 * AnimationTechnic
 *
 * @author Alice B.
 * @version 11/02/2021
 */
public abstract class AnimationTechnic {
    /** To create the animation. */
    public abstract String draw();
    /** To animate what's been created. */
    public abstract String animate();
}
