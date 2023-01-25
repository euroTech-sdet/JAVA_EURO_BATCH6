package days.day52;

public class ABCTest {
    public static void main(String[] args) {
        A a = new A(10);
        a.number = 10;
        a.city = "London";
        a.print();
        B b = new B(20);
        b.number = 20;
        C c = new C(30);
        c.city = "Oslo";
        c.getResult();

    }
}
