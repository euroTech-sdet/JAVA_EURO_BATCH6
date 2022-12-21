package days.day38;

import java.util.Arrays;

public class Arrays2 {
    public static void main(String[] args) {
        String city = "ROMA";
        String[] cities = {city, "Istanbul", "Oslo", "London", "Leicester"};
        //  starts with  L    print the element
        // for each loop to check each element one by one
        // each element of this array is string so i can use string methods

        city.startsWith("L");
        cities[0].startsWith("L");
        cities[1].startsWith("L");
        cities[2].startsWith("L");
        cities[3].startsWith("L");
        cities[4].startsWith("L");
        for (String s : cities) {
            if (s.startsWith("L")) {
                System.out.println(s);
            }
        }
        System.out.println("Arrays.toString(cities) = " + Arrays.toString(cities));
//           l                Roma, Istanbul, Oslo, London, Leicester
        System.out.println(cities[0]);
        System.out.println(cities[0].toLowerCase());
        for (String s : cities) {
            if (s.toLowerCase().startsWith("l")) {
                System.out.println(s);
            }
        }
    }
}
