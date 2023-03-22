package week7;

public class AnimalApp1 {
    public static void main(String[] args) {

        /*
        Overriding is about re-developing the method for the child class,
        that was earlier defined in the  parent class.
         */
        Animal1 bird = new Animal1();
        Cat cat = new Cat();
        Dog dog = new Dog();


        bird.sound();
        cat.sound();
        dog.sound();

        System.out.println(bird.toString());
    }
}
