package days.day22;

public class Print {
    public static void main(String[] args) {

      //   printName(); not possible calling non static method inside a static method by method name
    }

    public void printName() {
        sayHello();
        System.out.println("Ronaldo");
    }

    public void sayHello() {
        System.out.println("Hello");
    }
}
