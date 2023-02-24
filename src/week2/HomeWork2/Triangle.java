package week2.HomeWork2;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter Row :");
        int n = scan.nextInt();



        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }
            for (int l = 2; l <= i; l++) {
                System.out.print(l);
            }
            System.out.println();
        }


        int num1=9, num2 = 5, num3 = 7;

        int biggestnum = (num1>num2) ? (num1>num3 ) ? num1 : num2 :  ( num2 > num3) ? num2 : num3;
        System.out.println("The Biggest Number is : " +biggestnum);
    }





    }

