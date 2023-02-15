package week2.HomeWork2;

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        /**
         * Assign age and weight,
         * for blood donation,
         *  people should be bigger than 21
         *  and
         *  more than 90 pound
         *  please use nested if
         */
        Scanner scan = new Scanner(System.in);
        int age;
        int weight;

        System.out.println("Enter your age: ");
        age = scan.nextInt();

        System.out.println("Enter your weight");
        weight = scan.nextInt();

        if (age >= 21) {
            if( weight >= 90){
            System.out.println("You can donate blood");
        }else{
                System.out.println("You can not  donate blood (weight requirement not met).");
            }

            }

            }


    }
