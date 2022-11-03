package days.day11;

public class ifStatement {

    public static void main(String[] args) {

        // I want to check that is my number is positive(bigger than 0) ? ,
        // if positive pls inform me

        int number = 11;

        if (number > 0) {// true!!
            // STATEMENT FOR true OPTION!!!!
            System.out.println("Number " + number + " is positive!!");

        }
        System.out.println("HIIIII");


        // I want to check that is my number is negative(less than 0) ? ,


        // if positive pls inform me

        if (number < 0) {
            System.out.println("Number " + number + " is negative!!");
        }
        System.out.println("HUYYYY");


        System.out.println("\n//////////////////////////////////////////\n");

//Write an if statement that multiplies salary by 1.5 if hours is greater than 38
        int hours = 39;
        double salary= 90000;

        if (hours >38) {
//            salary = salary * 1.5;
            salary *= 1.5;
        }

        System.out.println("salary = " + salary);

        System.out.println("\n//////////////////////////////////////////\n");

        //Write an if statement //  if y is greater than 0, then assigns 1 to x and print x value.

        int x = 0;
        int y = 10;

        if (y>0){
            // these statements will run only the condition is TRUE!!!
            x = 1;
            System.out.println("x = " + x);
        }

        System.out.println("\n//////////////////////////////////////////\n");

        //Write an if statement that increases pay by 3% if score is greater than 90.

        double pay = 1000;
        int score = 50;


        if (score > 90) {
           pay *= 1.03;  // pay = pay * 1.03;
        }

        System.out.println("pay = " + pay);

        System.out.println("\n//////////////////////////////////////////\n");


        //Write a program that prompts the user to enter an integer (OR give a random integer).
        //If the number is a multiple of 5, the program displays 'Hi Five'. If the number
        //is divisible by 2, it displays/prints 'Hi Even'.


        number = 15;
        if (number % 5 == 0) {
            System.out.println("Hi five");
        }

        if (number % 2 ==0) {
            System.out.println("Hi even");
        }

        System.out.println("\n//////////////////////////////////////////\n");

    //Write a program, declare int variable user age. Then program will show us is
    //The user eligible to vote or not.. (Rule: vote age >=18)

        int age = 10;

        if (age >= 18) {
            System.out.println("Eligible to vote");
        }


        if (age < 18) {
            System.out.println("Sorry, try again! :)");
        }



    }
}
