package days.day37;


import java.util.Arrays;

public class Arrays1 {
    public static void main(String[] args) {
        // byte short int long float double char boolean   primitive data types
        // non primitive String
        int number = 50;
        double number2 = 10.50;
        number = 100;// 50 100 200

        int numbers[] = new int[5];// each member of the array is an element
        //            0   1   2   3   4
        numbers[0] = 15;
        numbers[1] = 25;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        System.out.println("numbers[3] = " + numbers[3]);
        numbers[3] = 100;
        System.out.println("numbers[3] = " + numbers[3]);

        int sum = 100;
        System.out.println("sum = " + sum);
        System.out.println("numbers[4] = " + numbers[4]);
        System.out.println("numbers = " + numbers);
        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));
        String numbersString = Arrays.toString(numbers);



    }
}
