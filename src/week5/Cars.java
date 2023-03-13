package week5;

import java.util.ArrayList;
import java.util.Collections;

public class Cars {
    public static void main(String[] args) {


        ArrayList<String> cars = new ArrayList<>();
        cars.add("Toyota");
        cars.add("BMW");
        cars.add("Honda");
        cars.add("Mazda");
        cars.add("Ford");
        cars.add("Kia");

        System.out.println("The original cars arraylist's elements : " + cars);
        Collections.sort(cars);
        System.out.println("After sorting the arraylist's elements : " + cars);

        Collections.sort(cars,Collections.reverseOrder());
        System.out.println("After the reverse order cars arraylist : " + cars);
        cars.add(2, "Ferrari");
        System.out.println("After inserting the Ferrari : " + cars);
        cars.remove(5);
        cars.set(1, "Tesla");

        System.out.println("After removing and replacing Mazda with Tesla : " +cars);
    }
}