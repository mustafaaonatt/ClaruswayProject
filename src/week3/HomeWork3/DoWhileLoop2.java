package week3.HomeWork3;

import java.util.Scanner;

public class DoWhileLoop2 {
    public static void main(String[] args) {
        boolean passCode = false;
        int doorCode = 2025;
        int userCode =0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the passCode: ");
        passCode = scan.nextBoolean();

        while(passCode){
            System.out.println("Welcome to Our Company, the door will be open in 2 seconds...");
            System.out.println("The door open now");
            passCode = false;
        }


        System.out.println("Please enter the door code: ");
        userCode = scan.nextInt();
        while (doorCode == userCode){
            System.out.println("Welcome to our company...");
            break;

        }



    }




}
