package week5;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        //Create the Date object
        Date date = new Date();
        // Display time and date using to toString() method

        System.out.println(date.toString());

        SimpleDateFormat df = new SimpleDateFormat("yyyy.MM.dd  'at' hh:mm:ss a zzz");
        System.out.println("Current Date : " + df.format(date));
    }
}
