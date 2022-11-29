package days.day25;

public class MainMethod {
    public static void main(String[] args) {
        System.out.println("in the real main method::))");
        main("Hello");

    }

    static void main(String str) {// possible with the different parameters
        System.out.println("overloaded main method");
    }

//    static int main(String[] a) { not possible with the same parameters
//
//        return 5;
//    }


}
