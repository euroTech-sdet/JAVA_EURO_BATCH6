package days.day25;

public class Print {
    public static void main(String[] args) {
        // print()
        // print(5)  int
        // print("Ronaldo") String
        // print("Ronaldo",37)  String int
        // print("Ronaldo","Messi") String String
        // print(10,20) int int
        //print(20.35) double
        print();
        print(10);
        print(10.5);
        print("Hello");
        print("Hello"," Java");

    }

    static void print() {
        System.out.println("Without parameter");
    }

    static String print(int a) {
        System.out.println(a);
        return "";
    }

    static String print(String a) {
        System.out.println(a);
        return "";
    }

    static String print(String str, int a) {
        System.out.println(a);
        System.out.println("str = " + str);
        return "";
    }

    static String print(int a, String str) {
        System.out.println(a);
        System.out.println("str = " + str);
        return "";
    }

    static String print(int a, int b) {
        System.out.println(a);
        return "";
    }

    static String print(double a) {
        System.out.println(a);
        return "";
    }

    static String print(String str, String a) {
        System.out.println(a);
        System.out.println("str = " + str);
        return "";
    }


}
