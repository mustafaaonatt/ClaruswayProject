package week1.HomeWork1;

import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        Scanner five = new Scanner(System.in);


        System.out.println("Enter one radius number please: ");
        float radius = five.nextFloat();

        float pi = 3.14159f;
        float area = pi *  radius * radius;
        float perimeter = 2 * pi * radius;

        System.out.println("The perimeter of the circle is: " + area);
        System.out.println("The area of the circle is: " + perimeter);


    }
}
