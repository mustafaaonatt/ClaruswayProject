package week2.HomeWork2;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = scan.nextInt();
        for (int i = n; i>=1; i--){
            for ( int j = 1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        for (int i = 1; i<=5; i++) {
            for (int j = 1; j <= 5- i; j++){
                System.out.print(" ");
            }
            for (int j = 1; j<=i*2-1; j++)
                System.out.print("*");

            System.out.println();
            }
        for (int i = 5; i>=1; i--){

            for (int j = 1; j<=5-i; j++){
                System.out.print(" ");
            }

            for (int k = 1; k<=i*2-1; k++)
                System.out.print("*");





            System.out.println();
        }

        for (int i = 1; i<=5; i++){
            for (int j = 1; j<=5-i; j++){
                System.out.print(" ");
            }
            for (int k = i; k>=1; k--){
                System.out.print(k);
            }
            for (int l = 2; l<=i; l++){
                System.out.print(l);
            }
            System.out.println();
        }

         // Rows - 6
        //  Spaces - 5,4,3,2,1,0
        //  Numbers - 1,2,3,4,5,6

        for(int i = 0; i<6; i++){
            for (int j = 1; j<6-i; j++){
                System.out.print(" ");
            }
                int number = 1;
            for (int k = 0; k<=i; k++){
                System.out.print(number + " ");

                number = number *(i-k)/(k+1);
            }
            System.out.println();
        }




        //Rows-4
        //Numbers-1,2,3,4
            int c = 1;
          for(int i = 1; i<=4; i++){

              for(int j=1; j<=i; j++){
                  System.out.print(c + " ");
                  c++;
              }
              System.out.println();







          }









    }



    }

