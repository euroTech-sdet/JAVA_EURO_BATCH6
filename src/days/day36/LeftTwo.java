package days.day36;

public class LeftTwo {
    //    Given a string, return a "rotated left 2" version
//    where the first 2 chars are moved to the end. The string length will be at least 2.
//
//
//    left2("Hello") → "lloHe"
//    left2("java") → "vaja"
//    left2("Hi") → "Hi"
    public static void main(String[] args) {
        String str = "Hello";// lloHe
        //            01234
        System.out.println(str.substring(2));
        String after2 = str.substring(2);
        String first2 = str.substring(0, 2);
        System.out.println(after2.concat(first2));


    }
}
