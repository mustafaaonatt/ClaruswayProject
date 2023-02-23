package week3;

import java.util.Scanner;

public class AccountInfo {

    String name;
    String surname;
    String address;
    int idNumber;
    int phoneNumber;
    int dob;
    String gender;

    public void getInfo(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your name : ");
        name = scan.nextLine();
        System.out.print("Please enter your surname : ");
        surname = scan.nextLine();
        System.out.print("Please enter your address : ");
        address = scan.nextLine();
        System.out.print("Please enter your Id number :  ");
        idNumber = scan.nextInt();
        System.out.print("Please enter your phone number : ");
        phoneNumber = scan.nextInt();
        System.out.print("Please enter your DoB : ");
        dob = scan.nextInt();
        System.out.print("Please enter your gender : ");
        gender = scan.next();

    }
// Default Constructor created by java for each class
// That's why we can create  an object even if we didn't create a constructor
    public AccountInfo() {
    }

    public AccountInfo(String name, String surname, int phoneNumber, String gender) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public void  printInfo(){
        System.out.println("Name : " + name);
        System.out.println("Surname : " + surname);
        System.out.println("Address : " + address);
        System.out.println("Id Number : " + idNumber);
        System.out.println("Phone Number : " + phoneNumber);
        System.out.println("Date of Birth : " + dob);
        System.out.println("Gender : " + gender);

    }
}
