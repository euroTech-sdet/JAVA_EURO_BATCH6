package days.day40;

public class ConvertWrappers {


    public static void main(String[] args) {

        int a = 3;
        Integer intObj = new Integer(3);

        System.out.println(a == intObj);
        int intPrim = intObj.intValue();

        Double doubleObj = Double.valueOf(1.5);
        int dToint= doubleObj.intValue();  // (int)doubleObj.doubleValue();

        System.out.println("dToint = " + dToint);


        /////////////////////////////////

        int value = 2;
        Integer intObj2 = value;  // --> Autoboxing!!!

        int value2 = intObj2; // --> Unboxing!!!



        ///////////////////////////////


        Integer obj1 = Integer.valueOf("2");

        int obj2 = Integer.parseInt("2");    // --> Autoboxing!!!



        int num = 1;
        String str= "" + num;
        System.out.println("str = " + str);


       str= String.valueOf(num);

        System.out.println("str = " + str);



    }
}
