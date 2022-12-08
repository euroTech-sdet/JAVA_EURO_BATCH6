package days.day29;

public class Recursionss {
    public static void main(String[] args) {
        //recursion


//        print1();
        printNumber(5);
    }


    public static int printNumber(int a) {// 5

        if (a == 0) {
            return 0;
        }

        return a + printNumber(a - 1);
    }

    public static void print1() {

        print2();
        System.out.println("hello");
    }

    public static void print2() {
        print3();
        System.out.println("hello2");
    }

    public static void print3() {

        System.out.println("hello3");
    }

}
