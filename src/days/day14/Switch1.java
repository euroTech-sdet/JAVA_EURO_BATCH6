package days.day14;

public class Switch1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        boolean result = a > b;
        if (result) {
            System.out.println("a is greater than b.");
        } else {
            System.out.println("b is greater than a.");
        }
        b = 20;
        a = 50;
        switch (a) {      // char byte short int String
            case 20:
                System.out.println("a value is 20");
                System.out.println(20);
                b = 4;
                break;
            case 15:
                System.out.println("a value is 15");
                b = 5;
                break;
            case 5:
                System.out.println("a value is 5");
                b = 6;
                break;
            case 10:
                System.out.println("a value is 10.");
                b = 7;
                break;// optional
            default:// optional
                System.out.println("neither of the values match with the a value.");
        }
        System.out.println("out of switch block.");
        System.out.println("b = " + b);
    }
}
