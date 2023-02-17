package days.day69;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Summary {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 5, 15, 20, 35, 80, 60));
        sumOfTheList(numbers);
        IntSummaryStatistics intSummaryStatistics = numbers.stream().mapToInt(x -> x).summaryStatistics();
        System.out.println("intSummaryStatistics.getSum() = " + intSummaryStatistics.getSum());

    }

    public static void sumOfTheList(List<Integer> numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum = sum + numbers.get(i);
        }
        System.out.println("sum = " + sum);
    }


}
