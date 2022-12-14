package days.day34;

import java.util.Random;

public class Tasks {

    static Random random = new Random();


    public static void task1(){

        int number, count = 0;
        do {
            number = random.nextInt(101);
            System.out.println(" Random number : " + number);
            count++;
        } while (number < 91);
        System.out.println("STOP! Max number exceeded!!");
        System.out.println("Loop count = " + count);
    }

    public static void task2(){

        int count = 0;
//        boolean sum = true;
        while (true) {
            int dice1 = random.nextInt(6) + 1;
            int dice2 = random.nextInt(6) + 1;
            count++;
            if (dice1 + dice2 == 8) {
                int sumOfDices = dice1 + dice2;
                System.out.println("First dice " + "(" + dice1 + ")" + " + " + "second dice " + "(" + dice2 + ")" + " = " + sumOfDices);
                //sum = false;
                break;
            } else {
                System.out.println("First dice " + "(" + dice1 + ")" + " + " + "second dice " + "(" + dice2 + ")" + " is not 8");
            }
        }
        System.out.println("count = " + count);
    }

    public static void task2_2(){

        int count=0;
        int dice1,dice2;
        do{
            dice1 = random.nextInt(6) + 1;
//            dice1 = random.nextInt(1, 7);
            dice2 = random.nextInt(6) + 1;
            count++;
        }while(dice1 + dice2 != 8);

        //
    }


    public static void main(String[] args) {
        task3(1, 110);
        task3(10, 100);
    }

    public static void task3(int min, int max) {

        int pick = random.nextInt(max-min+1) + min;

        if (pick <= max && pick >= min) {
            int pseudorandom = 0;
            int count = 0;
            int remaining = 1;

            do {
                pseudorandom = random.nextInt(max - min + 1) + min;
                System.out.println("next number = " + pseudorandom);
                count++;
               // remaining--;
            } while (pseudorandom != pick && --remaining > 0);

            if (remaining == 0) {
                System.out.println("Limit expired, Can not find !! ");
            } else {
                System.out.println("Your number came up after " + count + " times");
            }
        }else {
            System.out.println("Pick number must be between Min-Max Numbers !!");
        }
    }


    public static void task3_2(){
        int secret = random.nextInt(10)+1;
        int number2 = 0;

        for (int i = 1; i < 11; i++) {
            number2 = random.nextInt(10)+1;
            System.out.println("next number = " + number2);
            if (number2 == secret) {
                System.out.println("Your number came up after " + i + " times");
                return;
            }
        }
            System.out.println(" FAILED!!!");
    }




}
