package days.day6;

public class Concatenation {
    public static void main(String[] args) {
        System.out.println(10 + 20);
        //                 int    int --------->  int
        System.out.println(20.50 + 10);
        //                   double int ------>  double
        System.out.println(100 + "200");// 100200
//                          int    string  -------> string
        System.out.println("Hello " + "Ronaldo");
        //                  string       string   -------> string
        System.out.println("Again " + 200);
        //                  string     200  -------->  string
        System.out.println("Hello " + 100 * 2 + 5);//  Hello205  Hello2005 Hello 2005
//                          Hello   +  200 + 5
//                          "Hello 200" +5
//                          Hello 2005
        System.out.println('a' + 'b');
        //                  97    98  ------> 195
        System.out.println('a' + 'b' + "" + 'a' + 'b');
//                         97  +  98 + ""+ a+b
//                          195 +""  +
//                          195ab
        System.out.println("100" + 'a' + 200 + 300);
//                          "100a"  +200
//                            "100a200"+300
//                             100a200300
        System.out.println("100" + 'a' + 200 + 30 * 20);
//        System.out.println("Hello " + 100 * 2 - 5);
//        //                  "Hello " + 200 - 5
//        //                   "Hello 200" - 5
//       'a' + 'b';
//        definition of the string character sequence
        String str = "" + 'a' + 'b';
        System.out.println("str = " + str);
        String s = "a" + "b";

//        average of 3 numbers
        System.out.println(10 + 20 + 30 / 3);
//                          10  20     10
        System.out.println((10 + 20 + 30) / 3);

    }
}
