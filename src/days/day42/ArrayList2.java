package days.day42;

import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(5);
        numbers.add(15);
        numbers.add(35);
        numbers.add(25);
        System.out.println("numbers = " + numbers);
        numbers.add(0, 50);
        System.out.println("numbers = " + numbers);
        numbers.add(2, 90);
        System.out.println("numbers = " + numbers);
        numbers.add(5, 200);
        Integer i = 5;
        numbers.remove(i);
        numbers.remove(numbers.get(5));
        System.out.println("numbers = " + numbers);
        System.out.println("numbers.size() = " + numbers.size());
        System.out.println("numbers.contains(200) = " + numbers.contains(200));
        System.out.println("numbers.contains(2000) = " + numbers.contains(2000));
        System.out.println("numbers.isEmpty() = " + numbers.isEmpty());
        ArrayList<Integer> numbers5 = new ArrayList<>();
        System.out.println("numbers.equals(numbers5) = " + numbers.equals(numbers5));
        numbers.set(0,4000);
        System.out.println("numbers = " + numbers);



    }
}
