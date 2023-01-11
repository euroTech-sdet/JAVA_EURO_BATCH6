package days.day45;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class OtherTaskSolutions {

//    public static void main(String[] u) {
//
//
//
//        String input = "DC501GCCCA098911";
//        String result = "";
//        String substring = "";
//        for (int i = 0; i < input.length(); i++){
//
//            substring += input.charAt(i);
//
//            if((i != input.length()-1 && willBeChanged(new char[] {input.charAt(i),input.charAt(i+1)} ) ) || i == input.length()-1){
//                result += sort(substring);
//                substring = "";
//            }
//        }
//        System.out.println("result = " + result);
//    }
//    static boolean willBeChanged(char[]c){
//        int counter = 0;
//        for(int i = 0; i < c.length; i++){
//            if(Character.isLetter(c[i])) counter++;
//        }
//        return counter == 1;
//    }
//    static String sort(String s){
//        char[] arr = s.toCharArray();
//        for (int i = 0; i < arr.length - 1; i++){
//            for(int j = 0; j < arr.length - 1 - i; j++){
//                if(arr[j] > arr[j + 1]){
//                    char temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }
//        String result = "";
//        for (int i = 0; i < arr.length; i++) {
//            result += arr[i];
//        }
//        return result;
//    }

//
//        public static void main(String[] args) {
//
//            String str = "DC501GCCCA098911";
//            System.out.println("INPUT = " + str);
//            String[] str3 = splitStr(str).split("-");
//            System.out.print("OUTPUT = ");
//            for (String s : str3) {
//                System.out.print(sort2(s));
//            }
//        }
//        public static char[] sort2(String str4) {
//
//            char[] list = str4.toCharArray();
//            Arrays.sort(list);
//            return list;
//        }
//
//
//        public static String splitStr(String str) {
//            int n = str.length();
//            String str2 = "";
//
//            int isDigit = 0;
//            int isLetter = 0;
//            str2 += str.charAt(0);
//
//            for (int i = 1; i < n; i++) {
//                if (Character.isDigit(str.charAt(i))) {
//                    isDigit++;
//                    isLetter = 0;
//                } else if (Character.isLetter(str.charAt(i))) {
//                    isLetter++;
//                    isDigit = 0;
//                }
//                if ((isDigit > 1) || (isLetter > 1)) {
//                    str2 += str.charAt(i);
//                } else str2 += "-" + str.charAt(i);
//
//            }
//            return str2;
//        }

//////////////////////////
//    public static void sortingSegments(String s) {
//        String newS = "";
//
//        for (int i = 0; i < s.length() - 1; i++) {
//            while (i != s.length() - 1) {
//                if (Character.isDigit(s.charAt(i)) && Character.isDigit(s.charAt(i + 1)) ||
//                        Character.isAlphabetic(s.charAt(i)) && Character.isAlphabetic(s.charAt(i + 1))) {
//                    newS += s.charAt(i);
//                } else {
//                    newS += s.charAt(i) + "-";
//                }
//                i++;
//            }
//            newS += s.charAt(i);
//        }
//
//        String[] list = newS.split("-");
//
//        for (String c : list) {
//            char[] clist = c.toCharArray();
//            Arrays.sort(clist);
//            System.out.print(clist);
//        }
//    }

    public static void main(String[] args) {

        String str = "";

        ArrayList<Character> letter = new ArrayList<Character>();
        ArrayList<Character> digit = new ArrayList<Character>();
        ArrayList<Character> total = new ArrayList<Character>();

        for (int i = 0; i < str.length(); i++) {
            if(Character.isLetter(str.charAt(i))){
                letter.add(str.charAt(i));
                Collections.sort(digit);
                total.addAll(digit);
                digit.clear();
            }else{
                digit.add(str.charAt(i));
                Collections.sort(letter);
                total.addAll(letter);
                letter.clear();
            }
            if ( i == str.length()-1){
                Collections.sort(digit);
                total.addAll(digit);
                Collections.sort(letter);
                total.addAll(letter);
            }
        }

        total.forEach(System.out::print);

    }
}

