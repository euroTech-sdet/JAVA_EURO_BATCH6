package days.day37;

public class SameFirstLast {
    //    Given an array of ints, return true if the array is length 1 or more,
//    and the first element and the last element are equal.
//
//
//            sameFirstLast([1, 2, 3]) → false
//    sameFirstLast([1, 2, 3, 1]) → true
//    sameFirstLast([1, 2, 1]) → true
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        //            0  1  2  3
        System.out.println("nums.length = " + nums.length);
        if (nums[0] == nums[nums.length - 1]) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        String[] cities = {"Istanbul", "London", "Oslo"};
//        if (cities[0].equals(cities[2])) {
        if (cities[0].equals(cities[cities.length - 1])) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        boolean result = (cities[0].equals(cities[2])) ? true : false;
        System.out.println("result = " + result);

    }
}
