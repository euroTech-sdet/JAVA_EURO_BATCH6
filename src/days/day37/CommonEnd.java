package days.day37;

public class CommonEnd {

    //    Given 2 arrays of ints, a and b, return true if they have the same first element or
//    they have the same last element. Both arrays will be length 1 or more.
//
//
//    commonEnd([1, 2, 3], [7, 3]) → true
//    commonEnd([1, 2, 3], [7, 3, 2]) → false
//    commonEnd([1, 2, 3], [1, 3]) → true
    public static void main(String[] args) {
        int[] a = {5, 2, 3};
        int[] b = {7, 3, 8};
        if (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        // sum of all the elements
        int sum1 = a[0] + a[1] + a[2];
        int sum2 = b[0] + b[1] + b[2];
        System.out.println("sum1 = " + sum1);
        System.out.println("sum2 = " + sum2);
        sum1 = 0;
        for (int n : a) {
            System.out.println("n = " + n);
            sum1 = sum1 + n;
            //      0   + 5
            //      5     2
            //      7     3
        }
        System.out.println("sum1 = " + sum1);//10
        sum2 = 0;
        for (int i = 0; i < b.length; i++) {
            sum2 = sum2 + b[i];
        }
        System.out.println("sum2 = " + sum2);


    }
}
