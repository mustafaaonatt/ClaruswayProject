package week9.HomeWork9;

import java.io.FilterOutputStream;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Exercise {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Strawberry");

        list.addLast("Cherry");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next()+" ");
        }
        System.out.println("==================================");

        int counter = 2;
        Iterator<String> iterator1 = list.listIterator(counter);
        while (iterator1.hasNext()){
            System.out.println(iterator1.next() + " ");
        }
        System.out.println("=======list reversed==========");
        Iterator<String> iterator2 = list.descendingIterator();
        while (iterator2.hasNext()){
            System.out.println(iterator2.next() + " ");
        }
        System.out.println("================================");

        list.add(3,"Melon");

        list.addFirst("Watermelon");


        list.addLast("Peach");

        Iterator<String> iterator3 = list.iterator();
        while (iterator3.hasNext()){
            System.out.println(iterator3.next() + " ");
        }
        System.out.println("=====================================");


        System.out.println(list.get(0) + " " + list.get(7));
        System.out.println("======================================");

        for (int x = 0; x< list.size(); x++){
            System.out.println(x + " " + list.get(x));
        }
        System.out.println("==========================================");





    }
}
