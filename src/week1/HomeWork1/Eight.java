package week1.HomeWork1;

import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {
        Scanner eight = new Scanner(System.in);

        System.out.println("Enter soccer game time limit: ");
        long hour = eight.nextLong();

        long second = hour * 60l * 60l;

        System.out.println("The soccer game time limit is: " + second + " " +  "second");



    }
}
