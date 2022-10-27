package days.day7;

public class ImplicitlyCasting {

    public static void main(String[] args) {

        int number = 10; // NO CASTING !!

        double rate = number; // Assign int to double --> this will be handled by JAVA Comp automatically
                              // Implicitly Casting - Widening

        System.out.println("number = " + number);

        System.out.println("rate = " + rate);


        byte hours= 24;  //  no EXPLICITLY casting, because value is between byte values-128 ~ 127

        int intNumber = hours;  // Implicitly Casting - Widening

        intNumber = 24;


///        intNumber = 24.0; // EXPLICITLY !!

//       hours = 130; // need to be EXPLICITLY casting why? because value is out of byte values!!

        short sValue= 10000; // short <- int but no need casting why? because 10000 is inside of short range!!

//        sValue = 40000; // value is outside of short range so need to EXPLICITLY CASTING!!!!


        /////////////////////////////////


       int numInt= 1;

       byte numByte = 127;

       double numDouble = 10.1;

       numDouble = numInt; //11111

        System.out.println("numDouble = " + numDouble);  // 11111.0 // Implicitly Casting - Widening

        numDouble = numByte;  // Implicitly Casting - Widening

        numByte = 1; //
        //  numByte = numInt; // we are not looking value in first place, just compare data type !!


        // Practice

        int num2 = 123; // no casting

        byte bnum2= 121; // 121 is inside byte range so no need extra casting

//        byte num2 = num2; //  need casting

        long lNumber1 = 1234; // imp casting

        long lNumber2= 4000300020001000L; // no casting

//        int num3 = lNumber1; need exp casting
//        int num3 = lNumber2; need exp casting













    }
}
