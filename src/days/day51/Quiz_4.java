package days.day51;

import java.util.Arrays;

public class Quiz_4 {
    public static void main(String[] args) {
        String x = " 10";
        String y = "20 ";
        String a = "50";
        String str = x.concat(y).trim().substring(0, 3);
        System.out.println("str.trim() = " + "a" + str.trim());
        System.out.println("str =" + str);
        System.out.println("str =" + str.trim());
        System.out.println(x.equals(y));
        boolean equals = x.equals(a);
//        x==y   ---->adress in the heap
        str = "Hello World";
        //   01234567890
        //      lo World
        //
        //   01234   ----->length is 5
        System.out.println("x.length() = " + x.length());
        System.out.println("str.substring(3) = " + str.substring(3));
        System.out.println("str.substring(3,6) = " + str.substring(3, 6));//lo
//        str="Hello World";
        //     01234567890
        System.out.println("str.substring(0,5) = " + str.substring(0, 5));//Hello
        System.out.println("str.substring(6) = " + str.substring(6));//World
        str = "Hello World World World";
        //     0123456789012345678
        System.out.println("str.indexOf() = " + str.indexOf("World"));
        System.out.println("str.lastIndexOf(\"World\") = " + str.lastIndexOf("World"));
        System.out.println(str.lastIndexOf("World", 17));
        int last = str.lastIndexOf("World");
        System.out.println("str.lastIndexOf(\"World\",last) = " + str.lastIndexOf("World", last - 1));

        int[] numbers = {1, 2, 5, 6, 7, 8, 9};
        //               0  1  2  3  4  5 6
        String[] colors = new String[10];
        colors[0] = "Green";
        colors[9] = "Brown";
        System.out.println("numbers.length = " + numbers.length);
        System.out.println("str.length() = " + str.length());
        System.out.println("numbers[5] = " + numbers[6]);
        System.out.println("numbers[numbers.length-1] = " + numbers[numbers.length - 1]);

        int numbers5[][] = new int[3][5];
        int number10[][] = {
                {1, 2, 3},//  index number is 0   first row
                {4, 5, 6},//  index number is 1   second row
                // 0  1  2
                {7, 8, 9}, //  index number is 2 third row column is 3
                {10, 11, 12}//   index number is 3 fourth row column is 3
        };
        System.out.println("number10[1][2] = " + number10[1][2]);

        //  7 8 9
        System.out.println("number10[2][2] = " + number10[2][2]);
        System.out.println("Arrays.toString(number10[2]) = " + Arrays.toString(number10[2]));
        System.out.println("Arrays.toString(number10[0]) = " + Arrays.toString(number10[0]));// 1 2 3
        System.out.println("Arrays.deepToString(number10) = " + Arrays.deepToString(number10));
        boolean[] results = new boolean[3];
        System.out.println("Arrays.toString(results) = " + Arrays.toString(results));


    }
}
