package week2.HomeWork2;

import java.util.Scanner;

/*
9- Write a java program to reverse a given number (user scanner class for user inputs)
input: 45678 , Output: 87654
 */
public class ReverseNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int number = scan.nextInt();
        if (number >= -9 && number <= 9 ) {
            System.out.println("Single-digit number! Can not riverse rhe number!" + number);
        }  else {
            String stringNumber = String.valueOf(number);
            int reverseNumber = 0;
            for (int i = 1; i <= stringNumber.length(); i++) {
                reverseNumber = number % 10 + (10 * reverseNumber);
                number = number / 10;

            }
            System.out.println("Reverse number is: " + reverseNumber);
        }
    }
}
