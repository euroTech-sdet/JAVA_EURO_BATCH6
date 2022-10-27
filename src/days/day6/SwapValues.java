package days.day6;

public class SwapValues {
    public static void main(String[] args) {
        int a = 10;
        a = a + 20;
//     container = 10 + 20
        System.out.println("a = " + a);// 30
// by using any operator swap the values of both variables
        a = 20;
        int b = 30;

        // operators  operation
        a = 30;
        b = 20;
        // a=20   b=30
        int c = a + b;// 50
        a = c - a;// 50-30
        b = c - b;//  50 -20
        // swap the values without creating another variable
        System.out.println("a = 21 " + a);
        System.out.println("b = " + b);
        a = a + b - a;//
        b = b + a - b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        a = 30;
        b = 20;
        a = a + b;// a is 50
        b = a - b;// 50 - 20 --> 30
        a = a - b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
