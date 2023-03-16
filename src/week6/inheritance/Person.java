package week6.inheritance;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
    protected String fName;
    String lNane;
    private Date DOB;
    protected String gender;

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }
    public void intro(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Hi this is "+fName+" "+lNane+" ("+gender+"). I was born on "+sdf.format(DOB)+". ");
    }
}
