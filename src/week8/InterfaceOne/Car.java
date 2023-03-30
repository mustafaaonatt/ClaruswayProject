package week8.InterfaceOne;

public abstract class Car {
    public abstract void move(); //abstract method -> without body
    public void diesel(){ // concrete method -> with body
        System.out.println("This car works with diesel");
    }
    public void gas(){ // // concrete method -> with body
        System.out.println("This car works with gasoline");
    }
}
