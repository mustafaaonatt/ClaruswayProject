package week5;

import java.util.Calendar;

public class Calender1 {
    public static void main(String[] args) {
         int year = 2023;
         int month = 6;
         int date = 15;


        Calendar calendar = Calendar.getInstance();

        calendar.clear();
        System.out.println();
        calendar.set(calendar.YEAR,year);
        calendar.set(calendar.MONTH,month);
        calendar.set(calendar.DATE,date);
        System.out.println(calendar.getTime());





    }
}

