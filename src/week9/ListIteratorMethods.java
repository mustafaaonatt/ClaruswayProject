package week9;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorMethods {
    public static void main(String[] args) {
        List<String> list = new LinkedList<String>();

        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("List: " + list);

        ListIterator<String> listIterator = list.listIterator();

        while (listIterator.hasNext()){
            listIterator.next();
            listIterator.remove();
        }
        System.out.println("After removing: " + list);

        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println("After adding: " + list);

    }
}
