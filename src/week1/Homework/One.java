package week1.Homework;

import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the side length of the square: ");
        int sideLength = scan.nextInt();
        int area = sideLength * sideLength;
        int perimeter = 4 * sideLength;

        System.out.println("The area of the square is: " + area);
        System.out.println("The perimeter of the square is: " + perimeter);

    }
}
