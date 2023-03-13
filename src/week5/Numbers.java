package week5;

import java.util.ArrayList;
import java.util.Collections;

public class Numbers {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();

        num.add(99);
        num.add(46);
        num.add(62);
        num.add(27);
        num.add(357);
        num.add(21);

        System.out.println("Before " + num);
        Collections.sort(num);
        System.out.println("After sorting : " +num);

        num.add(3,100);

        System.out.println(num);
        Collections.sort(num,Collections.reverseOrder());
        System.out.println(num);
        System.out.println("num Arraylist size : " + num.size());

        System.out.println("num Arraylist contains 500? " + num.contains(500));


    }
}
