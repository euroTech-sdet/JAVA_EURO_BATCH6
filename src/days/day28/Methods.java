package days.day28;

public class Methods {
    public static int sayHello(int age, String name) {
        System.out.println("age = " + age);
        return 10;
    }

    public static String sayHello(String name1, int age1) {
        System.out.println("age1 = " + age1);
        return name1 + " is " + (age1 + 10) + " years old.";
        //      Faruk    is    60 years old
    }

    public static void main(String[] args) {
        String farukAge = sayHello("Faruk", 50);
        System.out.println("farukAge = " + farukAge);
        String mehmetAge = sayHello("Mehmet", 40);
        System.out.println("mehmetAge = " + mehmetAge);
        //  Faruk        5010 years old

//        printNumbers();
//        printNumbers();
//        printNumbers();

        sayHello();
        System.out.println("main");
        sayHello();
        sayHello("Veli");
        sayHello("Ali");
        String surname = "Jordan";
        sayHello(surname);
        int number = sayHello(30, "Stephen Curry");
        System.out.println("number = " + number);
        int number2 = sayHello(40, "Ronaldo");
        System.out.println("number2 = " + number2);


    }


    public static void sayHello() {
        System.out.println("hello");
    }
    //access modifiers

    static void sayHello(String name) {
        System.out.println("name = " + name);
        System.out.println("hello ");
    }

    // addition and multiplication operation in just method

    public static void printNumbers() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }


}
