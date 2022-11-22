package days.day21;

public class ContinueStatement {

    public static void main(String[] args) {

        int number;
        // don't want to use 13 in my calculations...   9 10 11 12 14 15 16
//        for (number = 1; number < 50; number++) {
//            System.out.println(number);
//
//            if (number != 13) {
//                System.out.println(number);
//            }
//            System.out.println(number);
//
//        }


        for (number = 1; number < 15; number++) {

            if (number == 13) {
                continue;
            }
            System.out.println(number);

        }


        int i = 1, sum = 0;

//        for (i = 1; i < 5; i++) {
//            if (i % 3 == 0) {
//                continue;
//            }
//            sum += i;
//
//        }
// Solution-1
        i = 0;
        while (++i < 5) {
            if (i % 3 == 0) {
                continue;
            }
            sum += i;

        }

        // Solution-2
//i = 0 , 1 ,2 ,3 ,4
//        i=0;
//        while (i < 5) {
//            if (i % 3 == 0) {
//                i++;
//                continue;
//            }
//            sum += i;
//            i++;
//
//        }


        // Print all timetable

        //  1 X 1 = 1   2 X 1 = 1
        //  1 X 2 = 2   2 X 2 = 4
        //  1 X 3 = 3   2 X 3 = 6
        //
        //  1 X 5 = 5 2 X 5 = 10



        for(int j=1; j<=10; j++){ // outer  loop:represent of each timetables 1s 2s 3s ...

            for (int k = 1; k <= 5; k++) {  // inner loop: represent of each calculation for each timetable
                if((j*k)==10){

                    continue;// this statement will affect only INNER loop!!
                }
                System.out.println(j +" X " + k + " = " + (j*k));
            }
            System.out.println("|||||||||||||||||||||||||||");

         //   continue;
//            System.out.println("sdasd");
        }







    }

}
