package week5;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatting {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("MMM dd yyyy");
//Formatting  date :
        LocalDate date = LocalDate.now();
        System.out.println((dtf.format(date)));
        System.out.println(dtf1.format(date));

//Formatting Time :
    DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("hh:mm");

        LocalTime time = LocalTime.now();
        System.out.println(dtf2.format(time));
    }
}
