package week2.HomeWork2;

import java.util.Scanner;

public class AddNumbers {
    /*
    5- Write a java program for adding 2 numbers (user scanner class for user inputs):
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = scan.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = scan.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);

    }
}
