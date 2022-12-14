package days.day34;

public class StringPractice {

    public static void main(String[] args) {

        String name = "1dasdas21323g£$£"; // --> literal!!

        String str = "Hello";

        String str22= "JAVA";

        String str33= "JAVA";

        str33 = "Coskun Bey";

        //////////////////////////

        String newStr = new String(); // --> ""

        String newStr2 = new String("newStr2 value");

        System.out.println("newStr2 = " + newStr2);


        //////////

        StringPractice obj = new StringPractice();

        System.out.println("obj = " + obj);


        ///////////////////////////

        // Checking == with literal and new

        String str1 = "Ozdemir";
        String str2 = "Ozdemir";

        String str3 = new String("Keti");
        String str4 = new String("Keti");

        System.out.println("str1 == str2 = " + (str1 == str2)); // TRUE!!

        System.out.println("str3 == str4 = " + (str3 == str4)); // FALSE


    }
}
