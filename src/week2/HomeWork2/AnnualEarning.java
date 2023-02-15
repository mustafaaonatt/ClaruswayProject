package week2.HomeWork2;

import java.util.Scanner;

public class AnnualEarning {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your annual earning : ");
        int salary = scan.nextInt();

        if(salary >= 100){
            System.out.println("Perfect start for work.");
        } else if (salary >= 80) {
            System.out.println("Good start for work.");

        } else if (salary >= 70) {
            System.out.println("Average start for work. ");


        } else if (salary >= 60) {
            System.out.println("Below average start for work.");

        } else {
            System.out.println("Not acceptable for work");

        }


    }
}


