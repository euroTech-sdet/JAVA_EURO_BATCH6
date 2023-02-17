package days.day69;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Cities2 {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        cities.add("real madrid");
        cities.add("sporting lisbon");
        cities.add("werder bremen");
        for (int i = 0; i < cities.size(); i++) {
            System.out.println(cities.get(i).split(" ")[1]);
        }
        cities.stream().map(x -> x.split(" ")[1]).forEach(System.out::println);
        List<String> collectedCities = cities.stream().map(x -> x.split(" ")[1]).collect(Collectors.toList());
        System.out.println("collectedCities = " + collectedCities);
        int[] nums = {5, 100, 7, 90, 65, 45, 25, 20, 10};
        Arrays.stream(nums).filter(x -> x < 40).forEach(System.out::println);
        //   5*5  100*100 7*7 90*90 65*65
        Arrays.stream(nums).map(n -> n * n).forEach(System.out::println);
        Arrays.stream(nums).map(n -> n * n).filter(x->x<1000).forEach(System.out::println);


    }
}
