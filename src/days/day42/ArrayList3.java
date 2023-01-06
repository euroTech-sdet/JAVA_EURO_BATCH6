package days.day42;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList3 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(50);//0
        numbers.add(100);//1
        numbers.add(20);//2
        numbers.add(30);//3
        numbers.add(80);//4
        numbers.add(90);//5
        // for loop
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
        // will start to print from last element
        System.out.println("numbers.size() = " + numbers.size());
        System.out.println("numbers.get(0) = " + numbers.get(0));
        System.out.println("numbers.get(5) = " + numbers.get(5));
        for (int i = numbers.size() - 1; i >= 0; i--) {
            System.out.println("numbers.get(i) = " + numbers.get(i));
        }
        System.out.println("---------------------------------------------");
        //for each loop

        for (Integer number : numbers) {
            System.out.println("number = " + number);
        }
        for (int number : numbers) {
            System.out.println("number = " + number);
        }
        int num = numbers.get(0);
        System.out.println("num = " + num);
        System.out.println("------------------------");

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.println("iterator.next() = " + iterator.next());
        }
        System.out.println("do while");
        int i = 0;
        do {
            System.out.println("numbers.get(i) = " + numbers.get(i));
            i++;
        } while (i < numbers.size());
        System.out.println("while loop");
        i = 0;
        while (i < numbers.size()) {
            System.out.println("numbers.get(i) = " + numbers.get(i));
            i++;
        }



    }
}
