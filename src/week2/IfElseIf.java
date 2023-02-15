package week2;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the grade percentage: ");
        int percentage = scan.nextInt();
        char grade;

        if(percentage >= 90){
            grade = 'A';
        }else if(percentage >= 75) {
            grade = 'B';
        }else if(percentage >= 65){
            grade = 'C';
        }else grade = 'F';

        System.out.println(grade);
        System.out.println("This code line will be executed for any condition.");


    }
}
