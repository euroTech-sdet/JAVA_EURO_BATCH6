package days.day17;

public class MultiplicationTable {
    public static void main(String[] args) {

        int number = 9;
        // 7 * 1= 7
        // 7 * 2= 14
        // 7 * 3 = 21
        //.....
        // 7 * 10 = 70
        // 1-10

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + number * i);// 1 2 3 4    9 10
        }




    }
}
