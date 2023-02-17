package days.day69;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams2 {
    public static void main(String[] args) {
        // IntStream.range(0, 10).forEach(System.out::println);
        IntStream.range(0, 10).skip(4).forEach(System.out::println);
        IntStream.range(10, 30).filter(n -> n % 2 == 1).forEach(System.out::println);
        IntStream.range(10, 30).filter(n -> n % 2 == 1).filter(n -> n < 25 && n > 20).forEach(System.out::println);

    }
}
