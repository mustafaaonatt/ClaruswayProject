package week8.HomeWork8;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Scanner;

public class Methods {
    Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Methods obj = new Methods();
        obj.createEmp();
    }
    public  void createEmp() {//String fName, int kids, String education

        String fname = null;
        int kids = 0;
        String education = null;
        int x =1;
        do {
            try {
                System.out.print("Please enter your full name ");
                fname = input.nextLine();
                System.out.print("How many kids dou you have ? ");
                kids = input.nextInt();
                System.out.print("Please enter your last degree ? ");
                education = input.next();
                x=2;
            } catch (Exception e) {
                System.out.println("Please check your information and try again ");
            }
        }while (x==1);


        EmployeePojo Emp01 = new EmployeePojo(fname, kids, education);
        Emp01.setEmpID(1000);
        Database.employeelist.add(Emp01);
        for (EmployeePojo e : Database.employeelist) {
            System.out.print(e);
        }

    }

}
