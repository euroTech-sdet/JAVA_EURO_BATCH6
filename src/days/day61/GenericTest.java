package days.day61;

import java.util.ArrayList;

public class GenericTest {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3};
        String[] colors = {"yellow", "green"};
        Character[] chars = {'a', 'b', 'c'};
        // printFirst(chars);
        printFirst(colors);
        printFirst(numbers);
        printFirst(chars);
        ArrayList<String> list = new ArrayList();


        Generics generics = new Generics();
        generics.name = 50;
        Generics generics1 = new Generics();
        generics.name = "Flexiblity";
    }

    public static <t> void printFirst(t[] anyType) {
        System.out.println("anyType[0] = " + anyType[0]);
    }

    public static void printFirstElement(int[] numbers) {
        System.out.println("numbers[0] = " + numbers[0]);
    }

    public static void printFirstElement(String[] str) {
        System.out.println(str[0]);
    }
}
