package week2.HomeWork2;

import java.util.Scanner;

public class EvenOddNumbers {
    // 8- Write a java program to find the given number is odd or even (user scanner class for user inputs)
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number please: ");
        int num = scan.nextInt();

        if(num%2==0){
            System.out.println("The number is even. ");
        } else {
            System.out.println("The number is odd. ");
        }

    }
}
