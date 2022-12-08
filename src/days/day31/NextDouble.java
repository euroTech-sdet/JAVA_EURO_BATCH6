package days.day31;

import java.util.Scanner;

public class NextDouble {



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ask task rate, item price(before tax), quantity  to user, then calculate and return total price(inc tax)

        System.out.println(" TOTAL PRICE(INC TAX) : " + calculateTotalPrice(scanner));

        System.out.println(" TOTAL PAID TAX: " + calculateTotalTax(scanner));
    }


    public static double calculateTotalPrice(Scanner scanner){
      //  Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter Tax Rate: ");
        double taxRate = scanner.nextDouble();

        System.out.println("What is item price? ");
        double itemPrice = scanner.nextDouble();

        System.out.println("Please enter item quantity: ");
        int quantity = scanner.nextInt();

        return ( (itemPrice * taxRate) + itemPrice ) * quantity;
    }


    /**
     * This method calculate total tax for all purchased items!!
     * @param scanner
     * @return the total tax value
     */
    public static double calculateTotalTax (Scanner scanner){
    //    Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter Tax Rate: ");
        double taxRate = scanner.nextDouble();

        System.out.println("What is item price? ");
        double itemPrice = scanner.nextDouble();

        System.out.println("Please enter item quantity: ");
        int quantity = scanner.nextInt();

        return  (itemPrice * taxRate) * quantity;
    }



}
