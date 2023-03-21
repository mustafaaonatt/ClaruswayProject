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
    public Mammal(String name){
        this();
        System.out.println("name parameter");
    }

    public static void main(String[] args) {
        Mammal mammal = new Mammal();
        Mammal mammal1 = new Mammal(25);
        Mammal mammal2 = new Mammal("John");
    }
}

