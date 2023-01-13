package days.day47;

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
            //        abcabcabc
            //       uniqe=abc
            if (!uniqe.contains("" + str.charAt(i))) {
                uniqe = uniqe + str.charAt(i);
                System.out.println(str.charAt(i) + " is present in the string  " + (count + 1) + " times.");
            }
//            a is present in the string 2 times
            count = 0;
        }
    }
}
