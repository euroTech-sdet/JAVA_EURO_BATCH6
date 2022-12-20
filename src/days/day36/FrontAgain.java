package days.day36;

public class FrontAgain {
    public static void main(String[] args) {

//        Given a string, return true if the first 2 chars in the string
//        also appear at the end of the string, such as with "edited".
//
//
//                frontAgain("edited") → true
//        frontAgain("edit") → false

        String str = "edited";
        //            012345
        String first2 = str.substring(0, 2);
//        String last2 = str.substring(4);
        String last2 = str.substring(str.length() - 2);
        boolean equalsOrNot = first2.equals(last2);
        System.out.println(equalsOrNot);
        System.out.println(str.endsWith(first2));


    }
}
