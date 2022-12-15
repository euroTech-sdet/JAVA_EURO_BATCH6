package days.day35;

public class Methods2 {
    public static void main(String[] args) {
        String name = "Ronaldo";
        String name2 = "Messi";
        System.out.println(name + name2);// RonaldoMessi
        System.out.println("name.concat(name2) = " + name.concat(name2));//RonaldoMessi
        System.out.println("name = " + name);
        System.out.println(name2.concat(" scored 4 goals"));
        name = "Michael";
        System.out.println("name = " + name);
        String player = "Ronaldo";
        System.out.println(name == player);
        String player2 = player;
        player2 = "Pele";
        System.out.println("player = " + player);
        System.out.println("player2 = " + player2);


    }
}
