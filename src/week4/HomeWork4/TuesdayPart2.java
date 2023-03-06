package week4.HomeWork4;

import java.util.Arrays;

public class TuesdayPart2 {
    public static void main(String[] args) {


//  9. Write a Java program to find the maximum and minimum value of an array.


        int [] numbers = {78,82,85,98,1,0};
        int max = 0;
        int min = 0;
        for (int i = 0; i<numbers.length; i++) {
            if (numbers[i] > max)
                max = numbers[i];
            else if (numbers[i] < min)
                min = numbers[i];
            else ;


         }
        System.out.println("min is: " + min);
        System.out.println("max is: " + max);




//  10. Write a Java program to reverse an array of integer values.

        int[]arr = {1,2,3,4,5};

        System.out.println(Arrays.toString(arr));


        }











    }

