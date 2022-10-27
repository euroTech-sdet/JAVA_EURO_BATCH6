package days.day8;

public class PromotionRules {
    public static void main(String[] args) {
        // for all the operators  (+ - * / )
        int i = 10;
        double f = 10.105;
        System.out.println(i + f);// int + double -----> double
        // double keeps 64 bit in the memory int keeps 32 so the result type is double
        double v = i + f;
        System.out.println("v = " + v);
        // for byte short int all the time result type is integer
        byte b = 10;
        short s = 20;
        int i1 = b * s;
        System.out.println("b*s = " + b * s);
        // if both operand have the same types result will be same type
        int a = 25;
        int a2 = 30;
        int i2 = a + a2;// int + int ----> int
        System.out.println("a+a2 = " + a + a2);
        float f1 = 123456.123456f;
        float f2 = 23456.23456f;
        float v1 = f1 + f2;//  float + float -----> float
        // integers(byte short int long) + double-float -----> double(float double)
        byte b2 = 99;
        float f6 = 123456.123456f;
        float v2 = b2 + f6;
        int i6 = 456;
        double d5 = 130.1223456;
        double v3 = i6 + d5;// int + double -----> double
        System.out.println("v3 = " + v3);

        float no = 123.123f;
        long l5 = 123456789;
        float v4 = l5 + no;// long + float -----> float
        System.out.println("v4 = " + v4);


    }
}
