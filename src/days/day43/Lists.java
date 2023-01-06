package days.day43;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Lists {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Oslo");// index number is 0
        cities.add("Istanbul");// index number 1
        cities.add("London");
        cities.add("Roma");
        System.out.println("cities = " + cities);
//        Oslo, Istanbul, London, Roma
//        0        1        2       3
        cities.add(2, "Madrid");
        System.out.println("cities = " + cities);
//        Oslo, Istanbul, Madrid, London, Roma
//          0       1       2       3      4
        System.out.println("cities.get(0) = " + cities.get(0));
        System.out.println("cities.size() = " + cities.size());
        // arrays.length   capacity
        // arraylist.size  how many current element numbers  are there in the arraylist
        int[] number = new int[5];
        number[0] = 100;
        System.out.println("number.length = " + number.length);
        cities.set(0, "Hamburg");// replace the value
        System.out.println("cities = " + cities);
        System.out.println("cities.isEmpty() = " + cities.isEmpty());
        System.out.println("cities.contains(\"Roma\") = " + cities.contains("Roma"));
        System.out.println("cities.contains(\"Leicester\") = " + cities.contains("Leicester"));
        String italy = "Roma";
        System.out.println("cities.indexOf(italy) = " + cities.indexOf(italy));
        System.out.println("cities.indexOf(\"Bremen\") = " + cities.indexOf("Bremen"));
        System.out.println("cities = " + cities);
        cities.remove(0);
        System.out.println("cities = " + cities);
        cities.remove(italy);
        System.out.println("cities = " + cities);
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 5, 9, 60, 50, 35, 25));
        System.out.println("cities.equals(numbers) = " + cities.equals(numbers));
        ArrayList<String> newCities = new ArrayList<>(cities);
        System.out.println("newCities = " + newCities);
        System.out.println("cities.equals(newCities) = " + cities.equals(newCities));
        newCities.clear();
        System.out.println("newCities = " + newCities);
        Collections.sort(numbers);
        System.out.println("numbers = " + numbers);
        System.out.println("cities = " + cities);
        Collections.reverse(cities);
        System.out.println("cities = " + cities);
        numbers.add(60);
        Collections.reverse(numbers);
        System.out.println("numbers = " + numbers);
        Collections.replaceAll(numbers, 60, 100);
        System.out.println("numbers = " + numbers);
        numbers.set(0,200);
        System.out.println("numbers = " + numbers);



    }
}
