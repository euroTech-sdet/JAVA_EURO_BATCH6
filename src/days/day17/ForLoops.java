package days.day17;

public class ForLoops {
    public static void main(String[] args) {

//        System.out.println("hello");
//        System.out.println("hello");
//        System.out.println("hello");
//        System.out.println("hello");
//        System.out.println("hello");
//        System.out.println(1);


        for (int i = 0; i < 3; i++) {// i=0 i<3---> true
            // 0++ -->i=1  i(1)<3
//                               i(1)++ ---> 2 i(2)<3
            //                   i(2)++ ----> i(3)
            System.out.println("hello");// hello hello hello

        }
        System.out.println("out of the block");
        int n;
        for (n = 0; n <= 3; n++) {
            //          0<=3    1
            //          1<=3    n++--->2
            //          2<=3    n++--->3
            //          3<=3    n++ --->4

            System.out.println("hello again");// hello again  hello again hello again  hello again

        }
        System.out.println("n = " + n);// n ---> 4
        int x;
        int y = 0;
        for (x = 0; x <= 3; x++) {// 1 2 3 4
            System.out.println("hello for loops");
            System.out.println("x = " + x);
            y = x;
        }
        System.out.println("y = " + y);
        System.out.println("x = " + x);

        // hello for loops
        // x = 0
        // hello for loops
        // x = 1
        // hello for loops
        // x = 2
        // hello for loops
        // x = 3


    }
}
