package days.day40;

public class SampleWrapperMethods {


    public static void main(String[] args) {

        String password = "123ABC+";

        // there should be at least  1 number
        // there should be at least  1 letter
        // there should be at least  1 character/symbol


        String[] split = password.split("");
        System.out.println("Character.isDigit(1) = " + Character.isDigit(1));
        System.out.println("Character.isAlphabetic('a') = " + Character.isAlphabetic('ü'));
        System.out.println("Character.isLetter('a') = " + Character.isLetter('ü'));


        /////


        Integer intObj = 4;

        Double doubleObj =4.0;
//
//        Boolean bObj;
//
//        System.out.println("(bObj instanceof Boolean) = " + (bObj instanceof Boolean));


        System.out.println("intObj instanceof Integer = " + (intObj instanceof Integer));

        System.out.println("(doubleObj instanceof Double) = " + (doubleObj instanceof Double));


    }


    public void test(String test){

        Integer tt = Integer.valueOf(test);

        System.out.println(" = " + (tt instanceof Integer));


    }
}
