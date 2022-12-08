package days.day31;

import days.day16.SumDouble;
import days.day23.Sum;

import java.util.Scanner;

public class ScannerSample {



    public static void main(String[] args) {

//        Test2 obj = new Test2();
//        obj.test2noStatic();
//
//        Sum obj2 = new Sum();
//        Sum.sumOfTheNumbers();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your age for VOTE check: ");
        int age = scanner.nextInt();

        System.out.print("Please enter your Lucky number: ");
        int luckNumber = scanner.nextInt() ;


        System.out.println("Enter your PIN number: ");
        int test = scanner.nextInt();
        System.out.println("PIN = " + test);


        if (age >= 18) {
            System.out.println("Eligible to vote");
        }else {
            System.out.println("Sorry, try again! :)");
        }

        System.out.println("Your luckNumber is = " + luckNumber);


        int x = 1;
        while(x<4){

            System.out.println("Next number: " + scanner.nextInt());
            x++;
        }

        scanner.close();  // not mandatory!! but use it when u finish reading data from console - best practice -


    }

}
