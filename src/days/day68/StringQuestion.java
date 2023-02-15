package days.day68;

public class StringQuestion {

    public static void main(String[] args) {

        String a = "m";
        String b = a + "d";
        String c = "md";
        String d = "md";

        System.out.println(b == c); // false --  ??
        System.out.println(d == c); // true
        System.out.println(b.equals(c)); //true


        System.out.println("b.hashCode() = " + b.hashCode());
        System.out.println("c.hashCode() = " + c.hashCode());
        System.out.println("identityHashCode(b) = " + System.identityHashCode(b)); // -- Different!!
        System.out.println("identityHashCode(c) = " + System.identityHashCode(c)); // -- Different!!
        System.out.println("identityHashCode(d) = " + System.identityHashCode(d));

    }
}
