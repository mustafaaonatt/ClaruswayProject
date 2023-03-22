package week7.HomeWork7;

public class Outer {
    public static void main(String[] args) {
        Computer mouse = new Laptop();
        System.out.println(mouse.getValue(100,200));
    }
}
