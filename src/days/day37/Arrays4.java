package days.day37;

import java.util.Arrays;

public class Arrays4 {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 80, 90, 60};
        System.out.println("numbers[0] = " + numbers[0]);
        System.out.println("numbers[1] = " + numbers[1]);
        System.out.println("numbers[2] = " + numbers[2]);
        System.out.println("numbers[3] = " + numbers[3]);
        System.out.println("numbers[4] = " + numbers[4]);
        System.out.println("for loop");
        for (int i = 0; i < 5; i++) {
            System.out.println("numbers[i] = " + numbers[i]);
        }

        String[] cities = new String[4];
        System.out.println("cities.length = " + cities.length);
        cities[3] = "Istanbul";
        cities[0] = "Munich";
        cities[1] = "Madrid";
        cities[2] = "London";

        cities[0] = "Izmir";
        System.out.println("Arrays.toString(cities) = " + Arrays.toString(cities));
        for (int i = 0; i < 4; i++) {
            System.out.println("cities[i] = " + cities[i]);
        }
        System.out.println("for each loop ");
//numbers = {10, 5, 80, 90, 60};  length is 5
        for (int number : numbers) {
            System.out.println("number = " + number);
        }
//   cities=     Izmir, Madrid, London, Istanbul

        for (String city : cities) {
            System.out.println("city = " + city);
        }

    }
}
