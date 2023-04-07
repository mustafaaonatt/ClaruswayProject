package week9;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // Declaration  TreeSet
        TreeSet <String> treeSet = new TreeSet<>();
        // Adding element
        treeSet.add("ABC");
        treeSet.add("String");
        treeSet.add("Test");
        treeSet.add("Pen");
        treeSet.add("Ink");
        treeSet.add("Jack");

        // adding duplicated element
        treeSet.add("Test");
        treeSet.add("Jack");

        //adding null : treeSet can not accept null value(HashSet can accept null value only)
    //    treeSet.add(null);

        //Displaying
        System.out.println(treeSet);

        //TreeSet of Integer Type

        TreeSet<Integer> integerTreeSet = new TreeSet<>();

        integerTreeSet.add(11);
        integerTreeSet.add(15);
        integerTreeSet.add(45);
        integerTreeSet.add(222);
        integerTreeSet.add(3);
        integerTreeSet.add(0);

        System.out.println(integerTreeSet);
    }
}
