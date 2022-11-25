package days.day23;

public class Methods {
    public static void main(String[] args) {
//        System.out.println("main method");
//        printRonaldo();
//        System.out.println("end of main method");
//        printMessi();
//        printName("Pele");
        printNumber(50);
        int no = 100;
        printNumber(no);// we pass value

        //number = 50
        //number = 52
        //number = 100
        //number = 102




    }

    //main method
    //Ronaldo
    //end of main method
    public static void printName(String name) {
        System.out.println("name = " + name);
    }

    public static void printNumber(int number) {
        System.out.println("number = " + number);
        number += 2;
        System.out.println("number = " + number);
    }

    public static void printRonaldo() {
        System.out.println("Ronaldo");
    }

    public static void printMessi() {
        System.out.println("Messi");
    }
}
