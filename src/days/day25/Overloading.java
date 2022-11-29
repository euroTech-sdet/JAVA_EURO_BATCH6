package days.day25;

public class Overloading {
    public static void main(String[] args) {
        add(10, 20);
        add(10.5, 20.5);
        add(10, 20, 30);
        add(10.5, 20);
        add(50, 70);
    }

    public static void add(String str, int a) {//order of the parameters

    }

    public static void add(int a, String str) {

    }

//    static int add(int a, String str) { return value type is not important for overloading
//
//        return 5;
//    }

    public static void add(int a) {// number of parameters
        System.out.println(a);
    }

    public static void add(int a, int b, int c) {
        System.out.println("a+b+c = " + (a + b + c));
    }

    public static void add(int a, int b) {
        System.out.println("a+b = " + (a + b));
    }

    public static void add(double a, int b) {
        System.out.println("a+b = " + (a + b));
    }

    public static void add(double a, double b) {// data types
        System.out.println(" a+ b" + (a + b));
    }


}
