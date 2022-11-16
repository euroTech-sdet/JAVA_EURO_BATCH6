package days.day18;

public class NestedFor {
    public static void main(String[] args) {

//        int startingPoint = 0;
//        int endPoint = 5;
//        int count = 0;
//        for (int i = startingPoint; i < endPoint; i++) {//ascending
////                      0                  5       1   --->5 times
//
//            System.out.println("hello");
//
//            count++;
//        }
//
//        System.out.println("count = " + count);
//        for (int i = 0; i < 4; i++) {
//
//            if (i % 2 == 0) {
//                System.out.printf("this number %d is even muber ", i);
//            }
//        }
//        System.out.println();
        for (int i = 0; i < 3; i++) {// outer loop
            //      0    0<3 ---->true  1
            //           1<3 ----->true

            System.out.println("hello");// hello  hello
            for (int n = 0; n < 2; n++) {// inner loop
                //      0    0<2    1 2
                //           1<2
                //            2<2  --->false
                System.out.println(n);// 0 1

            }// closing curly braces of the inner loop

            System.out.println("we are still in the outer loops body");

        }// closing curly braces of the outer loop

        // hello
        // 0
        // 1
        // we are still in the outer loops body
        // hello
        // 0
        // 1
        // we are still in the outer loops body
        // hello
        // 0
        // 1
        // we are still in the outer loops body

    }
}
