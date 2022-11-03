package days.day10;

public class LogicalOperators {
    public static void main(String[] args) {
//   //   AND
        // weekend  saturday   true   true  yes       tuesday   false     false  no    wednesday  false  false and
        //  20 C       25       true                      30      true                     10       false

        // or
        // saturday or sunday ----->      saturday  ---> true

        // &&
        System.out.println(3 > 2 && 5 > 3);
//       //                 true &&  true -------> true
        System.out.println(3 > 2 && 3 > 5);
//                           true    false -------> false
        System.out.println(2 > 3 && 3 > 5);
//                          false     false  ----------> false
        System.out.println(2 > 3 && 3 < 5);
//                          false     true   ------------> false

        System.out.println(true && true);// ------>true
        System.out.println(true && false);// ------>false
        System.out.println(false && false);// ------>false
        System.out.println(false && true);// ------>false

        int c = 10;
        boolean first = 20 > 10;
        boolean second = 20 >= c;
        System.out.println(first && second);
// picnic condition
        boolean isWeekend;
        boolean isWeatherOver20;
        isWeekend = true;
        isWeatherOver20 = false;
        System.out.println(isWeekend && isWeatherOver20);// we will not go to picnic

        System.out.println(isWeekend & isWeatherOver20);
        int a = 20;
        System.out.println(20 > 3 && a > 10);// true && true ----> true
        System.out.println(20 < 3 && ++a > 10);// false && true ----->
        System.out.println("a = " + a);
        System.out.println(20 < 3 & ++a > 10);
        System.out.println("a = " + a);

        String weekend2 = "saturday";
        boolean isWeekend2 = weekend2 == "saturday" + "sunday";
        System.out.println("isWeekend2 = " + isWeekend2);
//        boolean isWeekday2 = !isWeekend2;
//        System.out.println("isWeekday2 = " + isWeekday2);


    }
}
