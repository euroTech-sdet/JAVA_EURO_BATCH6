package days.day31;

import java.util.Random;
import java.util.Scanner;

public class ScannerStrings {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        System.out.println("Pls enter your full name: ");
//        String fullName = scanner.nextLine();
//
//        System.out.println("fullName = " + fullName);
//
//        System.out.println("Pls enter your messages : ");
//        String message = scanner.nextLine();
//        System.out.println("message = " + message);


//        System.out.println("Please enter your name, surname and id with space separation: ");
//        String name= scanner.next();
//        String surname = scanner.next();
//        String id = scanner.next();
//
//        System.out.println("name = " + name);
//        System.out.println("surname = " + surname);
//        System.out.println("idNumber = " + id);

//        System.out.println("Enter key:");
//        String key= scanner.next();
//        System.out.println("Enter token: ");
//        String token = scanner.nextLine();
//
//        System.out.println("key = " + key);
//
//        System.out.println("nextLine = " + token);
//
//        System.out.println("Next INT: ");
//        int a=   scanner.nextInt();
//        scanner.nextLine();
//        System.out.println("Next line: ");
//        String b=   scanner.nextLine();
//
//        System.out.println("Next line: ");
//        String c=   scanner.nextLine();
//
//        System.out.println("c = " + c);



        System.out.println("Enter value: ");
     //   System.out.println("scanner.hasNextInt() = " + scanner.hasNextInt());
        int i=0;
        if(scanner.hasNextInt()){
            i = scanner.nextInt();
        } else{
            System.out.println(" INVALID DATA!!!");
        }
        System.out.println("\ni = " + i);
        ////
    }

    static  Scanner input = new Scanner(System.in);
    static Random random = new Random();

    public static void guessingGame(int min, int max) {
        int n = random.nextInt(max-min)+min;
        int count = 1;
        int remaining = 4;
        System.out.println("Enter a number between 1-30, you can try 5 times ");
        while (!input.hasNextInt()) {
            input.next();
            System.out.print("Please Enter a valid number between 1-30" + "\nRemaining times: " + remaining);
            count++;
            remaining--;
        }
        //||input>30||input<0
        int number = input.nextInt();
        while (number <= 0 || number > 30) {
            System.out.println("You entered an invalid number, Please Enter a valid number between 1-30");
            number = input.nextInt();
            count++;
            remaining--;
        }
        while (n != number && remaining > 0) {

            if (Math.abs(n - number) >= 10) {
                System.out.println(number + " is  cold, please try again! " + "\nRemaining times: " + remaining);
            } else if (Math.abs(n - number) >= 5) {
                System.out.println(number + " is warm, please try again! " + "\nRemaining times: " + remaining);
            } else {
                System.out.println(number + " is  hot, please try again! " + "\nRemaining times: " + remaining);
            }
            number = input.nextInt();
            count++;
            remaining--;
        }
        if (n == number) {
            System.out.println("Bravo!!, You got the number at " + count + " attempt !!");
        } else if (remaining == 0) {
            System.out.println("You lost !!");
        }
    }
}
