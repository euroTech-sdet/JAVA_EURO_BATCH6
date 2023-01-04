package days.day40;

import java.sql.Date;
import java.util.Collections;

public class WrapperPractice {

    public static void main(String[] args) {
//        int intPrimitive;
//        Integer intObj;
//        String str;
//        WrapperPractice obj;
//
//        System.out.println("intPrimitive = " + intPrimitive);
//        System.out.println("intObj = " + intObj);
//        System.out.println("str = " + str);
//        System.out.println("obj = " + obj);

        System.out.println("\n//////////////Integer///////////////\n");

        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Integer.max(123,12) = " + Integer.max(123, 12));
        System.out.println("Integer.sum(1,222) = " + Integer.sum(1, 222));
        System.out.println("Integer.reverse(123) = " + Integer.reverse(123));




        int intPrimitive = 1;
        Integer intObj = new Integer(1);
        System.out.println("intObj = " + intObj);

                intObj = new Integer("1");
        System.out.println("intObj = " + intObj);

                intObj = Integer.valueOf(1);
        System.out.println("intObj = " + intObj);

                intObj = Integer.valueOf("1");
        System.out.println("intObj = " + intObj);

                intObj = intPrimitive;
        System.out.println("intObj = " + intObj);

                intObj = 1;
        System.out.println("intObj = " + intObj);


        System.out.println("\n//////////////////////////////\n");


//        intObj = Integer.valueOf("a");   --> throws NumberFormatException !!!
//        System.out.println("intObj = " + intObj);

        intObj = Integer.valueOf("1234567890");
        System.out.println("intObj = " + intObj);


//        intObj = Integer.valueOf("1234567890123");  --> throws NumberFormatException !!!  why? out of int range
//        System.out.println("intObj = " + intObj);

//        intObj = Integer.valueOf("0.1");   --> throws NumberFormatException !!!
//        System.out.println("intObj = " + intObj);


        System.out.println("\n//////////////Boolean///////////////\n");

        String uiResult= "True";
        Boolean booleanObj= true;
        System.out.println("booleanObj = " + booleanObj);
                booleanObj= Boolean.valueOf("true");
        System.out.println("booleanObj = " + booleanObj);
                booleanObj= Boolean.valueOf("TRUE");
        System.out.println("booleanObj = " + booleanObj);
                booleanObj= Boolean.valueOf(uiResult);
        System.out.println("booleanObj = " + booleanObj);

//        boolean = Boolean.valueOf(uiResult);  value of methods returns OBJECT so we can not store object in primitive data types!!!

        System.out.println("\n//////////////////////////////\n");

        char charPrimitive= 'A';

         charPrimitive = 65;
        System.out.println("charPrimitive = " + charPrimitive);
        Character charObj = Character.valueOf('B');
//                  charObj = Character.valueOf(66);
        System.out.println("charObj = " + charObj);
                  charObj = 'C';
        System.out.println("charObj = " + charObj);

//      charObj = Character.valueOf("B"); why because there is no valueOf method with String param

        System.out.println("\n////////////////byte//////////////\n");

        byte bytePrimitive = 127;

//        Byte byteObj = Byte.valueOf(127); throws compile time error!! because 127 is int as parameter
        Byte byteObj = Byte.valueOf((byte)127);
             byteObj = (byte)127;
        System.out.println("byteObj = " + byteObj);
             byteObj = 127;
        System.out.println("byteObj = " + byteObj);


        System.out.println("\n//////////////short////////////////\n");

        short shortPrimitive= (short) 112221;
        System.out.println("shortPrimitive = " + shortPrimitive);
        Short shortObj = Short.valueOf((short)111);
              shortObj = 111;
              shortObj = (short)112221;
        System.out.println("shortObj = " + shortObj);


        System.out.println("\n//////////////long////////////////\n");

        long longPrimitive= 12345678901L;

        Long longObj = Long.valueOf(12345678901L);
             longObj = 12345678901L;
        System.out.println("longObj = " + longObj);


        System.out.println("\n//////////////Float////////////////\n");

        Float floatObj = Float.valueOf("2.03");
        System.out.println("floatObj = " + floatObj);
              floatObj = 2.04f;
        System.out.println("floatObj = " + floatObj);


        System.out.println("\n//////////////Double////////////////\n");
        
        Double doubleObj = Double.valueOf("2.1");
        System.out.println("doubleObj = " + doubleObj);
        doubleObj = 2.1;
        System.out.println("doubleObj = " + doubleObj);





    }

}
