package days.day68;

import java.util.*;

public class FindMaxPatient_Task {

    public static void main(String[] args) {
        // Scenarios:
        //1  String []input = {"A"}; //--> 1
        //2  String []input = {"A","A","A"}; //--> 3
        //3  String []input = {"A","B","C","D","E"}; //--> 1
        //4  String []input = {"A","A","B","B","C"}; //--> 2
        //5  String []input = {"A","A","A","A"....."A"}; //--> 100.000


//       HOME TASK FOR GROUP
//        1- Type all possible test scenarios input values and type reasons
//        2- According to your scenarios, update/fix/improve given solution method
//        3- Try to update to improve performance
    }


    public static int findMaxPatient(String [] input){
// TODO EXTRA TASK : Return also department name(s) with max number!!
// TODO sort then after each group count finish, check max number and remaining size to continue
        // AAAAAAAAABBCCCDD  after A stop and check remaining size if <9 then stop !! return 9!!

        Set<String> setInput = new TreeSet<>(List.of(input));
//        Collections.addAll(setInput,input)

        if(setInput.size() == input.length || input.length == 1 ){  //1 ,3
            return 1;
        }else if(setInput.size()==1){ //2 , 5
            return input.length;
        }


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
