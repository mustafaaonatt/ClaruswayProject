package week10.Map;

import java.util.*;

public class CustInMap {
    public static void main(String[] args) {
      //  HashMap<Custom, String> cust = new HashMap<>();
      //  LinkedHashMap<Custom, String> cust = new LinkedHashMap<>();
      //  Hashtable<Custom, String> cust = new Hashtable<>();
        TreeMap<Custom,String> cust = new TreeMap<>();
        /*
        compareTo method is must if you need to use your custom class as a key in TreeMap
         */


        cust.put(new Custom(5,"John"),"Entry 1");
        cust.put(new Custom(8,"Jackson"),"Entry 2");
        cust.put(new Custom(5,"Smith"),"Entry 3");
        cust.put(new Custom(15,"Mark"),"Entry 4");
        cust.put(new Custom(7,"Ken"),"Entry 5");
        cust.put(new Custom(15,"Ryo"),"Entry 6");


        int counter = 1;
        for (Map.Entry<Custom,String> cst : cust.entrySet()) {
            System.out.println(counter++ + ". " + cst.getKey() + " -> " + cst.getValue());
        }
    }




}
