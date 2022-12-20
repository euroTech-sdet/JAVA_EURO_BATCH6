package days.day37;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {

//        Given an array of ints length 3, return a new array with the elements in
//        reverse order, so {1, 2, 3} becomes {3, 2, 1}.
//
//
//        reverse3([1, 2, 3]) → [3, 2, 1]
        int[] nums = {5, 6, 7};//
//        int[] reverse = new int[3];
        int[] reverse = new int[nums.length];
        reverse[0] = nums[2];
        reverse[1] = nums[1];
        reverse[2] = nums[0];
        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));
        System.out.println("Arrays.toString(reverse) = " + Arrays.toString(reverse));

    }
}
