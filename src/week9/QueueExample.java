package week9;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        /*
        We can not create instance of Queue as it is an Interface,
        we can create instance of LinkList or PriorityQueue and assign it to queue.
         */

        // Declaring Queue
        Queue<String> queueS = new LinkedList<>();
        // adding element :
        queueS.add("Rick");
        queueS.add("Maggie");
        queueS.add("Glenn");
        queueS.add("Megan");
        queueS.add("Daryl");

        System.out.println("Element in Queue : " + queueS);

        // remove() method is removing the head, this would remove first element in the queue.
        System.out.println("Removed element : " + queueS.remove());

        // element() method  returns the head of the queue.
        System.out.println("Head : " + queueS.element());

        // poll() method  removes and returns the head of the queue.
        System.out.println("Poll : " + queueS.poll());

        //peek() method works as the elements however it returns null if it is empty
        System.out.println("Peek : " + queueS.peek());


        System.out.println("Elements in Queue : " + queueS);
    }
}
