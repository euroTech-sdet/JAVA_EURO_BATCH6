package days.day37;

import java.util.Arrays;

public class MaxEnd3 {
    public static void main(String[] args) {

//        Given an array of ints length 3, figure out which is larger,
//        the first or last element in the array, and set all the other elements to be that value.
//                Return the changed array.
//
//
//        maxEnd3([1, 2, 3]) → [3, 3, 3]
        int[] nums = {10, 2, 3};
        int max = nums[2];
        if (nums[0] > nums[2]) {
            max = nums[0];
        } else {
            max = nums[2];
        }
        nums[0] = max;
        nums[1] = max;
        nums[2] = max;
        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));

    }
}
