package days.day15;

public class TernaryTasks {

    public static void main(String[] args) {
        System.out.println("\n//////////////// TASK-1 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");

        int num = 11;

        String number = (num % 2 == 0) ? " is even number" : " is odd number";

        System.out.println(num + number);


        ////////////////////////////////

        int n1 = 331341;
        System.out.println((n1 % 2 == 1) ? n1 + " is an odd number" : n1 + " is an even number");
        //////////////////////////////////

        String result;


        result = (num % 2 == 0) ? ("Even") : ("Odd");

        System.out.println(result);


        System.out.println("\n//////////////// TASK-2 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");


//        Write a program that checks if a student operator:
//        Pass limit is 50. Please inform the student how much he/she need to pass the exam
//        Do not trust the INPUT mark.. try to cover borders!!
//        Sample1: Your mark is 80 and you passed
//        Sample2: Your mark is 45 and you failed. You needed 5 more points to pass the exam

// Solution with multi-way if-else
        int mark = 80;
        final int LIMIT = 50;
        String resultMark = "Your mark is " + mark + " and you ";

        if (mark > 100 || mark < 0) {
            resultMark = "NEGATIVE INPUT!!";
        } else if (mark >= LIMIT) {
            resultMark += "passed";
        } else {
            resultMark += "failed. You needed " + (LIMIT - mark) + " more points to pass the exam";
        }

        System.out.println(resultMark);

        //////////////////////////

// Solution with Ternary Opr

        resultMark = (mark > 100 || mark < 0) ? ("NEGATIVE INPUT!!") : ((mark >= LIMIT) ? resultMark + "passed" : resultMark + "failed. You needed " + (LIMIT - mark) + " more points to pass the exam");


        //////////////////////////////////////////

        int note = 25;
        resultMark = ((note > 50) && (note < 101) ?
                "Your mark is " + note + " and you passed" :
                (note >= 0) && (note < 101) ?
                        "Your mark is " + note + " and you failed. You needed " + (50 - note) +
                                " more points to pass the exam" :
                        " This is invalid input");

        System.out.println(resultMark);

        //////////////////////////////////////////


        if (0 <= mark && mark <= 100) {
            String theMark = (mark >= 50) ? "Your mark is " + mark + ". You passed." : "Your mark is " + mark + ". You failed and you need " + (50 - mark) +
                    " more points to pass the exam.";

            System.out.println(theMark);
        } else {
            System.out.println("invalid mark");
        }
            ////////////////////////////////////

            System.out.println("\n//////////////// TASK-3 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");

            int age = 13;
            String name = "Hi John , you are ";

            result = (age>=18) ? name + "hired as a QA Engineer!" : name + "not hired as a QA Engineer!";
            System.out.println(result);


            ////////////////////////////////////

            System.out.println("\n//////////////// TASK-4 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");


            System.out.println(Math.abs(6)); //a < 0 ? -a : a


    }
}
