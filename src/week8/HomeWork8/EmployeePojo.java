package week8.HomeWork8;

public class EmployeePojo {
    private String fName;
    private int empID;
    private int kids;
    private String education;

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public int getKids() {
        return kids;
    }

    public void setKids(int kids) {
        this.kids = kids;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public EmployeePojo(String fName, int kids, String education) {
        this.fName = fName;
        this.kids = kids;
        this.education = education;
    }

    @Override
    public String toString() {
        return "Employee  : " + fName + " has "+ kids+" kids have a "+education+ " degree";
    }
}
