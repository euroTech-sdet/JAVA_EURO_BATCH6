package days.day16;

public class SumDouble {

    //    Given two int values, return their sum. Unless the two values are the same,
//    then return double their sum.
//        sumDouble(1, 2) → 3
//    sumDouble(3, 2) → 5
//    sumDouble(2, 2) → 8
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int sum = 0;
        if (a == b) {
            sum = 2 * (a + b);// 6 + 2=8  10
        } else {
            sum = a + b;
        }
        System.out.println("sum = " + sum);


    }
}
