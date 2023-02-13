package week1.Homework;

import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        Scanner two = new Scanner(System.in);


        System.out.println("Enter cube of number: ");
        int cube =  two.nextInt();
        int number = cube * cube * cube;
        System.out.println("The cube of number is: " + number);
    }
}
