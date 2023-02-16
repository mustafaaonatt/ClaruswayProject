package week2.HomeWork2;

import java.util.Scanner;

public class SwapNumbers {
    /*
    4- Write a java program to swap two numbers (user scanner class for user inputs):
    Given: a=20, b=30
    Output: a=30, b=20
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value of number: ");
        int a = scan.nextInt();
        System.out.println("Enter value of number: ");
        int b = scan.nextInt();

        System.out.println("Before swapping: ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping: ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);


    }
}
