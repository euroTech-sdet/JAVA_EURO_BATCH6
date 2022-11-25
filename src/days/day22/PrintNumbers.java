package days.day22;

public class PrintNumbers {

    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//
//        }
        sumOfTheNumbers0To50();
        printNumbers0to10();

        // sum of the 0 -50
        //sumOfTheNumbers0to50
    }

    public static void sumOfTheNumbers0To50() {
        int sum = 0;
        for (int i = 0; i < 50; i++) {
            sum += i;//   sum = sum + i
        }
        System.out.println("sum = " + sum);
    }

    public static void printNumbers0to10() {
        //  sum=0; can not reach it
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }


}
