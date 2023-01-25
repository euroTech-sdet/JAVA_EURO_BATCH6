package days.day51;

import java.util.Arrays;

public class Change {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        change(numbers);
        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));//1 - 10
        String str = "Hello World";
        changeString(str);
        System.out.println("str = " + str);// Hello World
    }

    public static void change(int[] arr) {
        arr[0] = 10;
    }

    public static void changeString(String str) {
        str = "Hello Ali";

    }
}
