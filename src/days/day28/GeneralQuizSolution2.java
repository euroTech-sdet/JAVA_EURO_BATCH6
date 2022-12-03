package days.day28;

public class GeneralQuizSolution2 {
    public static void main(String[] args) {

        int a = 0;
        int i1 = 1;
        int c = a + i1;// 0+1===>1

        for (int i = 0; i < 3; i++) {// i==>1  i==>2   i==>3
            a = i1;//1    1   2
            i1 = c;// 1   2   3
            c = a + i1;// 1+1==>2    1+2===> 3    2+3===>5

        }

        System.out.println("c = " + c);// 5
        System.out.println("a = " + a);// 2
        System.out.println("b = " + i1);// 3

        a = 0;

        while (a < 5) {// 2-->true  4<5 --->true   6<5--->false
            a++;// 1  3  5
            System.out.print(a);// 1  3  5
            a++;// 2  4  6
        }
        System.out.println();
        System.out.println("a = " + a);


        for (int i = 5; i < 10; i++) {// 6 7

            if (i == 7) {
                break;
            }
            System.out.print("*");// *5*6
            System.out.print(i);

        }

        System.out.print("\tafter loop\n");

        int i;
        i = 0;
        for (; i < 5; i++) {
            int b = 20;
            System.out.print(i);

        }
        System.out.print(i);
        prinSthng(i);

        a = 5;
        int b = 8;
        c = 11;
        int average = (int) ((a + b + c) / 3.0);//   int  * +- double====>double

        System.out.println("Average is " + average);


        a = 11;
        b = 6;


        a %= b;// 11%6===>5
        System.out.print(a);// 5
        b -= a;// b-a---> 6-5-->1
        System.out.print(b);//1
        c = a + b;// 5+1--->6
        System.out.print(c);//6


        i = 0;
        outer:
        do {
            i = 8;
            inner:
            while (true) {
                System.out.print(i--);//8 7 6 5
                if (i == 4) {//7 6 5 4
                    break;
                }
            }
            System.out.println("we are in outer loop");
        } while (false);


        int x = 10;
        int y = 15;
        System.out.print(x > y || x == ++y);// false ||   10  == 16--> false  -->false
        System.out.print(x > y || x == ++y);// true
        System.out.print(x < y && x++ == y);// true || false--->false

        System.out.println(" y = " + y);//16
        System.out.println(" x = " + x);//11

        for (i = 0; i < 2; i++) {// 0 1
            for (int j = 2; j >= 0; j--) {// 1 0 -1  2 1
                if (i == j)
                    continue;
                System.out.print(i + " " + j);// 0 20 11 21 0
            }
        }
         b=2;

        boolean bol= -  ++b == - 2 || b++ == --b ^ b++ == 3 ;

        System.out.print(b);
        System.out.print(bol);



    }

    static void prinSthng(int i) {

    }
}
