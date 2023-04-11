package week10;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkListExample1 {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grape");

        System.out.println(fruits);

        Iterator it = fruits.descendingIterator();

        System.out.println("descending order : " );
        while (it.hasNext()){
            System.out.print(it.next()+ " ");
        }




        fruits.remove();
        fruits.removeLast();
        fruits.removeFirst();
        System.out.println();
        System.out.println("Fruits : ");
        for (String fruit:fruits) {
            System.out.println(fruit);
        }
    }
}
