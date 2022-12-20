package days.day36;

public class NonStart {
    public static void main(String[] args) {
//        Given 2 strings, return their concatenation,
//                except omit the first char of each. The strings will be at least length 1.
//
//
//        nonStart("Hello", "There") → "ellohere"
//        nonStart("java", "code") → "avaode"
//        nonStart("shotl", "java") → "hotlava"
        String str = "Hello";
        String str2 = "There";
        String strWithout = str.substring(1);// H    ello
        String str2Without = str2.substring(1);
        System.out.println(strWithout + str2Without);
        System.out.println(strWithout.concat(str2Without));

        String concat = str.substring(1).concat(str2.substring(1));
        //                    string              .concat(

    }
}
