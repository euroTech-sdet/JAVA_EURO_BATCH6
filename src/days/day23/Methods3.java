package days.day23;

public class Methods3 {
    public static void main(String[] args) {

        // sumOfTheNumbers();
        sumOfNumbers(0, 10);
        sumOfNumbers(10, 50);
        sumOfNumbers(60, 80);
        sumOfNumbers(0, 100);
        // greaterNumber   2 parameters int
        greaterNumber(10, 20);
    }

    public static void greaterNumber(int a, int b) {
        if (a > b) {
            System.out.println(a + " is greater than " + b);
        } else if (a < b) {
            System.out.println(b + " is greater than " + a);
        } else {
            System.out.println(a + " is equals to " + b);
        }
    }

    public static void sumOfNumbers(int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += i;// sum = sum + i
        }
        System.out.println("sum of the numbers between " + start + " and " + end + " = " + sum);
    }

    public static void sumOfTheNumbers() {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;// sum = sum + i
        }
        System.out.println("sum = " + sum);
    }
}
