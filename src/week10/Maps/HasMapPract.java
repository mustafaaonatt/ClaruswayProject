package week10.Maps;

import java.util.HashMap;

public class HasMapPract {
    public static void main(String[] args) {
        HashMap<String, Integer> languages = new HashMap<>();
        // Capacity is the max number o times a hashMap can hold
        // Load factor is considered load percentage to trigger increase of Capacity


        languages.put("VBasic 6.0",1999);
        languages.put("C/C++",2000);
        languages.put("Java",2004);
        languages.put("ActionScript",2006);
        languages.put("JavaScript",2008);

        System.out.println(languages.get("Java"));

        System.out.println(languages);
    }
}
