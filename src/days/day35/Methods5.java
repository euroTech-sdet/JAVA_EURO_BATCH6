package days.day35;

public class Methods5 {
    public static void main(String[] args) {
        String str = "LIFE IS BEATIFUL.";
        System.out.println(str.toLowerCase());
        System.out.println("str = " + str);
        String s = str.toLowerCase();
        System.out.println("s = " + s);
        System.out.println("s.toUpperCase() = " + s.toUpperCase());
        System.out.println("s = " + s);
        System.out.println(s.startsWith("life"));
        System.out.println(s.startsWith("LIFE".toLowerCase()));//life
        System.out.println(str.substring(0, 4).toLowerCase());
        "LIFE".toLowerCase();
        System.out.println("Hello"+ "   life   "+"Hello");
        System.out.println("Hello"+ "   life    ".trim()+"Hello");
        System.out.println("".isEmpty());
        System.out.println("hello".isEmpty());


    }
}
