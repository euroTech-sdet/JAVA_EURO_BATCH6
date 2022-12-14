package days.day33;

import java.util.Random;

public class RandomSample {

    static Random random = new Random();

    public static void main(String[] args) {


        int randomInt = random.nextInt() + random.nextInt();

        System.out.println("randomInt = " + randomInt);


        ///////////////

        int randomWithRange = random.nextInt(101);  // 0 - 100 (inc)

        System.out.println("randomWithRange = " + randomWithRange);

        /////////////// next double

        double randomDouble = random.nextDouble(); // 0<= return < 1

        System.out.println("randomDouble = " + randomDouble);


//       type a exp to return -->  0.0(inc)   -   100.0(exc)
//        0.0   90.0  90.99    11.12

        double randomScore = random.nextInt(100) + random.nextDouble();

        System.out.println("randomScore = " + randomScore);

//
        System.out.println("random.nextBoolean() = " + random.nextBoolean());


        /// generate random  number between min and max values

        // random.nextInt(max - min ) + min

        int min = 1;  // inc

        int max = 5;  // exc

        int result = random.nextInt(max - min) + min;
        System.out.println("result = " + result);


        // Create a method to return random ID numbers for students->
        // it must be 4 digit !!!

        System.out.println("generateRandomStudentID() = " + generateRandomStudentID());


        // HOMEWORK!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    }


    public static int generateRandomStudentID() {
        int min = 1000; // (inc)
        int max = 10000; //(exc)
        return random.nextInt(max - min) + min;
    }


}
