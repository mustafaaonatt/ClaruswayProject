package week8.HomeWork8;

import java.util.Scanner;

public class Methods {
    Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Methods obj = new Methods();
        obj.createEmp();
    }
    public  void createEmp(){//String fName, int kids, String education
        System.out.print("Please enter your full name ");
        String fname = input.nextLine();
        System.out.print("How many kids dou you have ? ");
        int kids = input.nextInt();
        System.out.print("Please enter your last degree ? ");
        String education = input.next();


        EmployeePojo Emp01 = new EmployeePojo(fname,kids,education);
        Emp01.setEmpID(1000);
        Employee.employeelist.add(Emp01);
        System.out.println(Employee.employeelist);
    }

}
