package week3;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {


        /**  Scanner scan = new Scanner(System.in);
         System.out.println("Please enter the Factorial number for calculation ");
         int fact = scan.nextInt(); // 7! = ?
         int result = 1;
         int counter = 0;
         while (fact >= 1){
         result = result * fact;
         fact--;
         counter++;
         System.out.println(result);
         }
         System.out.println(counter + "! = " + result); */



        for ( int i = 1; i <= 100; i++) {
            if(i==99){
                System.out.print(i);
            }
            else if(i%2!=0)
            System.out.print(i + ", ");
        }



    }
}



