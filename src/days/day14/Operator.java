package days.day14;

public class Operator {
    public static void main(String[] args) {
        //
        char sign = '+';
        switch (sign) {  // char byte short int String accepted
            case '*':
                System.out.println("multiplication");
                break;
            case '/':
                System.out.println("division");
                break;
            case '+':
                System.out.println("addition");
        }
        System.out.println("out of block");


    }
}
