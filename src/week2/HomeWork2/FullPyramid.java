package week2.HomeWork2;

public class FullPyramid {
    public static void main(String[] args) {
/**
 * Program to print full pyramid using *
 * result should be like this;
 *          *
 *        * * *
 *      * * * * *
 * * * * * * *
 * * * * * * * * *
 *
 *
 */

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++)
                System.out.print(" ");


                for (int k = 1; k <= 2 * i - 1; k++) {
                    System.out.print("* ");

                }
                System.out.println();


            }


        }

    }
