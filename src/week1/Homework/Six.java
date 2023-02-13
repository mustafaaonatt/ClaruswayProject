package week1.Homework;

import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        Scanner six = new Scanner(System.in);

        System.out.println("Enter three side lengths of a triangle: ");
        byte lengths1 = six.nextByte();
        byte lengths2 = six.nextByte();
        byte lengths3 = six.nextByte();


        byte perimeter = (byte) (lengths1 + lengths2 + lengths3);


        System.out.println("The perimeter of the triangle is : " + perimeter);






    }
}
