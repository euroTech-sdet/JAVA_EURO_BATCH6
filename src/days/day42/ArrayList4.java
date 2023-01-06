package days.day42;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList4 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 30, 60, 80));
        ArrayList<String> animals = new ArrayList<>(Arrays.asList("Eagle", "Lion", "Horse", "Cat"));
        Integer[] nums = {1, 2, 3, 8, 9, 7, 6};
        ArrayList<Integer> numbers5 = new ArrayList<>(Arrays.asList(nums));
        System.out.println("numbers5 = " + numbers5);

        //even numbers between 0-100
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                evenNumbers.add(i);
            }
        }
//        int first = 0;
//        int last = 100;
//        for (int i = first; i < last; i+=2) {// i=i+1  i+=1  i+=2
//            evenNumbers.add(i);
//        }
        System.out.println("evenNumbers = " + evenNumbers);
        oddNumbers();
        oddNumbers(200, 250);
        oddNumbers(50, 80);
        ArrayList<Integer> numbersEven = evenNumbers(80, 100);
        System.out.println("numbersEven = " + numbersEven);
        ArrayList<Integer> numbers900_950 = evenNumbers(900, 950);
        System.out.println("numbers900_950 = " + numbers900_950);
    }

    // create a method printing numbers between 0-100
    public static void oddNumbers() {
        System.out.println("odd numbers");
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 1) {
                System.out.println("i = " + i);
            }
        }
    }

    public static void oddNumbers(int start, int end) {// 500 600
        System.out.println("odd numbers");
        for (int i = start; i <= end; i++) {
            if (i % 2 == 1) {
                System.out.println("i = " + i);
            }
        }
    }

    public static ArrayList<Integer> evenNumbers(int start, int end) {// 500 600
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        System.out.println("even numbers");
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                evenNumbers.add(i);
            }
        }
        return evenNumbers;
    }


}
