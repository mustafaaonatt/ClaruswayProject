package week9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Flowers {
    public static void main(String[] args) {
        List<String> flowers = new ArrayList<>();
        flowers.add("Rose");
        flowers.add("Jasmine");
        flowers.add("Orchid");
        flowers.add("SunFlower");

        // Get iterator
        Iterator<String> flowersIterator = flowers.iterator();
        Iterator<String> temp = flowers.iterator();


        System.out.print("Contents of Arraylist : " );

        while (flowersIterator.hasNext()){
            System.out.print(flowersIterator.next() + " ");
        }
        System.out.println();

        System.out.println(temp.next());
    }
}
