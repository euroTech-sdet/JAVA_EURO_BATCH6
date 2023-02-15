package days.day68;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class FindMaxPatient_Task {

    public static void main(String[] args) {

        // A,A,A,B,B,C,C,C

//       HOME TASK FOR GROUP
//        1- Type all possible test scenarios input values and type reasons
//        2- According to your scenarios, update/fix/improve given solution method
//        3- Try to update to improve performance
    }


    public static int findMaxPatient(String [] input){

        // TODO we will continue on Friday!!

        Map<String,Integer> inputMap = new HashMap<>();

        for (String str : input) {
            if(inputMap.containsKey(str)){
                inputMap.put(str,inputMap.get(str)+1);
            } else{
                inputMap.put(str,1);
            }
        }

     return Collections.max(inputMap.values());
    }
}
