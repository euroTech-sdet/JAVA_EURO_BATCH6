package days.day13;

public class MultiwayIfElse {


    public static void main(String[] args) {


        // 100 - 90  = A
        // 89 - 80  = B
        // 79 - 70  = C
        // 69 - 60  = D
        // 59 - 00  = F

        int grade = 100;
        // OK BUT NOT A BEST PRACTICE !!!
//        if (grade <= 100 && grade >= 90) {
//            System.out.println("GRADE A");
//        }
//        if (grade <= 89 && grade >= 80) {
//            System.out.println("GRADE B");
//        }
//        if (grade <= 79 && grade >= 70) {
//            System.out.println("GRADE C");
//        }
//        if (grade <= 69 && grade >= 60) {
//            System.out.println("GRADE D");
//        }
//        if (grade <= 59) {
//            System.out.println("GRADE D");
//        }

        // Try to use 2 Way if else statements

//        grade = 50;
//
//        if (grade <= 100 && grade >= 90) {
//            System.out.println("GRADE A");
//        } else if (grade <= 89 && grade >= 80) {
//            System.out.println("GRADE B");
//        } else if (grade <= 79 && grade >= 70) {
//            System.out.println("GRADE C");
//        } else if (grade <= 69 && grade >= 60) {
//            System.out.println("GRADE D");
//        } else {
//            System.out.println("GRADE F");
//        }


        // Try to use multi-way with if /elseif/ else

        // grade>100    grade<0   --> invalid result-> inform the user!!
        grade = 80;
        String result;
        if (grade > 100 || grade < 0) {
            result = "INVALID GRADE !!!";
        } else if (grade >= 90) {
            result = "GRADE A";
        } else if (grade >= 80) {
            result = "GRADE B";
        } else if (grade >= 70) {
            result = "GRADE C";
        } else if (grade >= 60) {
            result = "GRADE D";
        } else { // grade <60
            result = "GRADE F";
        }

        System.out.println("Result = " + result);


// NO need to use this structure, use if else if multi-way solution!!
        int number = 11;
//        if (number>=90){
//            System.out.println("A");
//        } else{
//            if(number>=80){
//                System.out.println("B");
//            } else{
//                if (number>=70){
//////////////........
//                }
//            }
//        }


        if (false) ;  // DO NOT PUT ; after if !!!!
        {
            System.out.println("FALSEEE");
        }

        number = 3;
        boolean isEven; //= number%2==0;

//        if (number % 2 == 0) { // true
//            isEven = true;
//        } else {
//            isEven = false;
//        }

        isEven = number % 2 == 0;

        int hour = 36;
        double rate = 1;
        double finalSalary;
        double salary = 100;

        if (hour > 40) {
            rate = 1.5;
//            finalSalary = 1.5 *salary;
//            System.out.println("finalSalary = " + finalSalary);
        } else if (hour > 30) {
            rate = 1.3;
//            finalSalary = 1.3 *salary;
//            System.out.println("finalSalary = " + finalSalary);
        }
//        else{
//            rate=1;
////            finalSalary = 1 *salary;
////            System.out.println("finalSalary = " + finalSalary);
//        }
        finalSalary = rate * salary;
        System.out.println("finalSalary = " + finalSalary);

    }
}
