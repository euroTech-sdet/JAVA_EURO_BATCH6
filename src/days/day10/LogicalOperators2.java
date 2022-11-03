package days.day10;

public class LogicalOperators2 {
    public static void main(String[] args) {
//        weekday   monday or tuesday or wednesday or thursday or friday
        // weekend   saturday or sunday ---> day is weekend
//        saturday || sunday

        System.out.println(3 > 1 || 3 > 2);
//                          true      true   -----> true
        System.out.println(3 > 1 || 3 > 5);
//                          true     false  -----------> true
        System.out.println(3 > 10 || 3 > 2);
//                          false     true  --------------->true
        System.out.println(3 > 10 || 3 > 20);
//                          false      false -------------> false


        int a = 10;
        System.out.println(3 > 1 || ++a > 2);// will ignore the second statement because the first statement is true
        // for or operator if only 1 of the result is true then result will be true
        System.out.println("a = " + a);
        System.out.println(3 > 1 | ++a > 2);

        // weekend   saturday or sunday ---> day is weekend

        boolean isWeekend;
        boolean isSunday = false;
        boolean isSaturday = false;
        isWeekend = isSunday || isSaturday;
        System.out.println("isWeekend = " + isWeekend);
        isSunday = true;
        isSaturday = false;
        isWeekend = isSunday || isSaturday;
        System.out.println("isWeekend = " + isWeekend);

//        isNumber2Digit
        int number = 100;
        boolean isNumber2Digit = number >= 10 && number <= 99;
        System.out.println("isNumber2Digit = " + isNumber2Digit);

        // number is between    20 40    60 80
        number = 80;
        boolean result = (number > 20 && number < 40) || (number > 60 && number < 80);
        System.out.println("result = " + result);

        // find whether the number is even or not
        number = 23;
        // if we divide a number to 2 and remainder is 0 then this number is even number
        // after division rif the remainder is 1 this number is odd number
        boolean isEven = number % 2 == 0;
        number = 20;
        isEven = number % 2 != 1;
        System.out.println("isEven = " + isEven);


    }
}
