package days.day7;

public class ExplicitlyCasting {

    public static void main(String[] args) {


        double dValue = 10; // imp casting
        System.out.println("dValue = " + dValue); // 10.0

        int iValue = (int)dValue;  // iValue = 10;   (int) CAST OPERATOR!!
        System.out.println("iValue = " + iValue);   //We handle exp casting and there was NO data lost!!


        dValue = 11.3;

        iValue = (int) dValue;
        System.out.println("iValue = " + iValue);   //We handle exp casting and there was data lost!!


        dValue = -11.999;

        iValue = (int) dValue;   //We handle exp casting and there was data lost!!
        System.out.println("iValue = " + iValue);  // 11 !!!!!


        ////////////////////////////////////////

        iValue = 127;

        byte bValue = (byte)iValue;

        System.out.println("bValue = " + bValue); //127

        iValue = 129;  //(129 - 127= 2)

        bValue = (byte)iValue;

        short sValue = (byte)iValue;

        System.out.println("bValue = " + bValue); // -128 ---- 127

        System.out.println("shortValue = " + sValue);


        ////////////////////////

        dValue = 10.1;

//        iValue = (int) dValue + 10.1;
//        iValue = 10 + 10.1;
//        iValue = 20.1;

        iValue = (int) (dValue + 10.9);
        iValue = (int) dValue + (int)10.1;

        iValue = (byte) dValue;  // int = byte imp casting   int >=  .... -> int short byte
        System.out.println("iValue = " + iValue);


    }
}
