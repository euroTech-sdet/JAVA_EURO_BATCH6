package days.day36;

public class EndsLy {

    //    Given a string, return true if it ends in "ly".
//
//
//    endsLy("oddly") → true
//    endsLy("funny") → false
//    endsLy("oddy") → false
    public static void main(String[] args) {
        String str = "oddly";
        if (str.endsWith("ly")) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        if (str.substring(str.length() - 2).equals("ly")) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        if(str.startsWith("odd")){
            System.out.println(true);
        }

    }
}
