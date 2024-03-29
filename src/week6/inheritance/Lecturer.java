package week6.inheritance;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Lecturer extends Employee {
    private String[] subjects = new String[10];


    public static void main(String[] args) throws ParseException {
        Lecturer l01 = new Lecturer();
        l01.gender = "Male";
        l01.fName ="John";
        l01.lNane= "Doe";
        l01.setEmployer("Clarusway");
        l01.setEmpID("CW2020123");
        l01.subjects[0] = "HTML";
        l01.subjects[1] = "CSS";
        l01.subjects[2] = "JavaScript";
        l01.subjects[3] = "Java";

        String myDOB ="12-12-2000";
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date dob = sdf.parse(myDOB);

        l01.setDOB(dob);

        l01.intro();
        l01.empIntro();
        l01.lecturerIntro(l01);
    }
    public void lecturerIntro(Lecturer lect){
        System.out.println("I teach the below subjects; ");

        int i = 1;

        for(String sub :lect.subjects){
            if (sub != null){
                System.out.println("\t" +(i++)+". "+sub );
            }

        }

    }
}
