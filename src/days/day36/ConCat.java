package days.day36;

public class ConCat {
    public static void main(String[] args) {

//        Given two strings, append them together (known as "concatenation")
//        and return the result. However, if the concatenation creates a double-char,
//        then omit one of the chars, so "abc" and "cat" yields "abcat".
//
//
//                conCat("abc", "cat") → "abcat"
        String str = "abcd";
        //          012
        String str2 = "cat";
        char last = str.charAt(str.length() - 1);
        char first = str2.charAt(0);
        String concat = "";
        if (last == first) {
            concat = str.concat(str2.substring(1));
        } else {
            concat = str.concat(str2);
        }

        System.out.println("concat = " + concat);

    }
}
