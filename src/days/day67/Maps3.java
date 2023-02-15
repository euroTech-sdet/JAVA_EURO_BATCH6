package days.day67;

import java.util.*;

public class Maps3 {
    public static void main(String[] args) {
        Map<String, String> capitals = new HashMap<>();
        capitals.put("Turkey", "Ankara");
        Map<String, List<String>> cities = new HashMap<>();
        //   Key       Value
        List<String> germanCities = new ArrayList<>();
        germanCities.add("Berlin");
        germanCities.add("Munich");
        germanCities.add("Bremen");
        germanCities.add("Hamburg");
        cities.put("Germany", germanCities);
        cities.put("England", Arrays.asList("London", "Leicester", "Leeds", "Newcastle", "Liverpool"));
        cities.put("Turkey", Arrays.asList("Urfa", "Maras", "Hatay", "Antep", "Tunceli"));

        System.out.println(cities.get("Germany"));
        System.out.println(cities.get("Germany").get(2));
        System.out.println(cities.get("England").size());
        System.out.println(cities.size());
        System.out.println("cities.keySet() = " + cities.keySet());
        for (List<String> list : cities.values()) {
            System.out.println("list.get(0) = " + list.get(0));
            System.out.println("list = " + list);
        }
        cities.entrySet().stream().forEach(System.out::println);

    }
}
