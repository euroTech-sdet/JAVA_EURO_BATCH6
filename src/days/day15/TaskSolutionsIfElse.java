package days.day15;

public class TaskSolutionsIfElse {


    public static void main(String[] args) {


        // TASK alarmClock

        int day = 1;
        boolean vacation = false;
        String alarm;

        if (day < 0 || day > 6) {
            alarm = "INVALID DAY";
        } else if (day > 0 && day < 6) {  // WEEKDAYS  !!
//            if (vacation) {
//                alarm = "10:00";
//            } else {
//                alarm = "7:00";
//            }
            alarm = (vacation) ? "10:00" : "7:00";
        } else {  // WEEKENDS !!!
//            if (vacation) {
//                alarm = "OFF";
//            } else {
//                alarm = "10:00";
//            }
            alarm = (vacation) ? "OFF" : "10:00";
        }


        System.out.println("alarm = " + alarm);


        // TASK specialEleven
//We'll say a number is special if it is a multiple of 11 or if it is one more than a multiple of 11.
// Return true if the given non-negative number is special.
        int number = 23;
        boolean result = (number % 11 == 0) || (number % 11 == 1);
//        if ((number % 11 == 0) || (number % 11 == 1)) {
//            result= true;
//        } else {
//            result = false;
//        }


        //TASK more 20

//        Return true if the given non-negative number is 1 or 2 more than a multiple of 20.

        number = 22;

        result =  (number % 20 == 1) || (number % 20 == 2);


        //TASK old 35
        // Return true if the given non-negative number is a multiple of 3 or 5, but not both.

        result =  ((number % 3 == 0) || (number % 5 == 0 )) && (number %15 != 0);


        //TASK near10

//        Given a non-negative number "num", return true if num is within 2 of a multiple of 10.
//        Note: (a % b) is the remainder of dividing a by b, so (7 % 5) is 2
    }
}
