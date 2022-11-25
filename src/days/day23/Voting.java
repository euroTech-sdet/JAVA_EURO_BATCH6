package days.day23;

public class Voting {
    public static void main(String[] args) {
        //eligible for voting  int age over or equals 18
//        checkingAgeForVoting(15, "Messi");
//        String player = "Ronaldo";
//        checkingAgeForVoting(35, player);
//        player = "Jordan";
//        checkingAgeForVoting(75, player);
        checkingForVoting(70, "Curry");
        boolean isRonaldoElligible = checkingForVoting(17, "Ronaldo");
        System.out.println("isRonaldoElligible = " + isRonaldoElligible);
        boolean isMessiElligible = checkingForVoting(35, "Messi");
        System.out.println("isMessiElligible = " + isMessiElligible);

    }

    public static boolean checkingForVoting(int age, String name) {
        boolean voteOrNot = true;
        if (age >= 18) {
            voteOrNot = true;
            System.out.println(name + " is  elligible for voting");
        } else {
            voteOrNot = false;
            System.out.println(name + " is  not elligible for voting");
        }

        return voteOrNot;
    }


    public static void checkingAgeForVoting(int age, String name) {
        if (age >= 18) {
            System.out.println(name + " is  elligible for voting");
        } else {
            System.out.println(name + " is  not elligible for voting");
        }
    }
}
