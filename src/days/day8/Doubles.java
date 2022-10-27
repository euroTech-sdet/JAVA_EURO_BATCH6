package days.day8;

public class Doubles {
    public static void main(String[] args) {
        //  float  double
        float f = 500.89f;
        double d = 12.123456789;
        f = 9.123456789F;
        System.out.println("f = " + f);
        d = 9.1234567890123456789;
        System.out.println("d = " + d);

        char c = 'A';
        c = 'c';
        c = 'B';
        System.out.println("c = " + c);

        boolean b = true;
        b = false;
        System.out.println("b = " + b);

        // naming idenfiers cant use special characters except _ $
        // can use number but not as a first character
        // cant use reserved keywords
        int number = 100;
        final int FINAL_NUMBER = 500;



    }
}
