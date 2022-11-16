package days.day18;

public class Nested1 {
    public static void main(String[] args) {

        for (int i = 0; i < 2; i++) {
//                      0<2
            System.out.println("outer loop body");
            for (int n = 0; n < 3; n++) {// 0 1 2
                System.out.println("inner");
            }

        }
        // outer loop body
        // inner
        // inner
        // inner
        //outer loop body
        // inner
        //inner
        //inner

        for (int i = 0; i < 2; i++) {
            System.out.println(1);

            for (int n = 0; n < 3; n++) {
                System.out.print(2);
            }
            System.out.println();
            System.out.println(3);
        }
        // 1                      1
        // 2                      222
        //2                        3
        // 2                       1
        // 3                      222
        // 1                       3
        // 2
        // 2
        // 2
        // 3


    }
}
