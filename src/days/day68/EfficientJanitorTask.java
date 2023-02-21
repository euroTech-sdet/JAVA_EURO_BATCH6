package days.day68;

import days.day52.C;

import java.util.Collections;
import java.util.List;

public class EfficientJanitorTask {

    public static void main(String[] args) {
/*
      weights= {1.01f};
      weights= {3};
      weights= {1.01f,1.01f,1.01f};
      weights= {1.01f,1.501f,1.501f};
      weights= {1.6f,1.6f,1.6f};


*/
    }


    public static int efficientJanitor(List<Float> weights) {

        // 1.5 + 1.5 = 3
        // 1.4 + 1.4 = 2.8
        // min < 1.5

        if(Collections.min(weights)> 1.5){
            return weights.size();
        } else if(weights.size() == 1){ // just for approach !!
            return 1;
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

    public static int minTrip2(List<Float> arr) {
        Collections.sort(arr);
        float maxBorder = 3.00f - arr.get(0);
        int trip= (int) arr.stream().filter(n->(n>maxBorder)).count();
        arr.removeIf(n -> (n > maxBorder));

        int left = 0;
        int right = arr.size() - 1;

        while (left <= right) {
            if (arr.get(left) + arr.get(right) <= 3) {
                left++;
            }
            right--;
            trip++;
        }
        return trip;
    }



}

