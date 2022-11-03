package days.day9;

public class RelationalOperators2 {
    public static void main(String[] args) {
        int i = 20;
        int l = 30;
        System.out.println(i == l);       //   20 == 30
        System.out.println(i == 30);// == not an assignment
        System.out.println("i = " + i);//
        System.out.println(i != 20);// meaning of this statement  i is not equals to 20 but result is false
        System.out.println(i == 20);// meaning of this statement i equals to 20  and result true
        System.out.println(i > l);// i is greater than l -->     20 > 30 ---> false
        System.out.println(i >= l);
        System.out.println(i < l);// 20 < 30 ---> true
        System.out.println("i<=l = " + (i <= l));
        String str = "i<=l = " + (i <= l);
        //           i<=l = true
        System.out.println( str);
    }
}
