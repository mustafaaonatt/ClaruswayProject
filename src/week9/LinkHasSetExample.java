package week9;

import java.util.LinkedHashSet;

public class LinkHasSetExample {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("Vitalii");
        linkedHashSet.add("Mustafa");
        linkedHashSet.add("Kawsar");
        linkedHashSet.add("Ali");
        linkedHashSet.add("Mehmet");

        linkedHashSet.remove("Mustafa");

        System.out.println(linkedHashSet);

        LinkedHashSet<Integer> linkedHashSet1 = new LinkedHashSet<>();

        linkedHashSet1.add(99);
        linkedHashSet1.add(7);
        linkedHashSet1.add(0);
        linkedHashSet1.add(555);
        linkedHashSet1.add(3);

        System.out.println(linkedHashSet1);

    }
}
