package days.day25;

public class Promotion {
    public static void main(String[] args) {
        short s = 15;
        double d = 10;
        byte b = 10;
        int a = b;
        double d1 = 45.5555;
        int number = (int) d1;
        print(a);// int
        print(b);// byte
        print(s);// short
        char character = 'A';
        print((int) d1);
        print(character);
//        print(true); will not accept
//        print("Tarik"); will give error
        // byte short int long float double
        // char
    }

    static int print(double d) {
        System.out.println("d = " + d);
        return (int) d;
    }

    static void print(int a) {
        System.out.println("a = " + a);
    }

    static void print(long l) {
        System.out.println("l = " + l);
    }

//    static int myMethod(int a, int b, float f) {
//        System.out.println("l = " + f);
//        return 2;
//    }

    static void myMethod(int ab, int ba, float f1) {
        System.out.println("l = " + f1);
    }


}
