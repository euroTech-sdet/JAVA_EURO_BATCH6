package days.day17;

public class PrintNumbers {
    public static void main(String[] args) {
        // 0-20
        // 10 -20
        for (int i = 0; i <= 3; i++) {

            System.out.println("hello");
            System.out.println("i " + i);// i = 0  i =1 i = 2  i=3

        }
        // even numbers between 0 - 20
        int x = 0;
        for (x = 0; x % 2 == 0 && x <= 20; x++) {
            System.out.println(x);
        }
        System.out.println("x = " + x);


        // even numbers 0-20
        int first = 10;
        int lastNumber = 20;

        for (int i = first; i < lastNumber; i++) {

            //
            if (i % 2 == 0) {//  0%2==0 1%2==0  2%2==0 3%2==0
                System.out.println(i + " is an even number");
            } else {
                System.out.println(i + " is an odd number.");
            }

        }


    }
}
