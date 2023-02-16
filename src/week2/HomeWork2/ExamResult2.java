package week2.HomeWork2;

import java.util.Scanner;

public class ExamResult2 {
    //7- Write a java program to find if the student is passed the exam (user scanner class for user inputs)
    //    Note: passing mark is : 65
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your exam result: ");
        int result = scan.nextInt();

        if(result>=65){
            System.out.println("Congratulation You passed the exam. ");
        }else {
            System.out.println("Sorry you failed.");
            System.out.println("Work harder. ");
        }

    }
}
