package week9;

import java.util.ArrayList;
import java.util.Iterator;

public class Numbers {
    public static void main(String[] args) {
        // Creating an arrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(99);
        numbers.add(55);
        numbers.add(34);

        System.out.println("Array List : " + numbers);

        Iterator<Integer> iterator = numbers.iterator();

        // Using the next() method
         int number = iterator.next();
        System.out.println("Accessed Element : " + number);
        // Using the remove() method
        iterator.remove();
        System.out.println("Removed element : " + number);

        System.out.print("Updated Arraylist : " );

        // Using the hasNext() method
        while (iterator.hasNext()){
            // Using the for-each remaining method
            iterator.forEachRemaining((value) ->
                    System.out.print(value  + ", "));

        }
    }
}
