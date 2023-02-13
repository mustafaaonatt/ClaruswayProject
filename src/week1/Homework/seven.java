package week1.Homework;

import java.util.Scanner;

public class seven {
    public static void main(String[] args) {
        Scanner seven = new Scanner(System.in);

        System.out.println("Enter mile on your car: ");
        double mile = seven.nextDouble();

        double km = mile * (double) 1.6d;

        System.out.println("Your km is: " + km);
    }
}
