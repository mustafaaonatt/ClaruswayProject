package week5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeClass {
    public static void main(String[] args) {
        System.out.println("LocalDate.now() = " + LocalDate.now());
        System.out.println("LocalDate.now() = " + LocalTime.now());
        System.out.println("LocalDateTime.now() = " + LocalDateTime.now());

        // LocalDate class
        LocalDate date = LocalDate.now();
        date = date.plusDays(11); // adding 11 days to Today's date
        System.out.println(date);

        LocalDate inquiryExpirationDate = date.plusMonths(24);
        System.out.println("inquiryExpiryDate : " + inquiryExpirationDate);

        LocalDate newYear = date.plusYears(3);
        System.out.println("New Year : " + newYear);


        LocalDate result = date.minusDays(25);
        System.out.println(result);

        inquiryExpirationDate = date.minusMonths(24);
        System.out.println( "inquiryExpiryDate : " + inquiryExpirationDate);


        newYear = date.minusYears(3);
        System.out.println("newYear = " + newYear);


        LocalTime time = LocalTime.now();
        System.out.println("time : " + time);

        LocalTime addHours = time.plusHours(5);
        System.out.println("addHours = "+ addHours);
        LocalTime addMinutes = time.plusMinutes(35);
        System.out.println(addMinutes);

        LocalTime addSeconds = time.plusSeconds(25);
        System.out.println("addSeconds : " + addSeconds);

        LocalTime addNanoSeconds = time.plusNanos(2322222);
        System.out.println("nanoSeconds : " + addNanoSeconds);

        LocalTime minusHours = time.minusHours(6);
        System.out.println("minusHours : " + minusHours);
    }
}
