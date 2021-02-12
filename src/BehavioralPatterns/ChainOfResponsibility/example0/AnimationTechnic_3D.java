package BehavioralPatterns.ChainOfResponsibility.example0;

/**
 * AnimationTechnic_3D.
 *
 * @author Alice B.
 * @version 11/02/2021
 */
public class AnimationTechnic_3D extends AnimationTechnic {
    /** To create the 3D animation. */
    @Override
    public String draw() {
        return "Creating a 3D animation... \n3D animation ready !";
    }

    /** To animate what's been created. */
    @Override
    public String animate() {
        return "Animating the 3D animation... \nIt works, congrats !";
    }
}
