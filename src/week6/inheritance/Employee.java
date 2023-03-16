package week6.inheritance;

public class Employee  extends Person {

     private  String employer;
     private String empID;


    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String emoloyer) {
        this.employer = emoloyer;
    }

    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }

    public  void  empIntro(){
        System.out.println("I am working at "+employer+". My employee ID is: "+empID+".");
    }
/*
    public static void main(String[] args) throws ParseException {
        Employee emp01 = new Employee();
        emp01.gender = "Male";
        emp01.fName ="John";
        emp01.lNane= "Doe";
        emp01.employer = "Clarusway";
        emp01.empID = "CW2020123";

        String myDOB ="12-12-2000";
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date dob = sdf.parse(myDOB);

        emp01.setDOB(dob);

        emp01.intro();
        emp01.empIntro();


    }
 */
}
