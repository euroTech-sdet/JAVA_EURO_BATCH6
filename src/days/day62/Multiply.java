package days.day62;

public class Multiply {

    public int multiply(int a, int b) {
        System.out.println(a * b);
        return a * b;
    }

    void multiply(int a, int b, int c) {
        System.out.println(a * b);
    }

    public void multiply(int... numbers) {
        System.out.println(numbers[0]);
        int result = numbers[0];
        for (int num : numbers) {
            result = num * result;
            System.out.println("num = " + num);
        }
        System.out.println("result = " + result);
    }

    void multiply(String str) {
        System.out.println("overloading");
    }
}

class Test {
    public static void main(String[] args) {
        Multiply multiply = new Multiply();
        multiply.multiply(10, 5);
        multiply.multiply(1, 2, 3, 5);
        multiply.multiply("");
    }
}
