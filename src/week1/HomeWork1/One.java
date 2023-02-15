package week1.HomeWork1;

import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
/**
 * 1) Type a program which calculates the area and the perimeter of a square
  whose side length is entered by user.
 * Hint 1: Area of a square is length x
 * length  Hint 2: Perimeter of a square is 4x length
 */
        System.out.println("Enter the side length of the square: ");
        int sideLength = scan.nextInt();
        int area = sideLength * sideLength;
        int perimeter = 4 * sideLength;

        System.out.println("The area of the square is: " + area);
        System.out.println("The perimeter of the square is: " + perimeter);

    }
}
