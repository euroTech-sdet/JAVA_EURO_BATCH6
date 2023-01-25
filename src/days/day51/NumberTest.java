package days.day51;

public class NumberTest {
    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        System.out.println("numbers.str = " + numbers.str);
        System.out.println("numbers.getNumber() = " + numbers.getNumber());
        numbers.setNumberTen(100);
        System.out.println("numbers.getNumberTen() = " + numbers.getNumberTen());
    }
}
