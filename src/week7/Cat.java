package week7;

public class Cat extends Animal1 {
    public void sound(){
        System.out.println("Cat says meow. ");
    }

    @Override
    public int testing() {
        return 0;

    }
    public  Cat Test2(){
        return this;
    }
}

