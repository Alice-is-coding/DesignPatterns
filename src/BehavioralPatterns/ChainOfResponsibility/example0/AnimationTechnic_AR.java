package BehavioralPatterns.ChainOfResponsibility.example0;

/**
 * AnimationTechnic_AR.
 *
 * @author Alice B.
 * @version 11/02/2021
 */
public class AnimationTechnic_AR extends AnimationTechnic{
    /** To create the AR animation. */
    @Override
    public String draw() {
        return "Creating a AR animation... \nAR animation ready !";
    }

    /** To animate what's been created. */
    @Override
    public String animate() {
        return "Animating the AR animation... \nIt works, congrats !";
    }
}
