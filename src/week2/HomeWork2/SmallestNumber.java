package week2.HomeWork2;

import java.util.Scanner;

// 6- Write a java program to find the smallest number (user scanner class for user inputs)
public class SmallestNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number1 value: ");
        int num1 = scan.nextInt();
        System.out.println("Enter the number2 value: ");
        int num2 = scan.nextInt();
        System.out.println("Enter the number3 value: ");
        int num3 = scan.nextInt();

        if(num1<num2 && num1<num3){
            System.out.println("The smallest number is num1 : " + num1);
        } else if (num2<num1 && num2<num3) {
            System.out.println("The smallest number is num2 : " + num2);
        } else if (num3<num1 && num3<num2 ) {
            System.out.println("The smallest number is num3 : " + num3);
        } else {

        }
    }
}
