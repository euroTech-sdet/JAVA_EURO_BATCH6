package days.day52;

import java.util.Arrays;

public class RotationOfArray {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 20, 13, 14, 15, 10};
        //               0  1    2  3   4   5  6
        //            rotateArray(int[]arr,int number)
        //     0--->1
        //     1--->2
//        int[] afterRotation = new int[numbers.length];
//        for (int i = 0; i < numbers.length; i++) {
//            afterRotation[(i + 1) % 7] = numbers[i];
//        }
//        System.out.println("Arrays.toString(afterRotation) = " + Arrays.toString(afterRotation));
        int[] arr = new int[]{50, 60, 70, 55, 45};
        rotateArray(numbers, 3);
        rotateArray(arr, 2);


    }

    public static void rotateArray(int[] numbers, int times) {
        int[] afterRotation = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            afterRotation[(i + times) % numbers.length] = numbers[i];
        }
        System.out.println("Arrays.toString(afterRotation) = " + Arrays.toString(afterRotation));
    }
}
