package days.day23;

public class GreaterNumber {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        if (a > b) {
            System.out.println(a + " is greater than " + b);
        } else if (a < b) {
            System.out.println(b + " is greater than " + a);
        } else {
            System.out.println(a + " is equals to " + b);
        }
        greaterNumber(a, b);
        greaterNumber(10, 30);
        int bigNumber = biggerNumber(30, 50);
        biggerNumber(90, 120);
        System.out.println("bigNumber = " + bigNumber);
    }

    public static void greaterNumber(int a, int b) {
        if (a > b) {
            System.out.println(a + " is greater than " + b);
        } else if (a < b) {
            System.out.println(b + " is greater than " + a);
        } else {
            System.out.println(a + " is equals to " + b);
        }
    }

    public static int biggerNumber(int a, int b) {
        int greaterNumber = 0;
        if (a > b) {
            greaterNumber = a;
        } else {
            greaterNumber = b;
        }

        System.out.println("greater number is " + greaterNumber);
        return greaterNumber;
    }
}
