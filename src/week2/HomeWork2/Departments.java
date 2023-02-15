package week2.HomeWork2;

import java.util.Scanner;

public class Departments {
    /*
    declare variable year and department
years should be 1,2,3,4
departments Computer and Machine Learning
Use the first if statement to check the department of the student.
Use the inner if statement to check in which year the student is.
Display the result.
i.e;
The student is in the Computer Science department
The student is in 2nd year
Please use nested if
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your semester(1-4): ");
        int semester = scan.nextInt();
        System.out.println("Please enter your departments:");

        String department = scan.nextLine();

        if(department.equals("Computer Science")){
            if( semester ==1){
                System.out.println("The student is in the Computer Science department \nThe student is in first semester ");
            } else if (semester ==2) {
                System.out.println("The student is in the Computer Science department \nThe student is in second semester");

            } else if (semester == 3) {
                System.out.println("The student is in the Computer Science department \nThe student is in third semester");

            } else if (semester == 4) {
                System.out.println("The student is in the Computer Science department \nThe student is in fourth semester");

            } else {
                System.out.println("invalid semester");
            }
        } else if (department.equals("Machine Learning")) {
            if (semester ==1){
                System.out.println("The student is in the Machine Learning department\nThe student is in first semester");
            } else if (semester ==2) {
                System.out.println("The student is in the Machine Learning department\nThe student is in second semester");

            } else if (semester ==3) {
                System.out.println("The student is in the Machine Learning department\nThe student is in third semester");

            } else if (semester ==4) {
                System.out.println("The student is in the Machine Learning department\nThe student is in fourth semester");

            } else {
                System.out.println("invalid semester");
            }
            } else {
            System.out.println("invalid department");
        }


    }
}
