package days.day9;

public class UnaryOperators {
    public static void main(String[] args) {
        int a;
        a = 10;
        System.out.println("a = " + a);
        ++a;// 10 + 1   preincrement
        System.out.println("a = " + a);
        ++a;// 12
        System.out.println("a = " + a);
        a++;// 13 postincrement
        System.out.println("a = " + a);
        a++;// 14
        System.out.println("a = " + a);
        int b = ++a;// increase the value of a will assign it to b
        System.out.println("b = " + b);
        System.out.println("a = " + a);
        b = a++;// b=15   a will be 16
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        a = 10;
        System.out.println(a);// 10
        System.out.println(++a);//  11
        System.out.println(a++);//  11
        System.out.println("a = " + a);// 12


    }
}
