package days.day69;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Cities {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("");
        names.add("Ali");
        names.add("Mehmet Ali");
        names.add("");
        names.add("Ayse");
        names.add("Mehmet");
        names.add("");
        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).contains("Ali")) {
                System.out.println("names.get(i) = " + names.get(i));
            }
        }
        names.stream().filter(name -> name.contains("Ali")).forEach(System.out::println);
        for (int i = 0; i < names.size(); i++) {
            if (!names.get(i).isEmpty()) {
                System.out.println("names.get(i) = " + names.get(i));
            }
        }
        List<String> collectNames = names.stream().filter(x -> !x.isEmpty()).collect(Collectors.toList());
        System.out.println("collectNames = " + collectNames);

        names.stream().map(name -> "Hello " + name).forEach(System.out::println);
        // find the element starts with A
        names.stream().filter(n->n.startsWith("A")).forEach(System.out::println);
        names.stream().map(n->"Hi "+ n).filter(x->x.length()>10).forEach(System.out::println);
        names.stream().map(x->x.toUpperCase()).forEach(System.out::println);
        // if elements is not empty make uppercase and print
        names.stream().filter(x->!x.isEmpty()).map(n->n.toUpperCase()).forEach(System.out::println);

        long ali = names.stream().filter(x -> x.contains("Ali")).count();
        System.out.println("ali = " + ali);


    }
}
