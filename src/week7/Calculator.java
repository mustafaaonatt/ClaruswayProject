package week7;

public class Calculator {
    public static void main(String[] args) {
        /*
        This calculator calculates the area of
        square(a*a), Rectangle(a*b), Circle(3*r*r)
         */
        System.out.println("The area of square : " + area(4) );
        System.out.println("The area of Rectangle : " + area(4,5) );
        System.out.println("The area of Circle : " + area(4,false) );
    }

    public static int area(int a) {
        return a * a;
    }
    public static int area(int a, int b) {
        return a * b;
    }
    public static int area(int a, boolean isCir) {
        return a * a * 3;
    }
}