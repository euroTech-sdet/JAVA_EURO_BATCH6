package days.day16;

public class TbernaryOperators2 {
    public static void main(String[] args) {
        int number = 35;
        String isNumberBiggerThan = (number < 10) ? "number is smaller than 10" :
                (number < 20) ? "number is smaller than 20" :
                        (number < 30) ? "number is smaller than 30" :
                                (number < 40) ? "number is smaller than 40 and bigger than 30" : "else part of ternary operator";
        System.out.println("isNumberBiggerThan = " + isNumberBiggerThan);
        boolean isNumberSmallerThan = (number < 10) ? true : (number < 20) ? true : (number < 30) ? true :
                (number < 40) ? true : false;
        System.out.println("isNumberSmallerThan = " + isNumberSmallerThan);
        if (number < 10) {
            System.out.println("number is smaller than 10");
        } else if (number < 20) {
            System.out.println("number is smaller than 20");
        } else if (number < 30) {
            System.out.println("number is smaller than 30");
        } else if (number < 40) {
            System.out.println(" comes from if ,number is smaller than 40");
        } else {
            System.out.println("else part of if statements");
        }


    }
}
