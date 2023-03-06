package week4;

public class Factorial {
    public static void main(String[] args) {

    }

    static int factorial(int n){
        if(n != 0)
            return n * factorial(n-1);
        else
            return 1;

    }
}
