package days.day18;

public class Nested3 {
    public static void main(String[] args) {
        // outer loop 2
        // inner loop 2 times
        // city name
        for (int i = 0; i < 2; i++) {

            for (int n = 0; n < 2; n++) {

                System.out.print("oslo");

            }
            System.out.println();
        }
        // oslooslo
        // oslooslo
        //oslo
        //oslo
        //oslo
        //oslo


        for (int i = 0; i < 2; i++) {

            for (int n = 0; n < 5; n++) {// 0 1 2 3 4

                System.out.println(i);

            }
            System.out.println();
        }
        //0           0
//        1           0
//        2           0
//        3           0
//        4           0

        //0          1
//        1          1
//        2          1
//        3          1
//        4          1

        for (int i = 0; i < 5; i++) {

            for (int n = 0; n < 5; n++) {// 0 1 2 3 4

                System.out.print(i);

            }
            System.out.println();
        }
        // 01234            00000
        // 01234            11111


    }
}
