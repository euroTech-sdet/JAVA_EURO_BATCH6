package days.day6;

public class Precedence {
    public static void main(String[] args) {
        int calculation = 18 + 9 / 3;
        //                18 +  3
        //                   21

        System.out.println(10 + 21 / 3 * 7 % 2 - 3);
        //                 10 +   7   * 7 % 2 - 3
//                          10  +  49     % 2 -3
//                          10  +   1     - 3
//                              11     -  3
//                                  8
        int result5 = 10 + 20 / 5 * 3 + (9 - 6);
        //           10  +    4   * 3+      3
//                   10 +     12 +  3
//                        25
        System.out.println("result5 = " + result5);

    }
}
