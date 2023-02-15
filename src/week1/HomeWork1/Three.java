package week1.HomeWork1;

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner Three = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        int height = Three.nextInt();
        int width = Three.nextInt();
        System.out.println("Enter one more number below: ");
        int length = Three.nextInt();

        int prism = width * length * height;
        int area = width * length;
        int perimeter = 2 * (width + length);

        System.out.println("The area of the rectangular is: " + area);
        System.out.println("The Perimeter of the rectangular  is: " + perimeter);
        System.out.println("Volume of a rectangular prism is: " + prism);








    }
}
