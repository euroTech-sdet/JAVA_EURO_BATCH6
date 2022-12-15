package days.day35;

public class HelloName {

    //    Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
//
//
//    helloName("Bob") → "Hello Bob!"
//    helloName("Alice") → "Hello Alice!"
//    helloName("X") → "Hello X!"

    public static void main(String[] args) {
        String name = "Bob";
        String hello = "Hello";
        System.out.println(hello.concat(" " + name));
        helloName(name);
        helloName("Austine");
        helloName("Mehmet");

    }

    public static void helloName(String name) {
        String hello = "Hello";
        System.out.println(hello.concat(" " + name));
    }


}
