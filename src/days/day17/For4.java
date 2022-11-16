package days.day17;

public class For4 {
    public static void main(String[] args) {

        //  0 - 10
        //  5 - 0
        for (int i = 5; i > 0; i--) {
            System.out.println("hello");
            System.out.println("i = " + i);
        }
//        int x = x + 5; // x+=5    x++ ----> x=x+1
        int i;
        for (i = 0; i < 30; i += 5) {// 5  10  25  30

            System.out.println("i = " + i);// i = 0  i = 5  10  15 20  25

        }
        System.out.println(" out of the block");
        System.out.println("i = " + i);


        for (i = 0; i < 5; ++i) {

            System.out.println(i);

        }
        System.out.println("i = " + i);

        int x;
        int n;

        for (n = 0; n < 5; n++) {

        }
        x = n;// x = 5;

        System.out.println("x = " + x);
    }
}
