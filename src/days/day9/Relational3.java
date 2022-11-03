package days.day9;

public class Relational3 {
    public static void main(String[] args) {
        int num1 = 12, num2 = 4;
//is equal to
        System.out.println("num1 == num2 = " + (num1 == num2));// 12 == 4
//is not equal to
        System.out.println("num1 != num2 = " + (num1 != num2));
////Greater than
        System.out.println("num1 > num2 = " + (num1 > num2));
////Less than
        System.out.println("num1 < num2 = " + (num1 < num2));
////Greater than or equal to
        num1 = 10;
        num2 = 10;
        System.out.println("num1 >= num2 = " + (num1 >= num2));
////Less than or equal to
        System.out.println("num1 <= num2 = " + (num1 <= num2) );
    }
}
