package days.day56;

public class CodilityTaskRecursion {
    public static void main(String[] args) {
        String str = "xpipxip";  //--> x3.14pxip  -> x
        //"pipxip" --> 3.14pxip
    }

    public static String changePi(String str) {

        // check that str size is bigger than 1  ( > 1 )
        if (str.length() <= 1) {
            return str;
        }

        // if first char is 'p' than check upcoming one is 'i'
        // if both true then push 3.14 and call method again with +2 index!!
        if (str.charAt(0) == 'p' && str.charAt(1) == 'i') { // check n + n+1
            return "3.14" + changePi(str.substring(2));
        }

        // what if first char not p!! then push this char and call method again with +1 index!!
        return str.charAt(0) + changePi(str.substring(1));

    }

}



