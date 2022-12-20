package days.day37;

public class Arrays2 {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 20, 50};
        //      index    0   1   2   3     ---->length of this array  4
        System.out.println("numbers.length = " + numbers.length);//4
        System.out.println("numbers[3] = " + numbers[3]);
        System.out.println("numbers[0] = " + numbers[0]);
        // System.out.println(numbers[5]);
        String[] cities = new String[5];
        cities[0] = "London";
        cities[1] = "Roma";
        System.out.println("cities[4] = " + cities[4]);
        int[] nums = new int[]{1, 2, 3, 4};
        nums[0] = 50;
        System.out.println("numbers.getClass() = " + numbers.getClass());
        System.out.println("cities.getClass() = " + cities.getClass());
        System.out.println("numbers[0] = " + numbers[0]);
        System.out.println("numbers[3] = " + numbers[3]);
        System.out.println("numbers[numbers.length-1] = " + numbers[numbers.length - 1]);


    }
}
