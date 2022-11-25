package days.day23;

public class Sum {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println("sum = " + sum);
        a = 5;
        b = 8;
        sum = a + b;
        System.out.println("sum = " + sum);
        a = 15;
        b = 25;
        sum = a + b;
        System.out.println("sum = " + sum);
        sumOfTheNumbers(50, 100);
        sumOfTheNumbers(10, 20);
        int sumOf5And8 = sumOfTheNumbers(5, 8);
        System.out.println("sumOf5And8 = " + sumOf5And8);
    }

    public static int sumOfTheNumbers(int number1, int number2) {
        int sum = number1 + number2;
        System.out.println("sum = " + sum);
        return sum;
    }
}
