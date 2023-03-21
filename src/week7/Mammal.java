package week7;

public class Mammal extends Animal{
    public Mammal(int age){
        super();
        System.out.println("Child constructor by this() .");

    }
    public Mammal(){
        this(15);
        System.out.println("Child Constructor");
    }

    public static void main(String[] args) {
        Mammal mammal = new Mammal();
        Mammal mammal1 = new Mammal(25);
    }
}

