package week13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaMethods3 {
    public static void main(String[] args) {
        List<String> menu = new ArrayList<>(Arrays.asList("bicibici", "melemen", "cacix", "kokerec"));
        printAllElementsExceptFirstTwo(menu);
    }
    public static void printAllElementsExceptFirstTwo (List<String> anyList) {
        anyList.
                stream().
                         sorted(Comparator.comparing(t->t.charAt(t.length()-1))).
                                                                                 skip(2).

                forEach(t-> System.out.print(t + " "));
    }

}

