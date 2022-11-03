package days.day10;

public class UnaryOperators {
    public static void main(String[] args) {
        int a = 40;
        ++a;// preincrement
        System.out.println("a = " + a);//41
        a++;// postincrement
        System.out.println("a = " + a);// 42
        --a;// predecrement
        System.out.println("a = " + a);// 41
        a--;// postdecrement
        System.out.println("a = " + a);//40

        int b = a;// b = 40
        System.out.println("b = " + b);
        int c = --a;// c a values will be 39
        System.out.println("c = " + c);
        System.out.println("a = " + a);
        a = 40;
        int d = a--;// decrement will not effect the value of d so value will be 40
        System.out.println("d = " + d);
        System.out.println("a = " + a);
        a = 10;
        int number = a++ + a + a++;
//                   10  + 11 + 11
        System.out.println("number = " + number);
        System.out.println("a = " + a);// 12
//        a-- + ++b + a-- + --a * b;


    }
}
