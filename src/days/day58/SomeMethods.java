package days.day58;

public class SomeMethods {
    //  create a method, get a string value as an argument, reverse it and return reversed value


    public static String reverseString(String str) {
        StringBuilder builder = new StringBuilder(str);
        builder.reverse();
        str = String.valueOf(builder);
        //str = new String(builder);
        return str;
    }

    public String reverseString2(String str, int number) {
        return reverseString2(str);
    }

    public String reverseString2(String str) {
        StringBuilder builder = new StringBuilder(str);
        builder.reverse();
        str = String.valueOf(builder);
        //str = new String(builder);
        return str;
    }


}
