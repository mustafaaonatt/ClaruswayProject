package week2;

public class TernaryOperator {
    public static void main(String[] args) {
// example 1
        int y = 10;
        int x = (y>5) ? (y*2):(3*y);
        System.out.println("x is equal to "+ x);
        // example 2
        y = 7;
        x = (y<5) ? (y*2):(3*y);
        System.out.println("x is equal to " + x +  " in example two" );
    }
}
