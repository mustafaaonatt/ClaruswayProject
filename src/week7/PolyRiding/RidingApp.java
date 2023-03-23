package week7.PolyRiding;

public class RidingApp {
    public static void main(String[] args) {
        /*
    PolyMorphism = Overloading + Overriding
    overriding ==> happens between parent and child classes.
                   During the overriding, method name and parameters are supposed to be same.
                   But functionality of method changes based on the needs of child classes
    Gokhan --> Driver,Father, Photographer
     */
        InputDevices dev01 = new InputDevices();
        Keyboard dev02 = new Keyboard();
        Microphone dev03 = new Microphone();
        dev01.whatIdo();
        dev02.whatIdo();
        dev03.whatIdo();
    }
}
