package days.day9;

public class Unary2 {
    public static void main(String[] args) {
        int b = 20;
        System.out.println("++b = " + ++b);// 21
        System.out.println("b++ = " + b++);// 21
        System.out.println("b = " + b);// 22
        int a = ++b;// will increase the value of b and store as 23
        System.out.println("a = " + a);
        System.out.println("b = " + b);// b is 23
        int c = b++;//
        System.out.println("c = " + c);// 23
        System.out.println("b = " + b);// 24
        b++;// post increment
        System.out.println("b = "+b);//25
        ++b;
        System.out.println("b = " + b);// 26


    }
}
