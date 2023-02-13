package week1;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        int c, d,e,f;
        c = a + b;   // Sum or Addition
        d = a - b;   // Subtraction
        e = a * b;   // multiplication
        f = a / b;  //division

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

        int x = 38 / 2 - ( 4 + 3 ) * 2;
        System.out.println(x);
        int y = 8 + 2 * ( 14 - 6 / 2 ) - 12;
        System.out.println(y);

        // % Modulus and Reminder
         int num1 = 45;
         int num2 = 13;
         int reminder = num1 % num2;
        System.out.println("Reminder is " + reminder);

        int A = 20;
        int B = 8;
        int C =  A % B;
        System.out.println("A % B = " + C);
    }
}
