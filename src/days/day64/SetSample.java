package days.day64;

import java.util.*;
import java.util.stream.Collectors;

public class SetSample {

    public static void main(String[] args) {

        Set<String> stringSet = new HashSet<>();

        stringSet.add("Toyota");
        stringSet.add("BMW");
        stringSet.add("Honda");
        stringSet.add("Kia");
        stringSet.add("Toyota");
        stringSet.add("toyota");
        stringSet.add("BMW");

        System.out.println("stringSet = " + stringSet);


        Set<String> setTree = new TreeSet<>(stringSet);  //setTree.addAll(stringSet);

        setTree.add("BMW");
        System.out.println("setTree = " + setTree);

//        setTree.get(2);

        Integer [] arrayInt= {1,2,3};
        // array -> arraylist ////////////////////////
              //if you have int array
           int [] arrayInt2= {1,2,3};
           List<Integer> list = Arrays.stream(arrayInt2).boxed().collect(Collectors.toList());

        List<Integer> intList = Arrays.asList(arrayInt);
        List<Integer> intList1 = List.of(arrayInt);

        // array -> treeSet ////////////////////////
        Set<Integer> setInt = Set.of(arrayInt);

        // Set -> List  ////////////////////////
            List<Integer> list2 = new ArrayList<>(setInt);
            // list2.addAll(setInt);
        System.out.println("list2 = " + list2);

        // Collection -> Array  ////////////////////////
        Object[] objArray = list2.toArray();
        System.out.println("Arrays.toString(objArray) = " + Arrays.toString(objArray));


    }
}
