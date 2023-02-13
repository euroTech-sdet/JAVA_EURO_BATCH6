package days.day65_66;

public class FinallyKeyword {

    public static void main(String[] args) {

//        try {
//            System.out.println("Top TRY block");
//
//        } finally {
//            System.out.println("FINALLY BLOCK");
//        }
/////////////////////////////////////////////////////////////////


        System.out.println("Before TRY");
//        System.out.println(1/0);

        try {
            System.out.println("Top TRY block");
            System.out.println(1/0);

            System.out.println("Last line TRY block");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("INSIDE CATCH BLOCK");
        } finally {
            System.out.println("FINALLY BLOCK");
            System.out.println("CLOSE DB CONNECTION!!");
        }

        System.out.println("After TRY");
    }
}
