package days.day18;

public class Triangle {
    public static void main(String[] args) {
        //   *****
        //   *****
        //   *****
        //   *****
        for (int n = 0; n < 4; n++) {// outer loop gives us the rows number
            for (int i = 0; i < 5; i++) {// 0 1 2 3 4 inner loops gives us column number
                System.out.print('*');
            }
            System.out.println();
        }
        //   *
        //   **
        //   ***
        //   ****
        //   *****

        for (int i = 0; i < 5; i++) {
            for (int n = 0; n <= i; n++) {
                System.out.print("*");
            }
            System.out.println();
        }


        for (int i = 0; i < 10; i++) {
            for (int n = 0; n <= i; n++) {
                System.out.print(n);
            }
            System.out.println();
        }
        // *****
        // ****
        // ***
        // **
        // *

        for (int i = 0; i < 5; i++) {
            for (int n = 5; n > i; n--) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 5; i > 0; i--) {
            for (int n = 0; n < i; n++) {
                System.out.print("*");
            }
            System.out.println();
        }

//                 *
//                ***
//               *****
//              *******


//                   *
//                  ***
//                 *****
//                *******
//                 *****
//                  ***
//                   *
    }
}
