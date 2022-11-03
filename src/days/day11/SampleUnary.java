package days.day11;

public class SampleUnary {

    public static void main(String[] args) {


        int a = 10; // 11 12 13

        int b = a++ * ++a  / a++;
        // b= 10 * 12 / 12
        // b= 120 /12
        // b = 10;

        System.out.println("b = " + b);
    }
}
