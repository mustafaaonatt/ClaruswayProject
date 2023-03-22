package week7.PolyMorphism;

import java.text.SimpleDateFormat;
import java.util.Date;


    public class Person {
        private String fName;
        private String lNane;
        private Date DOB;
        private String gender;

        public Person(String fName, String lNane, Date DOB, String gender) {
            this.fName = fName;
            this.lNane = lNane;
            this.DOB = DOB;
            this.gender = gender;
        }

        public String getfName() {
            return fName;
        }

        public void setfName(String fName) {
            this.fName = fName;
        }

        public String getlNane() {
            return lNane;
        }

        public void setlNane(String lNane) {
            this.lNane = lNane;
        }

        public Date getDOB() {
            return DOB;
        }

        public void setDOB(Date DOB) {
            this.DOB = DOB;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public void intro(){
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            System.out.println("Hi this is "+fName+" "+lNane+" ("+gender+"). I was born on "+sdf.format(DOB)+". ");
        }
    }


