package days.day22;

public class Variables {
    public static void main(String[] args) {
        int number = 20;
        System.out.println("number in the main method = " + number);
        number = 50;
        print100();
        printnumber();
    }

    public static void printnumber() {
        int number = 10;
        System.out.println("number in the printNumber method = " + number);
    }

    public static void print100() {
        int number = 100;
        System.out.println("number in the print100 method = " + number);
    }
    //number in the main method = 20
    //number in the print100 method = 100
    //number in the printNumber method = 10
}
