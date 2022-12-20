package days.day36;

public class DuplicatedLetters {
    public static void main(String[] args) {
        String str = "abcabcabcdefdefdefaabbcczzzzzllll";
        // uniqe   =  abc


        //          abcdef
        String uniqe = "";

        for (int i = 0; i < str.length(); i++) {
//            System.out.println(str.charAt(i));
            if (!uniqe.contains("" + str.charAt(i))) {
                uniqe = uniqe + str.charAt(i);
            }
        }
        System.out.println("uniqe = " + uniqe);

    }
}
