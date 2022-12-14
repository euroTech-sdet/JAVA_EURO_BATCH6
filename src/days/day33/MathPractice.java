package days.day33;

import java.util.Random;

public class MathPractice {

    static Random random = new Random();
    public static void main(String[] args) {

        System.out.println("Math.max(1, 'a') = " + Math.max(1, 'a'));
        System.out.println("Math.max(1.0,2.0) = " + Math.max(1.0, 2.0));
        System.out.println("Math.max(1,2.0) = " + Math.max(1, 2.0));

////////// ABS()

        System.out.println("Math.abs(random.nextInt()) = " + Math.abs(random.nextInt()));

        byte abc=-1;
        System.out.println("Math.abs(abc) = " + Math.abs(abc));


        ////////// ROUNDING

        // CEIL  --> ROUND TO UP!!!!

        System.out.println("Math.ceil(2.001) = " + Math.ceil(2.001));

        // FLOOR --> ROUND TO DOWN!!!

        System.out.println("Math.floor(2.999) = " + Math.floor(2.999));

        //////////// Random

        // --> 0<= k < 1 same with nextDouble()
        System.out.println("Math.random() = " + Math.random());



        // Rounding to nearest int value!!!

        System.out.println("Math.round(2.1) = " + Math.round(2.1));  //--> 2
        System.out.println("Math.round(2.5) = " + Math.round(2.5));  //--> 3
        System.out.println("Math.round(2.9) = " + Math.round(2.9));  //--> 3



        // PI

        System.out.println("Math.PI = " + Math.PI);


        // Return random int number between a (inc) and b (exc)
        // a + (int) (Math.random() * b)

        // 1(inc) - 10(exc)

        System.out.println("Return random int number between a (inc) and b (exc):  " + (1 + (int) (Math.random() * 10)));



        //0 - 999    - 1000

        System.out.println("Return 0 - 999:  " + (0 + (int) (Math.random() * 1000)));
    }




}
