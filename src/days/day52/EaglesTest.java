package days.day52;

public class EaglesTest {
    public static void main(String[] args) {
        Eagles eagles = new Eagles("Ali");
        Eagles eagles1 = new Eagles("Querasma");
        Eagles eagles2 = new Eagles("Ronaldo");
        eagles.scoredOne();//Ali
        eagles.scoredOne();// scored 2 times
        eagles.printScore();
        eagles1.scoredOne();
        eagles1.printScore();
        eagles2.scoredOne();
        eagles2.printScore();
        System.out.println("eagles.nameOfScorers = " + eagles.nameOfScorers);
        System.out.println("eagles1.getName() = " + eagles1.getName());


    }
}
