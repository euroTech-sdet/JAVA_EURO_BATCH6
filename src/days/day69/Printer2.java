package days.day69;

public class Printer2 {
    public static void main(String[] args) {
        Printer print = new Printer();
        print.greeting();
        Print printer = () -> System.out.println("hi guys.");
        printer.greeting();
        Addition addition = (a, b) -> System.out.println(a + b);
        addition.add(10, 20);
        SayHi sayHi = (name) -> System.out.println("Hello " + name);
        sayHi.sayHi("Ali");
        sayHi.sayHi("Ahmet");


    }


}




