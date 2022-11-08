package days.day12;

import java.sql.SQLOutput;

public class ReviewWeek3 {

    public static void main(String[] args) {


        int number = 10 + 1;  // 11 -> 12 -> 13

//        number++ -->  get number then inc value!!
//        ++number -->  inc value first then get the updated number!!

        System.out.println("number = " + number);  // 11

        System.out.println("number++ = " + number++);  // 11

        System.out.println("number = " + number);  //12

        System.out.println("++number = " + ++number); //13


        System.out.println("\n///////////////////////////\n");

        number=1; //

        int num2= number + number++ * --number / number;
        System.out.println("num2 = " + num2);


        number= 11; // 12 11 12  13

        double num3= (double)number / (number++ + --number) - (number - number++) * ++number;
         // = 11.0 / (11 + 11) - (11 - 11) * 13;
         // = 11.0 / 22 - 0 * 13;
         // = 0.5 - 0
         // = 0.5
         // =


        System.out.println("Final num2 = " + num2);



        number = 11;// 12
        int test = number - number++ * number;
        //       = 11 - 11 * 12


        System.out.println("test = " + test);


        number = 10;
        number = -number;
        System.out.println(" - number = " + number);

        number = +number;

        System.out.println(" + number = " + number);


        boolean check = false;

        boolean uncheck = !check; // true

        System.out.println("uncheck = " + uncheck);

        if(!check){
            // do this....
        }



        ///////////

        boolean exp = 1.0 == 1;

        number= 66;
        if (number != 100){ // true

        }




        ///////////////////

        number = number + 1;  //number++
        System.out.println("number = " + number);
        number += 2;  // number = number + 2;









    }
}
