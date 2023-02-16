package week2.HomeWork2;

import java.util.Scanner;

public class FahrenheitToCelcius {
    /*
    3- Write a java program to convert Fahrenheit to Celsius using user input.
    Formula: Celsius= (Fahrenheit-32)*5/9
    Given : 87F
    Calculation:  (87-32)*5/9=30.5 Celcius
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit: ");
        int fahrenheit = scan.nextInt();

        int celsius = (fahrenheit-32)*5/9;
        System.out.println(fahrenheit + " degrees Fahrenheit is equal to " + celsius + " degrees Celsius ");

    }
}
