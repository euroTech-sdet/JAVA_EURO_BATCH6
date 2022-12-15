package days.day35;

public class ExtraEnd {

    //    Given a string, return a new string made of 3 copies of the last 2 chars of the original string.
//    The string length will be at least 2.
//
//
//    extraEnd("Hello") → "lololo"
//    extraEnd("ab") → "ababab"
//    extraEnd("Hi") → "HiHiHi"
    public static void main(String[] args) {
        String str = "Hello";
        //            01234
        //               34
        System.out.println(str.substring(3));
        //
        System.out.println("str.length() = " + str.length());
        System.out.println(str.substring(str.length() - 2));
        String substring = str.substring(str.length() - 2);
        System.out.println(substring + substring + substring);
        str = "Hello";//He
        //     012
        System.out.println(str.substring(0, 2));//01 the first letter


    }
}
