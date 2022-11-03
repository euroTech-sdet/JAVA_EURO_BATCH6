package days.day9;

public class UnaryQuestions {
    public static void main(String[] args) {
        int n = 5;
        int i = n--; //-- decrement value of variable n by 1
        int a = --n;
        System.out.println("a = " + a);
        System.out.println("i = " + i);// 5
        System.out.println(n);// 3
        System.out.println(--n);// 2
        System.out.println("n = " + n);// 2
//        ------------------------------------
        int no = 5;
        int n2 = -20000;
        n2 = no++;

        System.out.println("n2 = " + n2);// 5
        System.out.println("no = " + no);// 6
//        =======================================
        i = 3;
        i++;
        System.out.println(i);// 4
        ++i;
        System.out.println(i);// 5
        System.out.println(++i);// 6
        System.out.println(i++);// 6
        System.out.println(i);//7

//        =================================================

        int x = 3;
        int y = ++x * 5 / x-- + --x;// operators predence   */ +

//=========================================
        int b, c;
        a = b = c = 5;

        int result = a + b++ + ++c;
        //           5    5     6
        System.out.println("result = " + result);// 16
        System.out.println("a = " + a);//5
        System.out.println("b = " + b);//6
        System.out.println("c = " + c);//6




    }
}
