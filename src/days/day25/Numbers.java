package days.day25;

public class Numbers {
    public static void main(String[] args) {
        int a = 10;
        int number = greaterNumber(a, 20);
        System.out.println("number = " + number);

    }

    public static int greaterNumber(int a, int b) {
        int max = 0;
        if (a > b) {
            max = a;
            return a;
        } else if (a == b) {
            max = 0;
            return max;
        } else {
            return b;
        }
      //  System.out.println("max = " + max);
//        return max ;
    }
}
