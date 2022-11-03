package days.day10;

public class LogicalOperators3 {
    public static void main(String[] args) {
        boolean not = true;
        System.out.println("not = " + !not);
        System.out.println(!false);
        int a = 20;
        System.out.println(!(a == 20));
        int number = 20;
        boolean isEven = number % 2 == 0;
        number = 21;
        isEven = number % 2 != 1;
        //  System.out.println("isEven = " + isEven);
        boolean isOddNumber = !isEven;
        System.out.println("isEven = " + isEven);
        System.out.println("isOddNumber = " + isOddNumber);

        boolean isWeekend;
        boolean isSunday = false;
        boolean isSaturday = false;
        isWeekend = isSunday || isSaturday;
        boolean isWeekdays = !isWeekend;
        System.out.println("isWeekend = " + isWeekend);
        System.out.println("isWeekdays = " + isWeekdays);


    }
}
