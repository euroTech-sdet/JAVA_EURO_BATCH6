package days.day8;

public class DataTypes {
    public static void main(String[] args) {

        System.out.println("java");
        System.out.print("java1 ");
        System.out.print("next line");
        System.out.println(" last line");
        // if you want to store integer you can use byte short int long
        // decimal numbers     float  double
        //     boolean     char

        // data type   identifer(name)------>declaration
        int number1 = 200;
        int number;
        number = 100;
        int no, no1 = 50, no2;
        number1 = 500;
        byte b = 127;  // 8 bit 2^8   2 * 2 *2 * 2* 2* 2 *2 *2----> 256  half of that is for negative numbers half of it fpr positive numbers
        //  128 for negative for 0 127 for positive
        short s = 130;//   2^16  ------>
        System.out.println("Byte.MAX_VALUE = " + Byte.MAX_VALUE);
        System.out.println("Short.MAX_VALUE = " + Short.MAX_VALUE);
        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Long.MAX_VALUE = " + Long.MAX_VALUE);
        long l = 123_45678_9123_456L;
        System.out.println("l = " + l);
        double i = 2e3;// 2 10^3------->2000.0
        System.out.println("i = " + i);
        double d = 5E2;//  5*     10*10----->500.0
        System.out.println("d = " + d);
        final int a = 100;// reassign not possible for the final variables




    }


}

class Second {
    public static void main(String[] args) {

        System.out.println("second one");
    }

}
