package days.day38;

public class Arrays5 {
    public static void main(String[] args) {
        int[] nums = {2, 5, 8, 9, 10};
        int[] nums5 = {20, 50, 80, 90, 100,500,900};
//        for (int n : nums) {
//            System.out.println("n = " + n);
//        }
        printIntString("Hello");
        printIntString("Java");
        printIntString("Holiday");
        printArray(nums);
        printArray(nums5);
        printLengthhOfTheMethod(nums);
        printLengthhOfTheMethod(nums5);
    }

    public static void printLengthhOfTheMethod(int[] nums) {
        System.out.println("length of the array  = " + nums.length);
    }

    public static void printArray(int[] numbers) {
        System.out.println("print array method is running");
        for (int n : numbers) {
            System.out.println("n = " + n);
        }
    }


    public static void printIntString(String str) {
        System.out.println("str = " + str);
    }


}
