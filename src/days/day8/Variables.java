package days.day8;

public class Variables {
    public static void main(String[] args) {
        int a = 10;
        a = a + 10;// 10 + 10
        System.out.println("a = " + a);// 20
        a = a + a;//   20 + 20
        System.out.println("a = " + a);// 40
        int b = a;// 40
        System.out.println("b = " + b);

        int a1 = 5;
        int b1 = 10;
        int c = b1;//   10
        a1 = a1 + 1;// 5 + 1   a1=6
        b1 = b1 - 1;// 10 - 1  b1=9
        c = c + a1;//  10 + 6  c= 16
//        a? b? c?
        System.out.println("a1 = " + a1);
        System.out.println("b1 = " + b1);
        System.out.println("c = " + c);

        int i = 10;
        int n = i % 3;

        System.out.println("n = " + n);

    }
}
