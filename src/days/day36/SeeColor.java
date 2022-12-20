package days.day36;

public class SeeColor {
    public static void main(String[] args) {
//        Given a string, if the string begins with "red" or "blue" return
//            that color string, otherwise return the empty string.
//
//
//        seeColor("redxx") → "red"
//        seeColor("xxred") → ""
//        seeColor("blueTimes") → "blue"
        String str = "blueTimes";

        if (str.startsWith("red")) {
            System.out.println("red");
        } else if (str.startsWith("blue")) {
            System.out.println("blue");
        } else {
            System.out.println("no red or blue at at the beginning of the string");
        }
    }
}
