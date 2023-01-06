package days.day43;

import days.day30.Student;

import java.util.ArrayList;

public class WrapperClasses {
    public static void main(String[] args) {
        //   byte short int long float double boolean char
        Byte b;
        Short s;
        Integer i;
        Long l;
        Float f;
        Double d;
        Boolean b1;
        Character c;
        ArrayList<Integer> numbers = new ArrayList<>();
        Student student = new Student();

        String str = "Oslo";
        String city = new String("Munich");
        Integer num2 = 100;
        Integer number1 = Integer.valueOf(50);
        String str2 = "200";
        int num5 = Integer.valueOf(str2);// converting string to integer
        System.out.println("num5 = " + num5);
        String str3 = "500";
        int i1 = Integer.parseInt(str3);// converting string to integer
        System.out.println("i1 = " + i1);
        String str4 = " 1001 ";
        int i2 = Integer.parseInt(str4.trim());
        System.out.println("i2 = " + i2);
        String str5 = "50.55";
        double aDouble = Double.valueOf(str5);
        System.out.println("aDouble = " + aDouble);
        double d5 = Double.parseDouble(str5);
        System.out.println("d5 = " + d5);
        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        int num9 = 2147483647;
        System.out.println("Byte.MAX_VALUE = " + Byte.MAX_VALUE);
        double d6 = 50.50;
        Double d55 = d6;// autoboxing   primitive----->object
        double d7 = d55;//autounboxing  object--->primitive data

    }
}
