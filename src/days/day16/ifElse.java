package days.day16;

public class ifElse {
    public static void main(String[] args) {
        int number = 10;
        boolean result = true;
        result = number > 10;
        if (result) {
            System.out.println("number is bigger then 10");
        }

        if (number % 2 == 0) {
            System.out.println("dividable");
        } else {
            System.out.println("remaining = " + number % 2);
        }

        if (number % 2 == 0) {
            System.out.println("number%2==0");
        } else if (number % 3 == 0) {

        } else if (number % 5 == 0) {
            System.out.println("number % 5== 0");
        } else {
            System.out.println("we couldnt divide the number");
        }
        number = 35;

        if (number > 10) {
            System.out.println("number is bigger than 10");
        } else if (number > 20) {
            System.out.println("number is bigger than 20");
        } else if (number > 30) {
            System.out.println("number is bigger than 30");
        } else if (number > 40) {
            System.out.println("number is bigger than 40");
        } else {
            System.out.println("number is smaller than 40 -30 -20 -10");
        }
        number = 35;
        if (number > 10) {
            System.out.println("number is bigger than 10");
        }
        if (number > 20) {
            System.out.println("number is bigger than 20");
        }
        if (number > 30) {
            System.out.println("number is bigger than 30");
        }
        if (number > 40) {
            System.out.println("number is bigger than 40");
        }
        number = 9;

        if (number % 2 == 0) {
            System.out.println("number is dividable to 2");
            if (number % 3 == 0) {
                System.out.println("comes from nested if block and number can be dividable to 6");
            }
            if (number % 5 == 0) {
                System.out.println("number is dividable to 10");
            }
            System.out.println("end of outer if block");
        }
        System.out.println("we are out of nested if blocks");
        if (number % 2 == 0 && number % 3 == 0) {
            System.out.println("number can be dividable to 6");
        }
        int a = 210;
        int b = 120;
        int c = 30;
        // biggest number
        int biggest = 0;
        if (a > b) {
            if (a > c) {
                biggest = a;
            }
            System.out.println("a is the biggest number");
        } else if (b > c) {
            biggest = b;
            System.out.println("b is the biggest number");
        } else {
            if (biggest > 0) {
                System.out.println("biggest");
            }
            biggest = c;
            System.out.println("c is the biggest number");
        }
        biggest = a;
        if (b > biggest) {
            biggest = b;
        }
        if (c > biggest) {
            biggest = c;
        }
        System.out.println("biggest = " + biggest);


    }
}
