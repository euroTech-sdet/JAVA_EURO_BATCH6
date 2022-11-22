package days.day20;

public class ReviewWeek5 {

    public static void main(String[] args) {

  //      int i;

//       itar

//        for (i =0; i < 10; i++) {
//            System.out.println("i = " + i);
//        }
//
//        System.out.println("AFTER LOOP i = " + i);  //9 10?
//
//
        //


//        *
//        *
//        *
//        *
        // print * for "given" times
//        int givenValue=5;
//        for (int j = 0; j < 15; j++) {
//            System.out.println("*");
//        }
 //                     i        j (star value)
//        *             1        1
//        **            2        2
//        ***           3        3
//        ****          4        4
//        *****         5        5
//                               i
//int lineNum= 5;
//        for (int i = 1; i <=lineNum ; i++) {  // OUTER-> will print each ROW!!
////
//            for (int j = 1; j <= i ; j++) { //INNER-> will print stars as Column for each row
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }

//                      0       -1
        //              i        j (star value)
//        *             1        1
//        ***           2        3
//        *****         3        5
//        *******       4        7
//        *********     5        9
//                                          ai + b
//                                          a-> changing value of j
//                                          b-> line 0 value of j  -> i(1) - a
//                                          ai + b  = 2*i + (-1)

//lineNum=11;
//        for (int i = 1; i <=lineNum ; i++) {  // OUTER-> will print each ROW!!
//
//            for (int j = 1; j <= 2*i-1 ; j++) { //INNER-> will print stars as Column for each row
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }



        //              0        9
        //              i        j (star value)
//        *********     1        9
//        *******       2        7
//        *****         3        5
//        ***           4        3
//        *             5        1
//
//                                          ai + b
//                                          a-> changing value of j
//                                          b-> line 0 value of j  -> i(1) - a = 7 - (-2)= 9
//                                          ai + b  = -2*i + 9

//       int  lineNum=3;
//        for (int i = 1; i <=lineNum ; i++) {  // OUTER-> will print each ROW!!
//
//            for (int j = 1; j <= ((-2*i) + 9) ; j++) { //INNER-> will print stars as Column for each row
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }


//                      i        j (/ value)     K (star)   J \ value
//       ///*\\\        1        3                   1       3
//       //**\\         2        2                   2       2
//       /***\          3        1                   3       1
//       ****           4        0                   4       0
//                             -1*i+4                i
        int  lineNum=4;
        for (int i = 1; i <=4 ; i++) {  // OUTER-> will print each ROW!!

            for(int j=1; j<=(4-i);j++){
                System.out.print("/");
            }

            for (int k = 1; k <= i ; k++) { //INNER-> will print stars as Column for each row
                System.out.print("*");
            }

            for(int j=1; j<=(4-i);j++){
                System.out.print("\\");
            }



            System.out.println();

        }





    }
}
