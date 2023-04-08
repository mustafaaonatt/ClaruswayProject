package week9;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInJava {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Vitalii");
        queue.add("Kawsar");
        queue.add("Mustafa");

        System.out.println("Link List Queue is : " + queue);

        System.out.println("Link List Queue  Peek is : " + queue.peek());


        queue.poll();
        System.out.println("Link List Queue  after remove is : " + queue);



        Queue<Integer> queue1 = new PriorityQueue<>();

        queue1.add(2);
        queue1.add(3);
        queue1.add(1);
        queue1.add(0);
        queue1.add(4);

        System.out.println("Priority Queue is : " + queue1);
        System.out.println("Priority Queue Peek is  : " + queue1.peek());

        int ieleFirst = queue1.remove();
        System.out.println("Priority  Queue Element Removed is " + ieleFirst);
        int ieleSecond = queue1.remove();
        System.out.println("Priority  Queue Element Removed is " + ieleSecond);
        System.out.println("Priority  Queue after Removed is " + queue1);

    }
}
