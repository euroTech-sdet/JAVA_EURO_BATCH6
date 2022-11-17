package days.day19;

public class WhileLoop {


    public static void main(String[] args) {


//        for (int count=0 ; count < 100 ; count++){
//            System.out.println("Welcome to the Java Paradise");
//        }

        int count = 0;
//        while (count<100){
//            System.out.println("Welcome to the Java Paradise");
//            count++;
//        }

//
//        byte count=0;
//        while (count>-1){
//            System.out.println("Welcome to the Java Paradise");
//            count++;
//        }


        while (count < 10) {
//            count++; if u first inc/dec then be careful to use variable!!
            System.out.println(count);
            count++;
        }


        byte x = 1;

        while (x > 0) {
            x++; //127
        }

        System.out.println("x = " + x);  //-128


        ////////////////////////
        //EX-1
        //Let’s write a code via while loop, to calculates the sum of the EVEN numbers between [0 and 100) (exc)

        int sum = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) sum += i;
        }
        System.out.println(sum);

        /////
        int number = 0;
//        while (number<100){
//            if(number%2 == 0){
//                sum+=number;
//            }
//            number++;
//        }

        while (number < 100) {
            sum += number;
            number += 2; // 0 2 4 6 8 10 12
        }


        System.out.println("\n//////////////////////////////////////////////////////////\n");
        //EX:2
//        Initialize an integer variable “number” to  30. Write a loop that will print “in the loop”
//        while variable is more than 20(exc), after each print reduce value to “1” (number -1)


        number= 30;

        while(number>20){
            System.out.println("in the loop");
            number--;
        }




    }
}
