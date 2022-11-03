package days.day11;

public class ifElseStatement {

    public static void main(String[] args) {


        int score = 90 ;

        // if score is equal or greater than 80 -> u will pass the exam, if less than 80 u fail!!

        if (score>= 80){
            System.out.println("PASS");
        }

        if(score <80){
            System.out.println("FAIL!!");
        }
        /////////////////////////////////
// TWO WAY
        if (score>= 80){
            // TRUE
            System.out.println("PASS");
        } else { // score <80  , JAVA will visit else statement only if condition is FALSE!!!
            System.out.println("FAIL!!");
        }


        // number can be zero - negative - positive
        int number =0;
        if (number > 0){
            System.out.println("POSITIVE");
        } else { //number =0 or number <0
            System.out.println("NEGATIVE");
        }

        if (number==0){
            System.out.println("ZERO");
        }
        if(number<0){
            System.out.println("NEGATIVE");
        }
        if(number>0){
            System.out.println("POSITIVE");
        }
    }
}
