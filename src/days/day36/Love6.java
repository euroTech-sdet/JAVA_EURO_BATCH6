package days.day36;

public class Love6 {
    public static void main(String[] args) {

//        The number 6 is a truly great number. Given two int values, a and b,
//        return true if either one is 6. Or if their sum or difference is 6.
//    Note: the function Math.abs(num) computes the absolute value of a number.
//  one of them is  , sum or difference 6
//
//                love6(6, 4) → true
//        love6(4, 5) → false
//        love6(1, 5) → true
        int a = 5;//11
        int b = 11;// 5
        System.out.println(a - b);//-6
        if (a == 6 || b == 6 || a + b == 6 || a - b == 6 || b - a == 6) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        if (a == 6 || b == 6 || a + b == 6 || Math.abs(a - b) == 6) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        System.out.println(Math.PI);

    }
}
