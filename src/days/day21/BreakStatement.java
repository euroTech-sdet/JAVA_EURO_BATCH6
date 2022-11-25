package days.day21;

import days.day22.WebSite;

public class BreakStatement {


    public static void main(String[] args) {

        int number;

//        itar

        // after 13 I don't want to print anything
        for (number =1; number < 50; number++) {

            if(number==13){
                number=50; // manipulation
            }
            System.out.println(number);
        }

        //need to use number maybe but number is changed!!! ->number

        for(number =1; number < 50; number++){
            if(number==13){
               break;
            }
            System.out.println(number); // if number ==13 then line 28 will skip!!
        }


        //2 Dif between them:
        // 1- line after if condition will run in first option, will not run in break option
        // 2- after ending loop, number index value will be change in option 1 and will be exact true value in opt 2


    }
}
