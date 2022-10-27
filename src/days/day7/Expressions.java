package days.day7;

public class Expressions {


    public static void main(String[] args) {


        short num1 = 10;
        short num2 = 20;

//        short num3 =  num1 + num2 ; will return ERROR!! why? short data type auto turn to int during ari. exp

        short num3 = (short) (num1 + num2) ;


        ////////////////////////////

        long numLong = 20; //imp casting
        float numF= 10f;

        float result1 = numLong + numF;
//        float result = 20f + 10f;

        System.out.println(result1);


        numF = 10.1f;
        double numD = 20.1;

        double  result2 = numF + numD;
        //double  result2 = 10.1 + 20.1;

        ////////////////

        numF = 10.1f;
        numD = 20.1;
        char chr= 'a'; // 97
        short numShort= 5;
        byte numByte = 1;
        int numInt= 97;

        double result3=  (numF + numByte) + (numInt / chr) - (numD + numShort);

        System.out.println("result3 = " + result3);






    }


}
