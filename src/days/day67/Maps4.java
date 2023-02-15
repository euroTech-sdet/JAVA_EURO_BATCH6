package days.day67;

import java.util.*;
import java.util.stream.Collectors;

public class Maps4 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(101, 20, 5, 40, 53, 10, 127));
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) < 40) {
                System.out.println("numbers.get(i) = " + numbers.get(i));
            }
        }
        numbers.stream().filter(x -> x < 40).forEach(System.out::println);
        List<Integer> numberGreaterThan40 = numbers.stream().filter(n -> n > 40).collect(Collectors.toList());
        System.out.println("numberGreaterThan40 = " + numberGreaterThan40);
        numbers.stream().map(x -> x % 3).forEach(System.out::println);

        Map<String, Integer> nums = new HashMap<>();
        nums.put("Veli", 105);
        nums.put("Ahmet", 305);
        System.out.println(nums.get("Veli"));
        numbers.stream().map(n->n+20).forEach(System.out::println);

    }
}
