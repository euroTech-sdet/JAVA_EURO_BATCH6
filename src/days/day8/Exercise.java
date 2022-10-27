package days.day8;

public class Exercise {
    public static void main(String[] args) {
//        "2 + 2 " + 3 + 4  ----->   2 + 2 34
//        2 + " 2 + 3 " + 4
//        3 + 4 + " 2 + 2"
//        "2 + 2 " + (3 + 4)
//        "(2 + 2) " + (3 + 4)
//        "hello 34 " + 2 * 4
//        2 + "(int) 2.0" + 2 * 2 + 2             ----->
//         2 + "(int) 2.0" + 4 + 2  ----->       2(int) 2.042
//        int + string ---> string

//        4 + 1 + 9 + "." + (-3 + 10) + 11 / 3
//          +   +   +     + () +  /
//        4+1+9+"."+       7+  11/3
//        4+1+9+"."+       7+ 3
//        14+"."+7+3
//        int + string +
//        "14."+7+3
//        "14.7"+3
//        14.73----->string
        System.out.println(4 + 1 + 9 + "." + (-3 + 10) + 11 / 3);

//        8 + 6 * -2 + 4 + "0" + (2 + 5)
//        1 + 1 + "8 - 2" + (8 - 2) + 1 + 1
//        5 + 2 + "(1 + 1)" + 4 + 2 * 3
//        "1" + 2 + 3 + "4" + 5 * 6 + "7" + (8 + 9)
        System.out.println(2 + "(int) 2.0" + 4 + 2);

        int a = 10;
        int b = 20;
        System.out.println(a + b);// int + int ----> int
        String str = "Hello";
        System.out.println(a + str);// concatenation 10Hello
        //  5 + 2 + "(1 + 1)" + 4 + 2 * 3
//           +    +           +   +   *
//          5  + 2  +  "(1 + 1)" + 4 +   6
//            7    +   "(1 + 1)" + 4 +   6
//        int     +  string
//          "7(1+1)"  + 4 + 6
//         string      int
//        "7(1+1)4" + 6
//          string  + int
//        7(1+1)46
        System.out.println(5 + 2 + "(1 + 1)" + 4 + 2 * 3);
        System.out.println(2 * 3 + "(int) 2.0" + 4 + 2);
//                           6(int) 2.042

    }
}
