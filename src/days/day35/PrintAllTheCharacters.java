package days.day35;

public class PrintAllTheCharacters {
    public static void main(String[] args) {
        String str = "Hello World";
        //H
        //e
        //l
        //l
        //o
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
        str.charAt(0);
        str.charAt(1);
        str.charAt(2);
        str.charAt(3);
        str.charAt(4);
        System.out.println("str.length() = " + str.length());
        for (int i = 0; i < str.length(); i++) {
            System.out.println("str.charAt(i) = " + str.charAt(i));
        }

    }
}
