package week9;

import java.util.ArrayList;
import java.util.Iterator;

public class Cars {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Toyota");
        cars.add("Tesla");
        cars.add("Volvo");
        cars.add("Honda");

        //Get the iterator
        Iterator<String> iterator = cars.iterator();

        //Print the first item
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        if (iterator.hasNext()) System.out.println(iterator.next());


    }
}
