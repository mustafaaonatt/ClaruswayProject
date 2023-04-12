package week10.Maps;

import java.util.HashMap;
import java.util.LinkedHashMap;

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

        System.out.println(languages.get("Java"));

        languages.put("Java", 2008);
        // Keys can not be duplicated, it will cause over writing of value

        languages.putIfAbsent("PHP",2011);
        // This approach can be used if you want to add something without disturbing what is already present

        System.out.println(languages.get("Java"));

        System.out.println(languages);

        languages.putIfAbsent("PHP", 2013);
        System.out.println(languages);
    }
}
