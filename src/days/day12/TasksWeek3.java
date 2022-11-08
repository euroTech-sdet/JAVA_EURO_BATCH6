package days.day12;

public class TasksWeek3 {

    public static void main(String[] args) {


//        Task-1

//        Write a Java program to find max number for given numbers (positive)
//
//        1. number:  11
//        2. number:  1
//        3. number:  33


        // s-1 no equality
        int num1 = 10;
        int num2 = 11;
        int num3 = 13;

        if (num1>num2 && num1>num3 ) {  // cond for num1
            System.out.println(num1);
        }

        if (num2>num1 && num2>num3 ) {  // cond for num2
            System.out.println(num2);
        }

        if (num3>num1 && num3>num2 ) {  // cond for num3
            System.out.println(num3);
        }

        ////////////////////////////////////
//        s-2  equality is ok!!

         num1 = 11;
         num2 = 10;
         num3 = 11;

        if (num1>=num2 && num1>=num3 ) {  // cond for num1
            System.out.println(num1);
        }



//  TASK for Friday --------------------------------------------------------------------------------------------
        // Extra condition -2 kid can only take money from 1 person, if father give him money,
        // he can not take money from his uncle. Father check has priority, then kid will visit his uncle!!
/// solution -1
        double balance = 120;
        int score = 7;
        boolean flag = false; // did u take any money?!
        score = 9;
        if (score >= 8) { // --> FATHER
            balance += 50;
            flag = true;
        }

        if (score > 6 && !flag) {  // --> UNCLE
            balance += 20;
        }

        if (score <= 6) {
            balance -= 10;
        }

        System.out.println("balance = " + balance);


        /// solution -2

        score = 9;
        if (score >= 8) { // --> FATHER
            balance += 50;
        }

        if (score > 6 && score < 8) {  // --> UNCLE
            balance += 20;
        }

        if (score <= 6) {
            balance -= 10;
        }



        /// solution -3
        score = 9;
        if (score >= 8) { // --> FATHER
            balance += 50;
        }

        if (score > 6 ) {// --> UNCLE
            if(score < 8) {
                balance += 20;
            }
        } else  {
            balance -= 10;
        }

        /// solution -4

        if (score>=8) { // father
            balance += 50;
        }else {
            balance-=20;

            if (score > 6) {  // --> UNCLE
                balance += 20;
            } else {
                balance -= 10;
            }
        }

        System.out.println("balance = " + balance);
    }
}
