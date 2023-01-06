package days.day43;

import java.util.ArrayList;
import java.util.Arrays;

public class List3 {
    public static void main(String[] args) {
        // create a method
        // print the first and last elements of the arraylist
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Oslo");
        cities.add("London");
        cities.add("Liverpool");
        printFirstAndLast(cities);
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("White", "Black", "Blue", "Brown"));
        printFirstAndLast(colors);
        String first = firstElement(colors);
        System.out.println("first = " + first);
        String firstCity = firstElement(cities);
        System.out.println("firstCity = " + firstCity);
        System.out.println(sizeOfList(colors));

    }

    public static void printFirstAndLast(ArrayList<String> list) {
        System.out.println("list.get(0) = " + list.get(0));
        System.out.println("list.get(list.size()-1) = " + list.get(list.size() - 1));
    }

    public static String firstElement(ArrayList<String> list) {
        String first = list.get(0);
        return first;
    }

    public static int sizeOfList(ArrayList<String> list) {
        int size = list.size();
        return size;
    }


}
