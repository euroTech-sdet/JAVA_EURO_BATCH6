package days.day11;

public class SamplesIfElse {


    public static void main(String[] args) {
        double balance= 120;
        int score = 7;

        // Extra condition -1 Father if u s<8 u have to pay 20 to me!!

//  TASK for Friday --------------------------------------------------------------------------------------------
        // Extra condition -2 kid can only take money from 1 person, if father give him money,
        // he can not take money from his uncle. Father check has priority, then kid will visit his uncle!!

        if (score>=8){ // --> FATHER
            balance+= 50;
        }  else{
            balance-=20;
        }


        if(score>6){  // --> UNCLE
            balance+=20;
        }  else{
            balance-=10;
        }

        System.out.println("balance = " + balance);


    }
}
