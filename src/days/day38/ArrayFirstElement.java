package days.day38;

public class ArrayFirstElement {
    public static void main(String[] args) {
        String[] cities = {"Istanbul", "Oslo", "Munich"};
        //   System.out.println("cities[0] = " + cities[0]);
        printFirst(cities, 5);
        int[] str = {1, 2, 3,10};
        //  printFirst(str);
        printLengthOfTheMethod(cities);
        printLengthOfTheMethod(str);

    }

    public static void printFirst(String[] str, int a) {
        System.out.println("str[0] = " + str[0]);
    }

    public static void printLengthOfTheMethod(String[]str) {
        System.out.println("str.length = " + str.length);
    }
    public static void printLengthOfTheMethod(int[]str) {
        System.out.println("str.length = " + str.length);
    }


}
