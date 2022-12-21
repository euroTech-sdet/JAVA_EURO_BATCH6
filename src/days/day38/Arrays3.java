package days.day38;

import java.util.Arrays;

public class Arrays3 {
    public static void main(String[] args) {
        int[] nums = {10, 20, 5, 15, 25, 70};
        //             0   1  2
        String numsString = Arrays.toString(nums);
        System.out.println("numsString = " + numsString);
        System.out.println("Arrays.binarySearch(nums,5) = " + Arrays.binarySearch(nums, 5));
        System.out.println("Arrays.binarySearch(nums,50) = " + Arrays.binarySearch(nums, 50));
        int search = 5;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 5) {
                System.out.println("index number of searched value " + i);
            }
        }
        Arrays.sort(nums);//arrays are mutable
        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));
        String city = "ROMA";
        System.out.println("city.toLowerCase() = " + city.toLowerCase());//roma
        System.out.println("city = " + city);//ROMA

        System.out.println("Arrays.stream(nums).sum() = " + Arrays.stream(nums).sum());

        //  Arrays.stream(nums).forEach(System.out::println);
        System.out.println(Arrays.stream(nums).sum());
        int[] nums2 = {10, 20, 5, 15, 25, 70};
        Arrays.sort(nums2);
        System.out.println("Arrays.equals(nums2,nums) = " + Arrays.equals(nums2, nums));
        Arrays.toString(nums);
        Arrays.binarySearch(nums, 5);
        Arrays.sort(nums2);
        Arrays.equals(nums2, nums);

        String[] players = {"Ali", "Veli", "Michael", "Austin", "Bahadir", "Stephen"};
        System.out.println(Arrays.binarySearch(players, "Ali"));
        System.out.println(Arrays.binarySearch(players, "Veli"));
        //Arrays.sort(players);
        System.out.println("Arrays.toString(players) = " + Arrays.toString(players));
        String[] players1 = {"Ali", "Veli", "Michael", "Austin", "Bahadir", "Stephen"};
        System.out.println("Arrays.equals(players1,players) = " + Arrays.equals(players1, players));



    }
}
