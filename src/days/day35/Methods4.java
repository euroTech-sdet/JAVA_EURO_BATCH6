package days.day35;

public class Methods4 {
    public static void main(String[] args) {
        String str = "Life is beatiful.";
        //          01234567890123456
        //          0123
        System.out.println(str.substring(0, 4));
        String life = "Life";
        life = str.substring(0, 4);
        System.out.println(str.substring(4));
        System.out.println(str.substring(8));
        System.out.println("str.substring(0,10) = " + str.substring(0, 10));
        str = "Oslo";
        //     0123
        System.out.println("str.length() = " + str.length());
        System.out.println(str.substring(str.length() - 2));// last two letters
        //last 9 letters
        System.out.println("str.substring(2) = " + str.substring(str.length() - 2));
        str = "Keep studying";
        System.out.println( str.substring(str.length() - 8));


    }
}
