package week10.Map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class HasMapPract {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> languages = new LinkedHashMap<>();
        // HashMap<String, Integer> languages = new HashMap<>();
        // Capacity is the max number o times a hashMap can hold
        // Load factor is considered load percentage to trigger increase of Capacity


        languages.put("VBasic 6.0",1999);
        languages.put("C/C++",2000);
        languages.put("Java",2004);
        languages.put("ActionScript",2006);
        languages.put("JavaScript",2008);

        //System.out.println(languages.get("Java"));

        // languages.put("Java", 2008);
        // Keys can not be duplicated, it will cause over writing of value

        languages.putIfAbsent("PHP",2011);
        // This approach can be used if you want to add something without disturbing what is already present
        /*
        System.out.println(languages.get("Java"));
        System.out.println(languages);

        System.out.println(languages.containsKey("ActionScript"));
        System.out.println(languages.containsValue(2011));


        System.out.println(languages.remove("ActionScript"));

        languages.putIfAbsent("PHP", 2013);
        System.out.println(languages);
       */

        System.out.println("List of the Keys are ; ");
        int counter = 1;
        for (String str : languages.keySet()) {
            System.out.println("\t" + counter++ + ". " + str);
        }
        System.out.println("List of the Values are ; ");
         counter = 1;
        for (Integer intM : languages.values()) {
            System.out.println("\t" + counter++ + ". " + intM);
        }
        System.out.println("List of the Sets (from for loop) are ; ");
         counter = 1;
        for (Map.Entry<String,Integer> mySet : languages.entrySet()) {
            System.out.println("\t" + counter++ + ". " + mySet.getKey() + " -> " + mySet.getValue());
        }

        Iterator<Map.Entry<String,Integer>> mapIter = languages.entrySet().iterator();
        System.out.println("List of the Sets (from while loop) are ; ");
        counter = 1;
        while (mapIter.hasNext()){
            Map.Entry<String,Integer> mapItem = mapIter.next();
            System.out.println("\t" + counter++ + ". " + mapItem.getKey() + " -> " + mapItem.getValue());
        }

    }
}
