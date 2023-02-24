package week3.HomeWork3;

import java.util.Scanner;
// Homework: Create 2 methods one for get info and printInfo()
// Create  objects from different cons. and print the  object info(fields)
// while creating object use default value, parameterized cons. and assign the value after creating the object
public class Information {

    String className;
    String subject;
    int roomNumber;
    String teacher;
    String grade;


    public Information() {
    }

    public Information(String className, String teacher, String grade) {
        this.className = className;
        this.teacher = teacher;
        this.grade = grade;
    }

    public Information(String subject, String teacher) {
        this.subject = subject;
        this.teacher = teacher;
    }

    public Information(String subject, int roomNumber) {
        this.subject =" java  ";
        this.roomNumber = 319; // Default values
    }



    public void getInfo(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your class name : ");
        className = scan.next();
        System.out.println("Please enter your subject : ");
        subject = scan.next();
        System.out.println("Please enter your room number : ");
        roomNumber = scan.nextInt();
        System.out.println("Enter teacher : ");
        teacher = scan.next();
        System.out.println("Enter your grade : ");
        grade = scan.next();


    }



    public void printInfo(){
        System.out.println("Class name :  " + className);
        System.out.println("Your subject : " + subject);
        System.out.println("Your room number :  " + roomNumber);
        System.out.println("Your teacher :  " + teacher);
        System.out.println("Your grade :  " + grade);


    }

    public static void main(String[] args) {
        Information information = new Information();
        information.getInfo();
        information.printInfo();

        Information information1 = new Information();
         information1.className = "Math";
         information1.teacher = "Daniel";
         information1.grade = "AA";
        System.out.println("Your class: " + information1.className);
        System.out.println("Your Teacher: " + information1.teacher);
        System.out.println("Your Grade: " + information1.grade);


        Information information2 = new Information("sport","ahmet","CC"); // parameterized
        System.out.println("Your class : " +information2.className);
        System.out.println("Your Teacher : " +information2.teacher);
        System.out.println("Your Grade : " +information2.grade);

        Information information3 = new Information("Math", 319);


        information3.printInfo();




    }









}
