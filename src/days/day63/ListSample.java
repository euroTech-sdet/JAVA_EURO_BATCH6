package days.day63;

import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class ListSample {


    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("W");
        list.add("A");
        list.add("B");
        list.add("C");

        System.out.println("list = " + list);


        Vector<String> vector = new Vector<>();

        vector.add("CC");
        vector.add("DD");
        vector.add("AA");

        System.out.println("vector = " + vector);

        System.out.println("vector.firstElement() = " + vector.firstElement());


        /////////////////////

        Stack<String> stack = new Stack<>();  // LIFO !!! Last in first out

        stack.add("X");
        stack.add("Y");
        stack.add("Z");

        System.out.println("stack = " + stack);

        System.out.println("stack.pop() = " + stack.pop()); // it will return last added element, then will delete it!!

        System.out.println("stack = " + stack);

        stack.push("Z");
        System.out.println("stack = " + stack);

        System.out.println("stack.peek() = " + stack.peek());  // peek return as the last added element without deleting!!

        System.out.println("stack = " + stack);

    }
}
