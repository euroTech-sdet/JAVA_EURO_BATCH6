package days.day68;

import days.day52.C;

import java.util.Collections;
import java.util.List;

public class EfficientJanitorTask {

    public static void main(String[] args) {

    }


    public static int efficientJanitor(List<Float> weights) {

        // 1.5 + 1.5 = 3
        // 1.4 + 1.4 = 2.8
        // min < 1.5

        if(Collections.min(weights)> 1.5){
            return weights.size();
        }
        // TODO like this condition you can try to improve perf.

        Collections.sort(weights);
        int left = 0;
        int right = weights.size() - 1;
        int trip = 0;

        while (left <= right) {
            if(weights.get(left) + weights.get(right) <= 3){
                left ++;
            }
            right --;
            trip ++;
        }

        return trip;
    }

}

