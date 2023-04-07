package week9;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConvertToHasSetToTreeSet {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Mango");

        System.out.println("HasSet contains " + hashSet);

        //Create a TreeSet of HasSet elements

        Set<String> tSet = new TreeSet<>(hashSet);

        System.out.println("TreeSet contains " + tSet);

        // for eac loop
        for (String s:tSet) {
            System.out.println(s);
        }

    }
}
