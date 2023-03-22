package week7.PolyMorphism;

import java.util.ArrayList;
import java.util.Date;

public class Lecturer extends Employee{
    private ArrayList<String> subjects;
    public Lecturer(String fName, String lNane, Date DOB, String gender, String employer, String empID) {
        super(fName, lNane, DOB, gender, employer, empID);
        subjects = new ArrayList<>();
    }


    public ArrayList<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList<String> subjects) {
        this.subjects = subjects;
    }

    public void intro(){
        super.intro();

        if (subjects.size() > 0){
            System.out.println("I teach the below subjects; ");
            int i = 1;
            for (String sub : subjects){
                if (sub != null)
                System.out.println("\t" +(i++)+". "+sub );
            }

        }

    }




}
