package days.day15;

public class TernaryOpr {

    public static void main(String[] args) {

        int number = -10;

        String result;
        // result ="Positive"   "Negative"

        if (number >= 0) {
            result = "Positive";
        } else {
            result = "Negative";
        }

        result = (number < 0) ? "Negative" : "Positive";

       // System.out.println((number < 0) ? "Negative" : "Positive");

        ///////////////////

        if (number >= 0) {
//            result = "Positive";
            System.out.println("Positive");
         //   Math.max(2,4);
            int test= 2;

        } else {
//            result = "Negative";
            System.out.println("Negative");
          //  Math.max(2,4);
            int test= 2;
        }


//        result = (number < 0) ? System.out.println("Negative") : System.out.println("Positive");
        double hour = 40;
        double salary= 1000;
        double  finalSalary = (hour<30)? 1000*2 : salary;

        System.out.println("finalSalary = " + finalSalary);



        /////////////////////  NESTED Ternary Opr \\\\\\\\\\\\\\\\\
        int n1=2,n2=1,n3=11;

        int maxNumber= (n1>n2) ? ( (n1>n3) ? n1 : n3 ) : ( (n2>n3) ? n2 : n3 );

        System.out.println("maxNumber = " + maxNumber);
    }

}
