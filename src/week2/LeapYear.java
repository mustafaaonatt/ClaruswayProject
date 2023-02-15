package week2;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        /*
        Question 1:
Type java code by using nested ternary.
Write a program to check if a year is leap year or not.

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the current year: ");
        int year = scan.nextInt();
        if(year % 4 == 0)
            System.out.println("This year is a leap year");
        else System.out.println("This  is not leap year");

      String result;
       result = (year % 4 == 0) ? "This is a Leap year. " : "This year is not a leap year. ";

       System.out.println(result);


    }
}
