package week2.HomeWork2;

import java.util.Scanner;

public class UserInputs {
    public static void main(String[] args) {


                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter your Name: ");
                String name = scanner.nextLine();

                System.out.print("Enter your Gender: ");
                String gender = scanner.nextLine();

                System.out.print("Enter your Age: ");
                int age = scanner.nextInt();

                scanner.nextLine();

                System.out.print("Enter your Phone Number: ");
                 String phoneNumber = scanner.nextLine();

                System.out.print("Enter your City: ");
                String city = scanner.nextLine();

                System.out.println("Name: " + name);
                System.out.println("Gender: " + gender);
                System.out.println("Age: " + age);
                System.out.println("Phone Number: " + phoneNumber);
                System.out.println("City: " + city);


        }


    }
