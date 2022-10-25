package days.day5;

public class StringSample2 {


    public static void main(String[] args) {

        int num1= 10;
        int num2= 20;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        int num3 = num1 + num2;

        System.out.println("num3 = " + num3);

        String printResult = "num3 = " + num3;  // String Concatenation
        System.out.println(printResult);


        String str1 = "Hello";
        String str2 = "Java";

        System.out.println(str1 + str2);

        // Hello Java
        System.out.println(str1 + " " + str2);

        boolean flagResult= true;

        // 'Hello Java' is true
        System.out.println( "'" + str1 + " " + str2 + "' is " + flagResult );

        num1 = 11;
        num2 = 33;
       // int sum = num1+num2;

        // 33+22=55
        System.out.println( num1 + "+" + num2 + "=" + (num1 + num2) );
    }
}