package days.day42;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        int[] numbers2 = {20, 30, 40, 50, 5, 9, 8};
        //               0    1   2   3  4  5  6
        System.out.println("numbers.length = " + numbers2.length);
        System.out.println("numbers[0] = " + numbers2[0]);
        System.out.println("numbers[6] = " + numbers2[6]);
        System.out.println("numbers[numbers.length] = " + numbers2[numbers2.length - 1]);
        for (int number : numbers2) {
            System.out.println("number = " + number);
        }
        int[] numbers3 = new int[5];

        ArrayList<String> animals = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();
        animals.add("cat");
        animals.add("dog");
        //  cat  dog
        //   0    1
        System.out.println("animals.get(0) = " + animals.get(0));
        animals.add(0, "elephant");
        //  elephant cat  dog
        //   0        1    2
        System.out.println("animals.get(0) = " + animals.get(0));
        System.out.println("animals.get(1) = " + animals.get(1));
        animals.set(0, "horse");
        System.out.println("animals.get(0) = " + animals.get(0));
        //  horse    cat  dog
        //   0        1    2
        System.out.println("animals.get(1) = " + animals.get(1));
        System.out.println("animals.contains(\"mice\") = " + animals.contains("mice"));
        System.out.println("animals.contains(\"horse\") = " + animals.contains("horse"));
        System.out.println("animals.indexOf(\"horse\") = " + animals.indexOf("horse"));
        System.out.println("animals.indexOf(\"mice\") = " + animals.indexOf("mice"));
        animals.add("cat");
        System.out.println("numbers2 = " + numbers2);
        System.out.println("animals = " + animals);
        System.out.println("animals.lastIndexOf(\"cat\") = " + animals.lastIndexOf("cat"));
        System.out.println("animals.indexOf(\"cat\") = " + animals.indexOf("cat"));
        // animals.clear();
        System.out.println("animals = " + animals);
        System.out.println("animals.equals(numbers) = " + animals.equals(numbers));
        ArrayList<String> animal2 = new ArrayList<>(animals);
        System.out.println("animal2.equals(animals) = " + animal2.equals(animals));
        System.out.println("animals = " + animals);
        System.out.println("animal2 = " + animal2);
        System.out.println("animals.isEmpty() = " + animals.isEmpty());
        System.out.println("animal2.isEmpty() = " + animal2.isEmpty());
        System.out.println("animals.remove(\"cat\") = " + animals.remove("cat"));
        System.out.println("animals = " + animals);
        System.out.println("animals.remove(\"elephant\") = " + animals.remove("elephant"));
        System.out.println("animals.contains(\"elephant\") = " + animals.contains("elephant"));
        System.out.println(animals.remove(1));
        System.out.println("animals = " + animals);
        System.out.println("animals.size() = " + animals.size());




    }
}
