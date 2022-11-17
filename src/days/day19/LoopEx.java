package days.day19;

public class LoopEx {

    public static void main(String[] args) {

        //Write a method that prints the multiplication table of the user provided number. (Use while loop!)

        int number=7,i=1;

        while( i<=10)
        {
            System.out.println(number+" X "+i+ " = " + (number * i++));
        }


        /////////////
        // Version 2: try with do while, and limit number will be variable!!
        number=7;
        i=1;
        int limit = 11;

        do{
//            if (i>limit) {
//                break;
//            }
            System.out.println(number+" X "+i+ " = " + (number * i++));
        } while (i<=limit);



        /////////////

        // Write Send an email then navigate to Sent Folder, verify that email send

            // INBOX, IP (In progress), Sent Folder

//        System.out.println("Write an email");
//        System.out.println("Click to Send Button");
//        System.out.println("Navigate to Sent Folder");
//        System.out.println("Verify that sent email appear!"); // FAIL Line 41 why,
        // email process takes SOME times, sometimes 10 sn sometimes 90 sn
        // We need refresh sent folder table, then need to check that email appear
        // if it is appeared then Verify its title and date...

        // so we see that we need a LOOP , why? doing same things again and again
        // which loop , while? indefinite iteration number

        System.out.println("Write an email");
        System.out.println("Click to Send Button");
        System.out.println("Navigate to Sent Folder");

        boolean isEmailAppear= false; // my flag!!
        boolean emailCheck= false; // checking email on the table with some automation methods
        while(!isEmailAppear){ // create a loop for cick refresh button and to check email!!

            System.out.println("Click Refresh Button");

            if(emailCheck){
                isEmailAppear=true;
            }
        }

        System.out.println("Verify that sent email appear!");


    }
}
