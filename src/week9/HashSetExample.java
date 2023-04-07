package week9;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // HashSet Declaration
        HashSet<String> hashSet = new HashSet<>();
        HashSet<Integer> hashSet1 = new HashSet<>();

        // adding element to hashset
        hashSet.add("Apple");
        hashSet.add("Mango");
        hashSet.add("Orange");
        hashSet.add("Grape");
        hashSet.add("Fig");

        hashSet1.add(555);
        hashSet1.add(1);
        hashSet1.add(2);
        hashSet1.add(88);
        System.out.println(hashSet1);


        // addition of duplicate element
        hashSet.add("Apple");
        hashSet.add("Mango");

        // Adding of null values
        hashSet.add(null);
        hashSet.add(null);

        //Displaying Hashset elements
        System.out.println(hashSet);

    }
}
