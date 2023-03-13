package week5;

import java.util.Calendar;

public class Calender2 {
    public static void main(String[] args) {


        Calendar calendar = Calendar.getInstance();
        System.out.println("Year : " + calendar.get(Calendar.YEAR));
        System.out.println("Month : " + month(calendar.get(Calendar.MONTH)));
        System.out.println("Day : " + calendar.get(Calendar.DATE));
        System.out.println("Hour : " + calendar.get(Calendar.HOUR));
        System.out.println("Minute : " + calendar.get(Calendar.MINUTE));

    }

    private static String month(int i) {
        String monthName = "";

        switch (i){
            case 0:
                monthName = "January";
                break;
            case 1:
                monthName = "February";
                break;
            case 2:
                monthName = " March";
                break;
            case 3:
                monthName = "April";
                break;
            case 4:
                monthName = "May";
                break;
            case 5:
                monthName = "June";
                break;
            case 6:
                monthName = "July";
                break;
            case 7:
                monthName = "August";
                break;
            case 8:
                monthName = "September";
                break;
            case 9:
                monthName = "October";
                break;
            case 10:
                monthName = "November";
                break;
            case 11:
                monthName = "December";
                break;
            default:
                System.out.println("You Enter invalid number. ");

        }



        return monthName;

    }
}
