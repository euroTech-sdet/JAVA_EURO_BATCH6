package days.day43;

import java.util.ArrayList;

public class NBA {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("dark blue");
        colors.add("Green");
        // any element of the array list is brown
        System.out.println("colors.contains(\"brown\") = " + colors.contains("brown"));
        // any element of the arraylist contains dark
        System.out.println("colors.get(0).contains(\"dark\") = " + colors.get(0).contains("dark"));
        if (colors.get(0).indexOf("dark") >= 0) {
            System.out.println("contains dark");
        }
        ArrayList<String> scores = new ArrayList<>();
        scores.add("Miami Heats  NY Knicks : 135 - 120");
        scores.add("Toronto  New jersey : 105 - 110");
        scores.add("Oklohama  Detroit : 140 - 120");
        scores.add("Washington  Cleveland : 150 - 145");


    }
}
