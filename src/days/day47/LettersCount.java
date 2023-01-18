package days.day47;

import java.util.ArrayList;

public class LettersCount {
    public static void main(String[] args) {
        String str = "abchelloaaahelloWorldabc";//      llohello
        //            a   bchellohelloWorldabc    ---> a is present in the string 2 times
        //            c   hellohelloWorldabc
        //            h   ellohelloWorldabc
        //    a---->    times in the string
        //    h --->    times in the string
        //    e ---->   times in the string
        int count = 0;
        String uniqe = "";
        for (int i = 0; i < str.length(); i++) {
//            System.out.println("str.charAt(i) = " + str.charAt(i));
            for (int n = i + 1; n < str.length(); n++) {
                if (str.charAt(i) == str.charAt(n)) {
                    count++;
                }
            }

            if (!uniqe.contains("" + str.charAt(i))) {
                uniqe = uniqe + str.charAt(i);
                System.out.println(str.charAt(i) + " is present in the string  " + (count + 1) + " times.");
            }
            count = 0;
        }
        countLetters("abcabcdeee");
    }


    public static ArrayList<String> countLetters(String str) {
        int count = 0;
        String uniqe = "";
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            count = 0;
            if (!uniqe.contains("" + str.charAt(i))) {
                uniqe = uniqe + str.charAt(i);
                for (int n = i + 1; n < str.length(); n++) {
                    if (str.charAt(i) == str.charAt(n))
                        count++;
                }
            } else {
                continue;
            }
            result.add(str.charAt(i) + " is present in the string " + (count + 1) + " times.");
        }
        result.forEach(System.out::println);
        return result;
    }
}