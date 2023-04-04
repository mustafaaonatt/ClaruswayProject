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
    public  void createEmp(){//String fName, int kids, String education


            String fname = null;
            try {
                System.out.print("Please enter your full name ");
                fname = input.nextLine();
            } catch (Exception e) {
                System.out.println("You cant do that");
            }
            int kids = 0;
            try {
                System.out.print("How many kids dou you have ? ");
                kids = input.nextInt();
            } catch (Exception e) {
                System.out.println("You cant do that");
            }
            String education = null;
            try {
                System.out.print("Please enter your last degree ? ");
                education = input.next();
            } catch (Exception e) {
                System.out.println("You cant do that");
            }


        EmployeePojo Emp01 = new EmployeePojo(fname,kids,education);
        Emp01.setEmpID(1000);
        Database.employeelist.add(Emp01);

    }

}
