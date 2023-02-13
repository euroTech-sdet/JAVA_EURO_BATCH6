package days.day64;

import java.util.AbstractQueue;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class CollectionQueue {


    public static void main(String[] args) {

        Queue<String> queue = new PriorityQueue<>(); // FIFO!!

        queue.add("Test51");
        queue.add("Test2");
        queue.add("Test3");
        queue.add("Test4");

        System.out.println("queue = " + queue);

        System.out.println("queue.poll() = " + queue.poll());


        System.out.println("queue = " + queue);

        System.out.println("queue.offer(\"Test5\") = " + queue.offer("Test5"));

        System.out.println("queue = " + queue);

        System.out.println("queue.poll() = " + queue.poll());

        System.out.println("queue = " + queue);

        ///////////////////////////////
    }
}
