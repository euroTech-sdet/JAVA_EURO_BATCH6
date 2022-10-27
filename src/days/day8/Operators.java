package days.day8;

public class Operators {
    public static void main(String[] args) {
        // + - / *  %
//        %------> reaminder
        System.out.println("10%4 = " + 10 % 4);// 4  +  4 + 2 --->
        System.out.println("19%2 = " + 19 % 2);// if the result is 1 19 is odd number

        System.out.println("" + 19 % 2 + 22);// precedence  %*/  + -
//                         "" +   1   + 22  left to right
//                          "1"      + 22    string + int ----> concatenation
//                            "122"------->  result type will be string

    }
}
