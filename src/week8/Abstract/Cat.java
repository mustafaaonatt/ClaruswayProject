package week8.Abstract;

import week8.Abstract.AnimalAbs;

public class Cat extends AnimalAbs {
    @Override
    public void makesound() {
        System.out.println("Meow...");
    }

    public void move(){ }
}
