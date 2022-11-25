package days.day23;

public class HelloName {
    public static void main(String[] args) {

//        Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
//
//
//                helloName("Bob") → "Hello Bob!"
//        helloName("Alice") → "Hello Alice!"
//        helloName("X") → "Hello X!"
        String helloAli = helloName("Ali");
        System.out.println(helloName("Jordan"));
        System.out.println("helloAli = " + helloAli);
        String helloMichael = helloName("Michael");
        System.out.println("helloMichael = " + helloMichael);
    }

    public static String helloName(String name) {
        String sayHello = "Hello " + name;
        // return "Hello "+name+"!";
        return sayHello;
        //  System.out.println("");//unreacheable statement
    }
}
