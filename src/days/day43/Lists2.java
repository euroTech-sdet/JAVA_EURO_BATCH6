package days.day43;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Lists2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 30, 5, 15, 25, 50));
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("numbers.get(i) = " + numbers.get(i));
        }
        System.out.println("for each loop");
        for (Integer number : numbers) {
            System.out.println("i = " + number);
        }
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.println("iterator.next() = " + iterator.next());
        }

        numbers.forEach(System.out::println);


    }
}
