package BehavioralPatterns.ChainOfResponsibility.example0;

/**
 * AnimationTechnic_VR.
 *
 * @author Alice B.
 * @version 11/02/2021
 */
public class AnimationTechnic_VR extends AnimationTechnic{
    /** To create the VR animation. */
    @Override
    public String draw() {
        return "Creating a VR animation... \nVR animation ready !";
    }

    /** To animate what's been created. */
    @Override
    public String animate() {
        return "Animating the VR animation... \nIt works, congrats !";
    }
}
