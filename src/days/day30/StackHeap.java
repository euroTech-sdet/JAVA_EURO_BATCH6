package days.day30;

public class StackHeap {
    public static void main(String[] args) {
        int number = 75;
        int number2 = 150;
        String city = "Oslo";
        String town = "Oslo";
        System.out.println(city == town);//true
        System.out.println(number);
        String secondCity = new String("Oslo");
        sayHello();
        System.out.println("we are in the main method");
        System.out.println(city == secondCity);
        String city5 = "Istanbul";
        town = "Istanbul";
        System.out.println(city5 == town);
        city = "Berlin";
        char letter = 'A';
        letter = 'B';
        // byte short int long float double boolean char
        secondCity = "Istanbul";
        System.out.println(secondCity == town);
    }

    public static void sayHello() {
        int number = 20;
        System.out.println("Hello");
    }
}
