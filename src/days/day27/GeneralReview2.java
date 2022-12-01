package days.day27;

public class GeneralReview2 {


    public static void main(String[] args) {

        ifElseif();
        int month1 = 3, year1 = 19;  //  -> 19
        int month2 = 11, year2 = 19; //  -> 69
        int month3 = 2, year3 = 20;  //  -> 69
        System.out.println("ageIdentifier(month1,year1) = " + ageIdentifier(month1, year1));
        System.out.println("ageIdentifier(month2,year2) = " + ageIdentifier(month2, year2));
        System.out.println("ageIdentifier(month3,year3) = " + ageIdentifier(month3, year3));

        int year = ageIdentifier(11, 19);
        System.out.println("year = " + year);
        System.out.println("////////////////////////////////////////\n");
        switchCase();
        System.out.println("////////////////////////////////////////\n");
        printCalendar(3,7);
        System.out.println("\n////////////////////////////////////////\n");
        printPrimeNumbers(10);
    }


    public static void ifElseif() {

        int number = 10;

        if (number > 3) {
            System.out.println("Number is grater than 3!! ");
        }

        if (number == 3) {
            System.out.println("Number is equal 3!! ");
        }

        if (number < 3) {
            System.out.println("Number is less than 3!! ");
        }

        //////////////////////

        if (number > 3) {
            System.out.println("Number is grater than 3!! ");
        } else if (number == 3) {
            System.out.println("Number is equal 3!! ");
        } else {
            System.out.println("Number is less than 3!! ");
        }
    }

    public static int ageIdentifier(int month, int year) {
        // dd/mm/YY
//            30/03/19  ->   19
//            30/11/19  ->   19+50 = 69
//            30/02/20  ->   20+50-1 = 69
//            30/03/2020  ->   20

        // 1 ---- 12  NORMAL CALENDER YEAR ..
        // 3 ---- 2  PLATE YEAR ..


        //Age identifiers are the last two digits of the year between March and August, or the last two digits plus
//    50 if between September and February (registration years can be thought of starting in March). So,
//    for  March 2018, it is “18” and for the 27th of February 2019, it is “68” (not “69”).

//     opt-1    3-8  ->   19
//     opt-2    9-12 ->  19+50 =69
//     opt-3    1-2  ->  20+50 -1 =69

        int ageIdent;

        if (month < 3) {  // opt 3 (1.-2.)
            ageIdent = year + 49;
        } else if (month < 9) {  // opt 1 (3. - 8.)
            ageIdent = year;
        } else {  // opt 2 (9.- 12.)
            ageIdent = year + 50;
        }

        return ageIdent;
    }


    public static void nestedIf() {

        boolean appCredentials = true; // cre for login app

        boolean authCredentials = false; // cre for system settings , this is inside app

//        if(appCredentials){
//            System.out.println(" Test main app...");
//        }
//        if(authCredentials){
//            System.out.println("Update sys params...");
//        }

//        if(appCredentials && authCredentials){
//            System.out.println(" Test main app...");
//            System.out.println("Update sys params...");
//        }

        if (appCredentials) {
            System.out.println(" Test main app...");
            if (authCredentials) { // NESTED IF!!
                System.out.println("Update sys params...");
            } else {
                System.out.println("Request permission from sys admin");
            }
        } else {
            System.out.println("Re enter app credentials");
        }


        ///////////////
        boolean mfaToken = true;
        if (appCredentials && mfaToken) {
            System.out.println("login AWS clouding services");
        }

    }


    public static void switchCase() {


        int day = 1;
        String dayType;

//        switch (day){
//            case 5:
//            case 2:
//            case 1:
//            case 4:
//            case 3:
//                dayType= "Weekdays";
//                break;
//            case 6:
//            case 7:
//                dayType= "Weekend";
//                break;
//            default:
//                dayType= "Invalid";
//        }

        dayType = "Weekdays";
        switch (day) {
            case 6:
            case 7:
                dayType = "Weekend";
                break;
//            default:
//                dayType= "Invalid";
        }

        int num = 1;
        if (num == 1) {
            System.out.println("1");
        } else if (++num > 1) {
            System.out.println("2");
        } else {
            System.out.println("3");
        }

        System.out.println("num = " + num);
    }


    public static void ternaryOpt() {

        int temp;
        String section = "right";

        if (section == "right") {
            temp = 4;
        } else {
            temp = -10;
        }

        temp = (section == "right") ? 4 : -10;

    }


    public static void forLoop() {
        int numberOfAccount = 6;

        int numberOfTrans;

        for (int i = 0; i < numberOfAccount; i++) {  // OUTER LOOP -> Checking/Navigating each account 1 by 1
            // type code to navigate next account
            numberOfTrans = 3;
            for (int j = 0; j < numberOfTrans; j++) {   /// INNER LOOP
                // run some verification!!!
            }
        }



    }


    public static void printCalendar(int week,  int day){
//        week 1
//            day 1
//            day 2
//                ...
//            day 7
//        week 2
//            day 1
//            day 2
//                ...
//            day 7
//        week 3
//            day 1
//            day 2
//                ...
//            day 7

        for (int i = 1; i <= week; i++) { // OUTER loop!! print each week number
            System.out.println("week " + i );

            for (int j = 1; j <=day; j++) { // INNER loop!! print each day inside related weeks!!
                System.out.println("\t day "+ j);
            }
        }

    }


    public static void printPrimeNumbers(int limit){
//   Print prime numbers till given quantity...
//   I would like to print first "50" prime number
//   hint min prime number is 2
//
//11 ---. .?????   --> OUTER LOOP  --> indefinite --> while!!! STOP con-> count prime check == < to limit!!
//
//                for(2-> number-1) --> INNER->
//                11%2 ==0
//                11%3 == 0
//                        11%4  ...
//                                11 %10



        // Extra q1 : What if I need print only prime numbers after 11
        // Extra q2 : WHat if I dont want to print and count some specific prime numbers (11 , 23 ,31)

     int totalPrimeNumber=0;
     int number= 2;
     boolean isPrime;

     while(totalPrimeNumber < limit){ // OUTER LOOP  -- check all number 1 by 1

         isPrime=true; // let's assume that number is prime // reset is prime value!!
         for (int i=2 ; i<=number/2; i++){  // INNER  check the number is prime?
             if(number%i == 0){
                isPrime = false;
                break; // don't need to go on , because it is already divided i, no need to check others
             }
         }

         if(isPrime){
             totalPrimeNumber++;
             System.out.println("Number " + number + " is a prime number!");
         }

         number++;
     }

    }


}
