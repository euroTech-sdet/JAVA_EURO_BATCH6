package days.day36;

public class RightTwo {
    public static void main(String[] args) {

//        Given a string, return a "rotated right 2" version
//        where the last 2 chars are moved to the start. The string length will be at least 2.
//
//
//        right2("Hello") → "loHel"
//        right2("java") → "vaja"
//        right2("Hi") → "Hi"
        String str = "Hello";
        //            01234
        System.out.println(str.length());
        System.out.println(str.substring(3));
        System.out.println(str.substring(str.length() - 2));
        String lastTwo = str.substring(str.length() - 2);
        System.out.println(str.substring(0, 3));// length-2=3
        System.out.println(str.substring(0, str.length() - 2));
        String tilastTwo = str.substring(0, str.length() - 2);
        System.out.println(lastTwo.concat(tilastTwo));
        String son = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != 'x') {
                son = son + str.charAt(i);
            }
        }


    }
}
