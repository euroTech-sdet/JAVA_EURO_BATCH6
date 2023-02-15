package days.day67;

import java.util.*;

public class Maps2 {
    public static void main(String[] args) {
        LinkedHashMap<String, String> capitals = new LinkedHashMap<>();// keeps insertion order
        capitals.put("England", "London");
        capitals.put("Germany", "Berlin");
        capitals.put("Turkey", "Ankara");
        capitals.put("Spain", "Madrid");
        capitals.put("Norway", "Oslo");
        System.out.println("capitals = " + capitals);
        String norwayCapital = capitals.get("Norway");
        System.out.println("norwayCapital = " + norwayCapital);
        System.out.println("capitals.keySet() = " + capitals.keySet());
        System.out.println("capitals.values() = " + capitals.values());
        for (Map.Entry<String, String> cities : capitals.entrySet()) {
            System.out.println("cities.getKey() = " + cities.getKey());
            System.out.println("cities.getValue() = " + cities.getValue());
        }

        Map<String, String> capitals2 = new HashMap<>();
        capitals2.put("Italy", "Roma");
        Map<String, String> capitals3 = new TreeMap<>();
        capitals3.put("Sweden", "Stockholm");
        Map<String, String> capitals4 = new LinkedHashMap<>();
        capitals4.put("Scotland", "Glaskow");
        List<Map<String, String>> listOfCities = new ArrayList<>();


        listOfCities.add(capitals);
        listOfCities.add(capitals2);
        listOfCities.add(capitals3);
        listOfCities.add(capitals4);
        capitals2.put("England", "London");
        capitals2.put("Germany", "Berlin");
        capitals2.put("Turkey", "Ankara");
        capitals2.put("Spain", "Madrid");
        capitals2.put("Norway", "Oslo");
        System.out.println("capitals2 = " + capitals2);
        System.out.println("capitals = " + capitals);
        System.out.println("listOfCities.get(0) = " + listOfCities.get(0));
        System.out.println(listOfCities.get(0).get("Turkey"));
        System.out.println("listOfCities.get(0).keySet() = " + listOfCities.get(0).keySet());
        System.out.println("listOfCities.size() = " + listOfCities.size());
        System.out.println("listOfCities.get(3) = " + listOfCities.get(3));
        System.out.println(listOfCities.get(3).get("Scotland"));


        Map<Integer, String> numbersOfPerson = new TreeMap<>();
        numbersOfPerson.put(5, "Veli");
        numbersOfPerson.put(8, "Coskun");
        numbersOfPerson.put(2, "Furkan");
        numbersOfPerson.put(3, "Keti");
        numbersOfPerson.put(1, "Messi");
        System.out.println("numbersOfPerson = " + numbersOfPerson);
        System.out.println("numbersOfPerson.size() = " + numbersOfPerson.size());

        for (int i : numbersOfPerson.keySet()) {
            System.out.print("key  " + i);// key
            System.out.println( numbersOfPerson.get(i));// value
        }


    }
}
