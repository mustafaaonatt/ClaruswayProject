package week8.Abstract;

public abstract class  AnimalAbs {
    public abstract void makesound();

    public abstract void move();

    public void jump(){
        System.out.println("I can jump really high. ");
        // Abstract classes non-abstract methods in their  body.
        // non-abstract methods also called as concrete methods.
    }
}
