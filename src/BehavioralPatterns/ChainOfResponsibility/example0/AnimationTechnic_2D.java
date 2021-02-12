package BehavioralPatterns.ChainOfResponsibility.example0;

public class AnimationTechnic_2D extends AnimationTechnic{
    /** To create the 2D animation. */
    @Override
    public String draw() {
        return "Creating a 2D animation... \n2D animation ready !";
    }

    /** To animate what's been created. */
    @Override
    public String animate() {
        return "Animating the 2D animation... \nIt works, congrats !";
    }
}
