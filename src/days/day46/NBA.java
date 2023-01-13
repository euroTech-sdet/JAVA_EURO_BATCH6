package days.day46;

import java.util.ArrayList;
import java.util.Arrays;

public class NBA {
    public static void main(String[] args) {
        ArrayList<String> scores = new ArrayList<>();
        scores.add("Miami Heats  NY Knicks : 135 - 120");
        scores.add("Toronto  New jersey : 105 - 110");
        scores.add("Oklohama  Detroit : 140 - 120");
        scores.add("Washington  Cleveland : 150 - 145");
        //     "Miami Heats  NY Knicks
        //                               : 135 - 120"
        String[] result = scores.get(0).split(":");
        System.out.println("Arrays.toString(result) = " + Arrays.toString(result));
        System.out.println("result[1] = " + result[1]);
                                                // 135 - 120
        String[] numbersString = result[1].split("-");
        //  String[] numbersString=scores.get(0).split(":")[1].split("-");
        System.out.println("Arrays.toString(numbersString) = " + Arrays.toString(numbersString));
        System.out.println("numbersString[0] = " + numbersString[0]);// 135
        System.out.println("numbersString[1] = " + numbersString[1]);// 120
        int first;
        int second;
        first = Integer.parseInt(numbersString[0].trim());
        System.out.println("first = " + first);
        second = Integer.valueOf(numbersString[1].trim());
        System.out.println("second = " + second);
        //Miami Heats  NY Knicks : 135 - 120
      //  String[] numbers=scores.get(0).split(":")[1].split("-");

    }
}
