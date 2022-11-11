package days.day16;

public class Ternary3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String numberComparision = (a == b) ? "equals" : "not equal";
        System.out.println("numberComparision = " + numberComparision);
        boolean isNumbersEqulaOrNot = (a == b) ? true : false;
        System.out.println("isNumbersEqulaOrNot = " + isNumbersEqulaOrNot);
        String text = "";
        a = 40;
        if (a == 1) {
            text = "one";
        } else if (a == 2) {
            text = "two";
        } else if (a == 4) {
            text = "four";
        } else if (a == 5) {
            text = "five";
        } else {
            text = " comes from if statements number not equal 1,2,3,4,5";
        }
        String ternaryText = "";
        System.out.println("text comes from if statements = " + text);
        ternaryText = (a == 1) ? "one" : (a == 2) ? "two" : (a == 3) ? "three" : (a == 4) ? "four" :
                (a == 5) ? "five" : "number not equal 1,2,3,4,5";
        System.out.println("ternaryText = " + ternaryText);


    }
}
