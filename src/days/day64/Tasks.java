package days.day64;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Tasks {

    public static void main(String[] args) {
        ArrayList<String> color= new ArrayList<>(Arrays.asList("Red","Green","Orange","White"));

        task1_shuffle(color);
    }





    public static void task1_shuffle(List<String> list){
        // declare and assign values to list obj
        Collections.shuffle(list);
        System.out.println("task1_shuffle = " + list);
    }
}
