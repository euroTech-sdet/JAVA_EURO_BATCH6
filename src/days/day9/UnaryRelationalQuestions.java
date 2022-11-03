package days.day9;

public class UnaryRelationalQuestions {
    public static void main(String[] args) {
        int max;
        int min = 10;
        max = 17 - 4 / 10;   //   17
        max = max + 6;  //    17 + 6
        min = max - min;   //  23 - 10 min=13
        System.out.println(max * 2);//   23 * 2 46
        System.out.println(max + min);// 23 + 13 = 36
        System.out.println("max = " + max);// 23
        System.out.println("min = " + min);// 13
//        max?  min?
//====================================
        int z = 27;
        System.out.println("z mod 5== " + z % 5);// 27 / 5 remainder is 2
//        -------------------------------------------
        boolean result = false;
        int b = 10;
        int c = 20;

        result = c > b;// assign true 20 > 10

        //negate the value using ! unary operator

        System.out.println(!result);// ! will convert the boolean result
        //=======================================
        z = 50;
        int y = 9;
        int x = 20;

        // Using Compound Assignment Operators
        z += 25;// 50 + 25 ===> 75
        y %= 4; //  y= 9 % 4 =====> 1
        System.out.println("z = " + z);
        System.out.println("y = " + y);
//        =============================================
        int val1 = 10;
        int val2 = 20;
        int val3 = 30;
        int val4 = 40;

        int result1, result2, result3, result4;// declaration

        // Increment operator
        result1 = ++val1;//   result1  is 11
        result2 = val2++;// result2 is  20
        System.out.println("result2 = " + result2);// 20
        System.out.println("val2 = " + val2);// 21
        // Decrement operator
        result3 = --val3;//  29
        result4 = val4--;//
        System.out.println("result3 = " + result3);// 29
        System.out.println("result4 = " + result4);// 40
        System.out.println("val3 = " + val3);//29
        System.out.println("val4 = " + val4);// 39




        int a = 20;

        System.out.println(65 + a++);
        System.out.println("a = " + a);
        System.out.println("a-- = " + a--);
        System.out.println("a = " + a);// a is 20
        System.out.println("--a = " + --a);// 19
        System.out.println("++a = " + ++a);// 20

        a = 10;

        System.out.println("a is =" + a++ + a++ + a++ + a++);
        x = 3;
        y = ++x * 5 / x-- + --x;
        //      5 + 2
        System.out.println("x = " + x);
        System.out.println("y = " + y);


    }
}
