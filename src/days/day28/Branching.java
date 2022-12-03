package days.day28;

public class Branching {
    public static void main(String[] args) {
        //  break continue return

        for (int i = 0; i < 4; i++) { // 0 1 2 3
            System.out.println("i = " + i);// 0 1 2 3
        }
        System.out.println("out of the for loop");
        System.out.println("-------------------------------------------");
        for (int i = 0; i < 4; i++) { // 0 1 2 3
            if (i == 2) {// 1 ==2 2==2
                break;
            }
            System.out.println("i = " + i);// 0 1 2 3
            //    break ------------------>   0 1
        }
        System.out.println("out of the for loop");
        System.out.println("-------------------------------------------");
        for (int i = 0; i < 4; i++) { // 1 2 3 4
            if (i == 2) {//0 1 2 3
                continue;
            }
            System.out.println("i = " + i);// 0 1 3
        }
        System.out.println("out of the for loop");
        System.out.println("-------------------------------------------");
        for (int i = 0; i < 4; i++) { //1 2 3 4
            if (i == 2 || i == 0) {//0 1 2
                continue;
            }
            System.out.println("i = " + i);//1 3
        }
        System.out.println("out of the for loop");
        System.out.println("-------------------------------------------");


        for (int i = 0; i < 2; i++) {//while i is 0 and i is 1 for block will be executed
            System.out.print(i);// 0  1
            for (int n = 0; n < 3; n++) {//
                System.out.print(" " + n);// 0 1 2  0 1 2
            }

            System.out.println();
        }
        System.out.println("-------------------------------------------");

        row:// label name of the outer loop is row
        for (int i = 0; i < 2; i++) {//while i is 0 and i is 1 for block will be executed
            System.out.print(i);// 0 1
            inner:
            for (int n = 0; n < 3; n++) {//
                if(n==1){
                    break;// will terminate execution of the inner loop
                }
                System.out.print(" " + n);// 0  0
                //                     0 0
                //                     1 0
            }

            System.out.println();
        }// end of the outer loop
        System.out.println("-------------------------------------------");


        row:// label name of the outer loop is row
        for (int i = 0; i < 2; i++) {//while i is 0 and i is 1 for block will be executed
            System.out.print(i);// 0 1
            inner:
            for (int n = 0; n < 3; n++) {//
                if(i==1){
                    break row;// will terminate execution of the outer(row) loop
                }
                System.out.print(" " + n);// 0 1 2

                //   0 0 1 2
                //   1
            }

            System.out.println();
        }// end of the outer loop
        System.out.println("\n out of the all loops");
    }
}
