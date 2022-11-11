package days.day16;

public class TernaryOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        if (a > b) {
            System.out.println("a is bigger than b");
        } else {
            System.out.println("b is bigger than a");
        }
        String result = (a > b) ? "a is bigger than b" : "b is bigger than a";
        int max = (a > b) ? a : b;
        boolean aIsBigger = (a > b) ? true : false;
        System.out.println("result = " + result);
        System.out.println("max = " + max);
        System.out.println("aIsBigger = " + aIsBigger);
        int c = 130;
        a = 140;
        b = 20;

        max = (a > b && a > c) ? a : (b > c) ? b : c;
        System.out.println("max = " + max);

        int twoNumber = (a > b) ? a : b;
//        int threeNumbers = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        int threeNumbers = (a > b) ? ((a > c) ? a : c) : (b > c) ? b : c;


    }
}
