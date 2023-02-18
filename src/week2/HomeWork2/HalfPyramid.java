package week2.HomeWork2;

public class HalfPyramid {
    public static void main(String[] args) {
/*
Program to print half pyramid using *
 */
        for(int row = 1; row <= 5; row++){
            for (int col =1; col<=row; col++){
                System.out.print(" *");
            }
            System.out.println();
        }
/*
Program to print half pyramid a using numbers
 */

        for (int row = 1; row<= 5; row++){
            for(int col = 1; col<=row; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }

//Inverted half pyramid using *


                for (int i = 5; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
 //Inverted half pyramid using numbers

                for(int i = 5; i >= 1; i--){
                    for (int j = 1; j <= i; j++){
                        System.out.print(j + " ");
                    }
                    System.out.println();
                }


                for (int i = 1; i<=5; i++){
                    for(int j = 1; j<=i; j++){
                        System.out.print((char)  + (64+j));
                    }
                    System.out.println();
                }
            }

        }





