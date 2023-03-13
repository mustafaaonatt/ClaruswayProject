package week5;


import java.util.ArrayList;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraylistClass {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        List<String> list3 = new ArrayList<>();
        // ArrayList<String> list4 = new List<>(); --- Doesn't compile
        List<String> list5 = new ArrayList<>();
        System.out.println(list5);

       // The .add() method
        ArrayList<String> birds = new ArrayList<>();
        birds.add("Hawk");
        System.out.println(birds);
        birds.add("test");
        System.out.println(birds);
        birds.add(1,"Robin");
        birds.add(0,"Blue jay");
        birds.add(1,"Cardinal");
        System.out.println(birds);
        birds.add("Speed");
        System.out.println(birds);

        // The .remove() method;
        // return type is boolean
        System.out.println(birds.remove("Fox"));
        System.out.println(birds.remove("Robin"));
        System.out.println("After removing the \"Robin\" element :" + birds);


        System.out.println("Removed the " + birds.remove(2) + " from the birds ArrayList which has index number 2 ");

        System.out.println(birds.remove(1));
        // --> if we put 10,15 or bigger in remove method we will get an error

        // The .size() method;
        System.out.println(birds.size());

        // The .set() method; add element without chahing the size
        birds.set(1,"welcome to java");
        System.out.println(birds.get(0));

        // The .contains() method;
        // return type is boolean
        System.out.println(birds.contains("The Birth"));
        System.out.println(birds.contains("welcome to java"));


        // The .sort() method;
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("M");
        arrayList.add("M");
        arrayList.add("O");
        arrayList.add("z");
        Collections.sort(arrayList);
        System.out.println(arrayList);

        // The .equals() method;
        // we can compare two lists to see if they contain same element in the same order.
        ArrayList<String> arrayList1 = new ArrayList<>();
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList1.add("A");
        arrayList1.add("b");
        arrayList1.add("c");
        arrayList2.add("A");
        arrayList2.add("g");
        arrayList2.add("c");
        System.out.println(arrayList1);
        System.out.println(arrayList2);
        System.out.println(arrayList1.equals(arrayList2));

        arrayList2.set(1,"b");
        System.out.println(arrayList2);
        System.out.println(arrayList1.equals(arrayList2));

        //The .clear() method;
        //Returns nothing, its return type is void

        arrayList2.clear();
        System.out.println(arrayList2);
        System.out.println(arrayList2.isEmpty());
        System.out.println(arrayList2.size());

        //How to convert an ArrayList to an Array?
        List<String> list = new ArrayList<>();
        list.add("Hawk");
        list.add("Robin");
        System.out.println(list);

        String arr[] = list.toArray(new String[0]);
        System.out.println(arr.length);
        System.out.println(Arrays.toString(arr));



        // How to convert an Array to an ArrayList?

        String newArr[] = {"Vitali","Mustafa", "Ramazan", "Ali"};
        List<String> newList = Arrays.asList(newArr);

        System.out.println(newList);
        System.out.println("newList ArrayList size is : " + newList.size());

        newList.set(3,"Alex");
        System.out.println(newArr);

        //        Note: If you update the elements through Array methods or List methods, both array elements
        //        and list elements  will be aﬀected.
        //        Because they point to the same data store.







    }
}
