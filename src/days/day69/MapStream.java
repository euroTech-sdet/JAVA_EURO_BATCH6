package days.day69;

import java.util.*;
import java.util.stream.Collectors;

public class MapStream {
    public static void main(String[] args) {
        //  Ali  --> 40
        //  Faruk  --> 50
        //  Fatih  --> 30
        //  Ayse --> 20
        //  String  Integer
        Map<String, Integer> personAges = new LinkedHashMap<>();// will keep insertion order
        personAges.put("Ali", 40);
        personAges.put("Faruk", 50);
        personAges.put("Fatih", 30);
        personAges.put("Ayse", 20);
        personAges.put("Ayse", 25);
        System.out.println("personAges.keySet() = " + personAges.keySet());
        System.out.println("personAges.values() = " + personAges.values());
        for (String key : personAges.keySet()) {
            // System.out.println("key = " + key);
            if (key.startsWith("F")) {
                System.out.println("key = " + key);
            }
        }
        personAges.entrySet().stream().filter(x -> x.getKey().startsWith("F")).forEach(System.out::println);
        Map<String, Integer> startsWithF = personAges.entrySet().stream().filter(x -> x.getKey().startsWith("F")).collect(Collectors.toMap(x -> x.getKey(), n -> n.getValue()));
        System.out.println("startsWithF = " + startsWithF);
        Map<String, Integer> names40 = personAges.entrySet().stream().filter(x -> x.getValue() < 40).collect(Collectors.toMap(x -> x.getKey(), n -> n.getValue()));
        System.out.println("names40 = " + names40);
    }
}
