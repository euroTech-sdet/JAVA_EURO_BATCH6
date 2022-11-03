package days.day9;

public class UnaryDecrement {
    public static void main(String[] args) {
        int a = 10;
        --a;// predecrement
        System.out.println("a = " + a);//9
        a--;// postdecrement
        System.out.println("a = " + a);//8
        int b = a;
        System.out.println("b = " + b);
        a = --b;// b and a 7
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        a = b--;// before assignment a is 7 b is 7 after assignment  a still 7 but b is 6
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        a = 10;
        System.out.println(--a);// 9
        System.out.println("a-- = " + a--);// 9
        System.out.println("a = " + a);//8


    }
}
