package days.day48;

public class NumberTest {
    public static void main(String[] args) {
        Number number = new Number(10, 20, "Hello", 55.56);
//        number.a = 10;
//        number.d = 20.22;
        System.out.println("number.getA() = " + number.getA());
        System.out.println("number.getB() = " + number.getB());
        System.out.println("number.getS() = " + number.getS());
        System.out.println("number.getD() = " + number.getD());

        Number number1 = new Number(40, 80, "Hi", 111.22);
        System.out.println("number1.getD() = " + number1.getD());
        System.out.println("number1.getS() = " + number1.getS());
        System.out.println("number1.getB() = " + number1.getB());
        System.out.println("number1.getA() = " + number1.getA());

        number.setA(50);
        System.out.println("number.getA() = " + number.getA());
        number.setB(60);
        number.setD(99.987);
        number.setS("Encapsulate");
        System.out.println("number.getS() = " + number.getS());
        System.out.println("number.getB() = " + number.getB());
        System.out.println("number.getD() = " + number.getD());


    }
}
