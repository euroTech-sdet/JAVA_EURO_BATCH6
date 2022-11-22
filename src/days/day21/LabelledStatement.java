package days.day21;

public class LabelledStatement {

    public static void main(String[] args) {

//        outer1:
//        for (int j = 1; j <= 10; j++) { // outer  loop:represent of each timetables 1s 2s 3s ...
//
//            inner1:
//            for (int k = 1; k <= 5; k++) {  // inner loop: represent of each calculation for each timetable
//                if ((j * k) == 10) {
//
//                    break;// this statement will affect only INNER loop!!
//                }
//                System.out.println(j + " X " + k + " = " + (j * k));
//            }
//            System.out.println("|||||||||||||||||||||||||||");
//        }


        System.out.println("Main method!!!");
        testReturn(); // call the method
        System.out.println("End of MAIN METHOD!!");

    }

    public static void testReturn(){
        System.out.println("Inside testReturn");

        if(true){
            System.out.println("I need stop this method, need to return!!");
            return; // like as a break!!
        }
        System.out.println("Last part of method"); // this part will skip!!
    }
}
