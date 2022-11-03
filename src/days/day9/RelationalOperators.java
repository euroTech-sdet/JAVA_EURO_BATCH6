package days.day9;

public class RelationalOperators {
    public static void main(String[] args) {
        int a = 10;// = is used for assignment
        System.out.println(a == 10);// return boolean value
        System.out.println(a == 100);
        int b = 20;
        System.out.println(a == b);
        //                 10   20

        System.out.println(a != b);
        b = 10;
        a = 10;
        boolean aIsNotEqualsTob = a != b;
        System.out.println("aIsNotEqualsTob = " + aIsNotEqualsTob);

        System.out.println(" a > b " + (a > b));
        System.out.println("a<b = " + (a < b));
        System.out.println("a>=b = " + (a >= b));
        System.out.println("a<=b = " + (a <= b));
    }
}
