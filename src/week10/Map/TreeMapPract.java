package week10.Map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapPract {
    public static void main(String[] args) {
        TreeMap<String, String> countries = new TreeMap<>();

        countries.put("Mauritius", "Port Louis");
        countries.put("Tonga", "Nuku'alofa");
        countries.put("Ghana", "Accra");
        countries.put("Cambodia", "Phnom Penh");
        countries.put("Somali", "Mogadishu");
        countries.put("Argentina", "Buenos Aires");

        int counter = 1;
        for (Map.Entry<String,String> cnt  : countries.entrySet()) {
            System.out.println(counter++ + ". " + cnt.getKey() + " -> " + cnt.getValue());

        }
            Set<String> cnBH = countries.headMap("H").keySet();
            System.out.println("Countries before letter \"H\" : " + cnBH);


    }
}
