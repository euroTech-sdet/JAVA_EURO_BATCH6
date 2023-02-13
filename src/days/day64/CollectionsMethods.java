package days.day64;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsMethods {

    public static void main(String[] args) {

        ArrayList<String> bags = new ArrayList<String>();

        bags.add("C");
        bags.add("A");
        bags.add("A");
        bags.add("A");
        bags.add("B");
        bags.add("B");
        bags.add("B");
        bags.add("B");

        String[] strArray= {"A","B","B","C"};

//        Collections.frequency(strArray,"A");  we need to convert array to arraylist!!
        ////////////sort //////////////
        Collections.sort(bags);

        //////////binarySearch ////////////////
        System.out.println("Collections.binarySearch= " + Collections.binarySearch(bags, "C"));

        ////////////emptyList //////////////
        List<Object> objects = Collections.emptyList();
        System.out.println("objects.size() = " + objects.size());

        ////////////frequency //////////////
        System.out.println("Collections.frequency(bags,\"B\") = " + Collections.frequency(bags, "B"));

        ////////////MAX //////////////
        Integer[] numbers ={33,22,11,23,555,-2};

        List<Integer> numList = List.of(numbers);
        System.out.println("numList = " + numList);

        System.out.println("Collections.max(List.of(numbers)) = " + Collections.max(numList));

        System.out.println("Collections.min(numList) = " + Collections.min(numList));

        ///////////reversOrder///////////////
        System.out.println("bags = " + bags);
        Collections.reverse(bags);

        System.out.println("bags after reverse = " + bags);

    }
}
