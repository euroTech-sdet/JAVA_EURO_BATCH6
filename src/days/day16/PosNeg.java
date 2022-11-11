package days.day16;

public class PosNeg {
    public static void main(String[] args) {

//        Given 2 int values, return true if one is negative and one is positive.
//                Except if the parameter "negative" is true,
//            then return true only if both are negative.
//
//                posNeg(1, -1, false) → true
//        posNeg(-1, 1, false) → true
//        posNeg(-4, -5, true) → true

        //  if boolean value is true  if both int variables are negative print true
        // print true  one is negative and one is positive
        int a = 1, b = -1;
        boolean result = false;
        boolean negative = false;
        if (negative) {
            if (a < 0 && b < 0) {
                result = true;
            }
        } else {
            if ((a < 0 && b > 0) || (b < 0 && a > 0)) {
                result = true;
            }
        }
        System.out.println("result = " + result);
    }
}
