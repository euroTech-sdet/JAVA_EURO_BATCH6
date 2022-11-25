package days.day23;

public class Methods2 {
    public static void main(String[] args) {
        printAge("Ronaldo", 37);
//        int number = 40;
        printAge("Messi", 35);
        String player = "Pele";
        int age = 80;
        printAge(player, age);
        System.out.println("Hi Ronaldo");
        // hi String name
        hiTo(player);
        player = "Ronaldo";
        hiTo(player);
        hiTo("Ronaldo");

    }

    public static void printAge(String name, int age) {
        System.out.println(name + " is " + age + " years old");
        //Ronaldo is      37     years old
        //Messi   is      35     years old
    }

    public static void hiTo(String name) {
        System.out.println("Hi " + name);
    }

}
