package days.day6;

public class Expression {

    public static void main(String[] args) {
//    "2 + 2 " + 3 + 4       "2+2 3"+4  2+2 34
        System.out.println("2 + 2 " + 3 + 4);
//        2 + " 2 + 3 " + 4    2 2 + 3 4
        System.out.println(2 + " 2 + 3 " + 4);
//        3 + 4 + " 2 + 2"     7 2 + 2
        System.out.println(3 + 4 + " 2 + 2");
//        "2 + 2 " + (3 + 4)  2 + 2 7
        System.out.println("2 + 2 " + (3 + 4));
//        "(2 + 2) " + (3 + 4)  --->  (2 + 2) 7
        System.out.println("(2 + 2) " + (3 + 4));
//        "hello 34 " + 2 * 4  -->   hello 34 8
        System.out.println("hello 34 " + 2 * 4);

    }

}
