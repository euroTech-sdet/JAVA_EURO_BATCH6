package days.day32;

import java.util.Scanner;

public class Exercise {

    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
   //     ex1();
//        ex2();
//        ex2_2();
        ex5();
    }


    public static void ex1() {
        System.out.print("Enter a degree in Celsius :");
        int celsius = scanner.nextInt();

        double fahrenheit = (double) 9 / 5 * celsius + 32;

        System.out.println(celsius + " °C is " + fahrenheit + " °F");
    }

    public static void ex2() {
        int digits, sumOfDigits = 0;   //, numberOfDigits

        Scanner consoleInput = new Scanner(System.in);
        System.out.print("Enter any number :");
        digits = consoleInput.nextInt();

        while (digits > 0) {
//            numberOfDigits = digits % 10; // Using the % operator to extract digits
            sumOfDigits +=digits % 10;
            digits /= 10;  //using the / operator to remove the extracted digit
        }
        System.out.println("sum of all its digits is = " + sumOfDigits);
    }

    public static void ex2_2() {
        System.out.print("Enter a number :");
        int n = scanner.nextInt();
        int sum = n % 10 + (n / 10) % 10 + (n / 100) % 10;
        System.out.println("sum = " + sum);

    }
    public static void ex3() {
        System.out.print("Enter the amount of water in kilograms: ");
        double M = scanner.nextDouble();
        System.out.print("Enter the initial temperature: ");
        double initialT = scanner.nextDouble();
        System.out.print("Enter the final temperature: ");
        double finalT = scanner.nextDouble();
        double Q = M * (finalT - initialT) * 4184;
        System.out.println("The energy needed is " + Q);
    }

    public static void ex4() {

        System.out.print("Enter the number of minutes : ");
        int input = scanner.nextInt();

        int year = 0, day = 0;
        int m = 24 * 60 * 365;  // 1 year min value

            year = input / m;
            day = (input % m) / (24 * 60);
        System.out.println(input + " minutes is approximately " + year + " years and " + day + " days ");
    }


    public static void ex5() {
        System.out.print("Hey boss,enter your secret number (between 1-30):\n");
//        int number = scanner.nextInt();  // 10
//
//        while (number < 1 || number > 30) {
//            System.out.print("Please write a number within the limits:");
//            number = scanner.nextInt();
//        }
        int number=0;
        do{
           number = scanner.nextInt();
            if(number < 1 || number > 30) {
                System.out.print("Please write a number within the limits:");
            } else{
                break;
            }

        }while (true);



        System.out.println("Please guess the number  : ");
        int numberOfGuess = scanner.nextInt();

        while (numberOfGuess < 0 || numberOfGuess > 30) {
            System.out.println("Please write a number within the limits:");
            numberOfGuess = scanner.nextInt();
        }

        int count = 1;
        while (number != numberOfGuess){ //20

            if (numberOfGuess < number) {
                System.out.println(numberOfGuess + " is too small, please try again:");
            } else {
                System.out.println(numberOfGuess + " is too large, please try again:");
            }

            numberOfGuess = scanner.nextInt();
            count++;
        }

        System.out.println("Bravo !! You got the number in " + (count) + " tries! ");

    }


   public static void  e5_2(){
       int count = 0;
       int number = 0;
       int secret =10;

       //TASK
       scanner.hasNext();
       scanner.hasNextInt();


       do {
           count++;
           System.out.print("Please enter a number : ");
           number = scanner.nextInt(); // 15 10
           if (number > secret) {
               System.out.println(number + " is too large, please try again! ");
           } else if (number < secret) {
               System.out.println(number + " is too small, please try again! ");
           }
       } while (number != secret);

       System.out.println("Bravo!! You got the number in " + count + " tries!!");


   }


        



}
