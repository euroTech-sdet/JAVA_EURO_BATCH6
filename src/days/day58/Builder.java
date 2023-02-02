package days.day58;

import java.util.ArrayList;

public class Builder {
    public static void main(String[] args) {
        String str = "Hello";
        String str2 = new String("Hello");
        StringBuilder builder = new StringBuilder("Hello");
        System.out.println("builder = " + builder);
        System.out.println("str = " + str);
        System.out.println("str.toLowerCase() = " + str.toLowerCase());
        System.out.println("str = " + str);
        builder.append(" Java");
        System.out.println("builder = " + builder);//Hello JAva
        //                                           0123456789
        builder.delete(5, 7);
        System.out.println("builder = " + builder);
        builder.reverse();
        System.out.println("builder = " + builder);
        StringBuilder builder1 = new StringBuilder("String");
        builder1 = new StringBuilder(str);
        builder1.insert(2, "000000");
        System.out.println("builder1 = " + builder1);
        str = String.valueOf(builder1.reverse());


        StringBuilder build = new StringBuilder("Java");
        build.reverse();
        String reversed = String.valueOf(build);
        StringBuilder builder2 = new StringBuilder(reversed);
        System.out.println("builder2 = " + builder2);
        ArrayList<StringBuilder> listOfBuilder = new ArrayList<>();
        listOfBuilder.add(builder2);
        listOfBuilder.get(0).reverse();
        System.out.println("listOfBuilder.get(0) = " + listOfBuilder.get(0));
        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        listOfNumbers.add(50);
        listOfNumbers.add(100);
        listOfNumbers.add(500);
        String reversed2 = SomeMethods.reverseString("Hello");
        System.out.println("reversed2 = " + reversed2);
        System.out.println(SomeMethods.reverseString("Java"));
        System.out.println(SomeMethods.reverseString(reversed2));
        SomeMethods someMethods = new SomeMethods();
        String str5 = someMethods.reverseString2("Hello Java");
        System.out.println("str5 = " + str5);
        String str6 = someMethods.reverseString2("Hello again", 1);
        System.out.println("str6 = " + str6);




    }
}
