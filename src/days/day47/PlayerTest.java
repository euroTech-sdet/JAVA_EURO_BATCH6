package days.day47;

public class PlayerTest {
    public static void main(String[] args) {
        Player player1 = new Player("Leicester", "Coskun");
        Player player2 = new Player();
        System.out.println("player1.city = " + player1.city);//Leicester
        System.out.println("player2.city = " + player2.city);//null
        System.out.println("player1.clubName = " + player1.clubName);
        System.out.println("player2.clubName = " + player2.clubName);
        player2.clubName = "Liverpool";
        System.out.println("player2.clubName = " + player2.clubName);
        System.out.println("player1.name = " + player1.name);
        player1.name = "Ali";
        System.out.println("player1.name = " + player1.name);

        Player player = new Player("Ronaldo");
        Player player4 = new Player("Messi", "PSG", "Paris", 1980);
        System.out.println("player4.city = " + player4.city);
        System.out.println("player4.name = " + player4.name);
        System.out.println("player4.clubName = " + player4.clubName);
        System.out.println("player4.age = " + player4.age);


        Player pele = new Player("Pele", "Barcelona", "Roma", 1950);
        System.out.println("pele.name = " + pele.name);
        System.out.println("pele.age = " + pele.age);
        System.out.println("pele.clubName = " + pele.clubName);
        System.out.println("pele.city = " + pele.city);
        player.city = "Manchester";
        player.clubName = "Manchester United";
        player.age = 45;


        player4.printPlayerInfo();
        player.printPlayerInfo();
        player2.name = "Coskun";
        player2.city = "London";
        player2.age = 35;

        player2.printPlayerInfo();


    }
}
