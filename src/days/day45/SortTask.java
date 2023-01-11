package days.day45;

import java.util.Arrays;

import static java.lang.Character.*;

public class SortTask {

    public static void main(String[] args) {


        String input= "A1GS432TJ351";
        // Sample Test Scenarios
//        String input= "A";
//        String input= "11";
//        String input= "AA";
//        String input= "A1";
//        String input= "A";
//        String input= "";
//        String input= "!()%abcd11111bcD^)(*";
//         input=" ";
        System.out.println("input = " + input);


        System.out.println("sortLettersAndNumbers(input) = " + sortLettersAndNumbers(input));
    }

    public static String sortLettersAndNumbers(String input){

        String sInput=""; // separated input
//        "DC1AX12"
        for (int i = 0; i < input.length() ; i++) {  //input.length()-1  // this static approach not suitable for each scenario
            sInput += "" + input.charAt(i);

//            if(Character.isAlphabetic(input.charAt(i)) && Character.isDigit(input.charAt(i+1))){ //!!!
//                sInput += "-";
//            }else if(Character.isDigit(input.charAt(i)) && Character.isAlphabetic(input.charAt(i+1))) {
//                sInput += "-";
//            }
            if((isAlphabetic(input.charAt(i)) && i<input.length()-1 &&  isDigit(input.charAt(i+1)))  ||
               (isDigit(input.charAt(i))    && i<input.length()-1  && isAlphabetic(input.charAt(i+1)))){
                sInput += "-";
            }
        }
//        sInput+= input.charAt(input.length()-1);  // this static approach not suitable for each scenario

        String[] sInputArray = sInput.split("-");

        System.out.println("Arrays.toString(sInputArray) = " + Arrays.toString(sInputArray));

        String returnStr= "";
        for (String eachArray : sInputArray) {  // for each , I want to sort each array separately
            char[] chars = eachArray.toCharArray();
            Arrays.sort(chars);
            for (char aChar : chars) {
                returnStr += aChar;
            }
        }
        return returnStr;
    }



}
