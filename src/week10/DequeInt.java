package week10;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeInt {
    public static void main(String[] args) {
        Deque<Integer> arrayDeque = new ArrayDeque<>();

        arrayDeque.add(3);
        arrayDeque.push(4);
        arrayDeque.offer(6);
        arrayDeque.addFirst(2);
        arrayDeque.addLast(5);
        arrayDeque.addFirst(1);

        System.out.println("ArrayDeque : " + arrayDeque.toString());
    }
}
