package days.day43;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WrapperList {
    public static void main(String[] args) {
        ArrayList<String> numbers = new ArrayList<>();
        numbers.add("10");
        numbers.add("20");
        numbers.add("30");
        numbers.add("5");
        numbers.add("25");
        numbers.add("15");
        ArrayList<Integer> realNumbers = new ArrayList<>();

        String str = "20";
        int n = Integer.valueOf(str);
        int n1 = Integer.parseInt(str);
        System.out.println("n = " + n);
        for (String s : numbers) {
            int n5 = Integer.parseInt(s);
            realNumbers.add(n5);
        }
        System.out.println("realNumbers = " + realNumbers);
        realNumbers.clear();
        for (int i = 0; i < numbers.size(); i++) {
            int n6 = Integer.valueOf(numbers.get(i));
            realNumbers.add(n6);
        }
        System.out.println("realNumbers = " + realNumbers);
        realNumbers.clear();
        System.out.println("-----------------------------------");
        numbers.stream().map(x->Integer.parseInt(x)).forEach(System.out::println);
        List<Integer> collect = numbers.stream().map(x -> Integer.parseInt(x)).collect(Collectors.toList());
        System.out.println("collect = " + collect);
        numbers.stream().map(elementOfArrayList->Integer.parseInt(elementOfArrayList)).forEach(System.out::println);

    }
}
