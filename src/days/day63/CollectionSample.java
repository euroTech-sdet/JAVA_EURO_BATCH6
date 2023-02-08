package days.day63;


import days.day61.InterfaceTest;

import java.util.*;

public class CollectionSample {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(533);
        list.add(1);
        list.add(2);
        list.add(22223);

        System.out.println("list = " + list);

        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.addAll(list);

        System.out.println("arrayList = " + arrayList);

//        arrayList.clear();
//        System.out.println("arrayList = " + arrayList);

        System.out.println("arrayList.size() = " + arrayList.size());

        System.out.println("arrayList.contains(22223) = " + arrayList.contains(22223));
        System.out.println("arrayList.contains(\"22223\") = " + arrayList.contains("22223"));
        System.out.println("arrayList.contains(222231) = " + arrayList.contains(222231));

        ///////containsAll////////

        System.out.println("arrayList.containsAll(list) = " + arrayList.containsAll(list));

        List<Integer> listMix = new ArrayList<>();
        listMix.add(1);
        listMix.add(533);
        listMix.add(22223);
        listMix.add(2);

        System.out.println("arrayList.containsAll(listMix) = " + arrayList.containsAll(listMix));

        listMix.add(111);

        System.out.println("arrayList.containsAll(listMix) = " + arrayList.containsAll(listMix));

        System.out.println("listMix.containsAll(arrayList) = " + listMix.containsAll(arrayList));


        //// equal ///

        System.out.println("arrayList.equals(list) = " + arrayList.equals(list)); // true

        Collections.sort(list);

        System.out.println("arrayList.equals(list) = " + arrayList.equals(list)); // false  !! ORDER/index is important!!!


        /////// is empty //////
        System.out.println("list.isEmpty() = " + list.isEmpty()); // false!!


        /// remove ////////

     //   list = [1, 2, 533, 22223]

//        list.remove(2); --> // delete 533
        System.out.println("list.remove((Integer) 2) = " + list.remove((Integer) 2));  // True, because value 2 is existing and deleted
        System.out.println("list = " + list);

        System.out.println("list.remove((Integer) 5) = " + list.remove((Integer) 5)); // false, because value 5 is NOT existing and deleted


        /// remove ALL ///



        ArrayList<Integer> list3 = new ArrayList<>(); //exp
        list3.add(11);
        list3.add(4);
        list3.add(3);
        list3.add(1);


        ArrayList<Integer> list4 = new ArrayList<>();  // actual result
        list4.add(3);
        list4.add(1);
        list4.add(2);


//        list3.removeAll(list4);
//
//        System.out.println("list3 = " + list3);


        /////////////toArray////////////////

        Object[] intArray = list4.toArray();

        System.out.println("Arrays.toString(intArray) = " + Arrays.toString(intArray));


        /////////////retainAll////////////////
        System.out.println("list3.retainAll(list4) = " + list4.retainAll(list3));
        System.out.println("list3 = " + list3);
        System.out.println("list4 = " + list4);

//        Retains only the elements in this list that are contained in the specified collection. In other words, removes from this list all of its elements that are not contained in the specified collection.
//        Specified by:
//        Returns:
//        true if this list changed as a result of the call

        // Creating an empty array list
        ArrayList<String> bags = new ArrayList<String>();

        // Add values in the bags list.
        bags.add("pen");
        bags.add("pencil");
        bags.add("paper");

        // Creating another array list
        ArrayList<String> boxes = new ArrayList<String>();

        // Add values in the boxes list.
        boxes.add("pen");
        boxes.add("paper");
        boxes.add("books");
        boxes.add("rubber");

        // Before Applying method print both lists
        System.out.println("Bags Contains :" + bags);
        System.out.println("Boxes Contains :" + boxes);

        // Apply retainAll() method to boxes passing bags as parameter
        boxes.retainAll(bags);

        // Displaying both the lists after operation
        System.out.println("\nAfter Applying retainAll()"+
                " method to Boxes\n");
        System.out.println("Bags Contains :" + bags);
        System.out.println("Boxes Contains :" + boxes);

    }
}
