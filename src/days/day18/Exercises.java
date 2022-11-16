package days.day18;

public class Exercises {
    public static void main(String[] args) {
        // print any name of the city 5 times
        String city = "Oslo";
        for (int i = 10; i > 5; i--) { //descending
            System.out.println(city);
        }
        for (int i = 5; i < 10; i++) {// ascending
            System.out.println("istanbul");
        }
        for (double d = 0.5; d < 1; d += 0.1) {
            System.out.println("d = " + d);
            System.out.println("hello");
        }

    }
}
