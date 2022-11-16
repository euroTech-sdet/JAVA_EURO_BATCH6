package days.day17;

public class SumOfTheNumbers {
    public static void main(String[] args) {
        // sum of the numbers 0-50
        // 0 - 5   0 1
        //          1 2
        //          3  3
        //         6 + 4
        //        10 + 5
        int sum = 0;
        sum = sum + 0;// 5 + 5
        System.out.println("sum = " + sum);
        for (int i = 0; i < 50; i++) {
            System.out.println("i = " + i);// 0  1 2 3 4 5
            sum = sum + i;
            //   = 0 + 0--->sum is 0
            //     0 + 1--->sum is 1
            //     1 + 2---->sum is 3
            //     3 + 3 ----->sum is 6
            //     6 + 4 ------> sum is 10
            //     10 + 5 -----> sum is 15
            System.out.println("sum = " + sum);
        }
        System.out.println("out of the block");


    }
}
