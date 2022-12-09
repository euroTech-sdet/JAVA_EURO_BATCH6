package days.day31;

import java.util.Scanner;

public class NextOthers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(4444333322221111L);
        System.out.println("Enter temp : ");
        float test = 3.5f;

        float temp = scanner.nextFloat();

                if(temp<4){
                    System.out.println("Start the cooler system");
                } else {
                    System.out.println("Stop the cooler system");
                }

        System.out.println("Please enter your card number: ");
//        long creditCardNumber = scanner.nextInt(); do not provide value out of int range!!
        long creditCardNumber = scanner.nextLong();
        System.out.println("creditCardNumber = " + creditCardNumber);


    }
}
