package week1.HomeWork1;

import java.util.Scanner;

public class Nine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scan.nextLine();
        System.out.println("Enter your last name: ");
        String lastname = scan.nextLine();

        System.out.println(name + " " + lastname);

    }
}
