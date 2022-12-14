package days.day33;

import java.util.Random;

public class Exercises {

    static Random random = new Random();

    public static void main(String[] args) {

    }


    //Write code that generates a random odd integer (not divisible by 2)
    //      between 50 and 99 inclusive.

    public static int generateRandomOddInt() {
        int result;
        do {
            result = random.nextInt(100 - 50) + 50;
        } while (result % 2 == 0);

        return result;
    }

// solution with break keyword!!
    public static void Odd() {
        int min = 50;
        int max = 100;
        int number;
        while (true) {
            number = random.nextInt(max - min) + min;
            if (number % 2 != 0) {
                break;
            }
        }
        System.out.println("number = " + number);

    }


}
