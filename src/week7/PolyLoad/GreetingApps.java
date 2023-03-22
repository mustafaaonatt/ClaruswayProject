package week7.PolyLoad;

public class GreetingApps {
    public static void main(String[] args) {



    /*
    PolyMorphism = Overloading + Overriding
    overloading ==> Method name is same, but number or type of parameters are different
    Gokhan --> Driver,Father, Photographer
     */

    Greetings gr01 = new Greetings();

    gr01.greet();
    gr01.greet("John");
    gr01.greet("John","Doe");
    gr01.greet("John","Doe",3);
    gr01.greet("John","Doe",true);


}
}