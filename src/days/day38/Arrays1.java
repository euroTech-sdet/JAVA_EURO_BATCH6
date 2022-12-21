package days.day38;

import java.util.Arrays;

public class Arrays1 {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        System.out.println("numbers.length = " + numbers.length);
        numbers[0] = 50;
        numbers[4] = 8;
        numbers[1] = 30;
        numbers[2] = 125;
        numbers[3] = 90;
        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));
        System.out.println("numbers[2] = " + numbers[2]);
        System.out.println("numbers[3] = " + numbers[3]);//90
//give me the numbers greater than 50
        for (int num : numbers) {
//            System.out.println("num = " + num);
            if (num > 50) {
                System.out.println("num = " + num);
            }
        }
// give the greatest number
//            50,   30, 25, 90,                          80
        //  max=90
        int max = 0;
        for (int n : numbers) {
            if (n > max) {
                max = n;
            }
        }
        System.out.println("max = " + max);
        int min = numbers[0];
        for (int n : numbers) {
            if (n < min) {
                min = n;
            }
        }
        System.out.println("min = " + min);


    }
}
