package days.a;

import java.util.Arrays;

import static java.lang.Character.isAlphabetic;
import static java.lang.Character.isDigit;

public class SortTaskSS {

    public static void main(String[] args) {


        String input= "ADBC1432GS4322";
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
            // araya - koymak icin 2 ihtimal var
            // 1- elimdeki(i) char letter, digeri (i+1) sayi
            // 2- elimdeki(i) char sayi, digeri (i+1) letter

            if (i<input.length()-1) { // eger son char da degilsek asagi ineck, cunku i+1 var ,Array index out of boundary hatasi almamak icin!!
                if ((isAlphabetic(input.charAt(i)) && isDigit(input.charAt(i + 1))) ||
                        (isDigit(input.charAt(i)) && isAlphabetic(input.charAt(i + 1)))) {
                    sInput += "-";
                }
            }

        }
//        sInput+= input.charAt(input.length()-1);  // this static approach not suitable for each scenario

        System.out.println("sInput = " + sInput);
        String[] sInputArray = sInput.split("-");

        System.out.println("Arrays.toString(sInputArray) = " + Arrays.toString(sInputArray));

        String returnStr= "";

        for (String eachString : sInputArray) {  // for each , I want to sort each String separately
            String[] split = eachString.split(""); // Her bir String i array e donustur, cunku sort methodu orda var
            Arrays.sort(split); // ilgili stringin arrayini sort yaptik
            for (String str : split) { // sort edilen array elemanini tek tek return str a ekle
                returnStr += str;
            }
        }
        return returnStr;
    }



}
//
//"ADBC"
//A,D,B,C