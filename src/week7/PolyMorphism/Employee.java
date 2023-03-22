package week7.PolyMorphism;

import java.util.Date;

public class Employee extends Person{
    private String employer;
    private String empID;

    public Employee(String fName, String lNane, Date DOB, String gender, String employer, String empID) {
        super(fName, lNane, DOB, gender);
        this.employer = employer;
        this.empID = empID;
    }

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }

    @Override
    public void intro() {
        super.intro();
            System.out.println("I am working at "+employer+". My employee ID is: "+empID+".");
        }
    }

