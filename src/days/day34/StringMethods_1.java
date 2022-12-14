package days.day34;

public class StringMethods_1 {


    public static void main(String[] args) {


        String password= "Test123_";
        String password2= "Testeweqw123_";
        String pin= "312_";

        // should contain at least 1 numeric character
        // should contain at least 1 symbol
        // should contain at least 1 _
        // should contain at least Upper Letter
        // pin must contain only numeric values!!

        // need to create verification
        // we need to check each character of string!!!

        // need a loop to check each of them
        // need to know how many char I have for loop!!!  -->> SOLUTION: length()
        // in each iteration of the loop I need call each char one by one .. or I need call specific char

      int passwordLength=  password.length(); //--> return number of chars inside string

        System.out.println("passwordLength = " + passwordLength);

        String test= "";

        System.out.println("test.length() = " + test.length());

        test= "    ";

            System.out.println("test.length() = " + test.length());

        int spaceDecimal= ' ';
        System.out.println("spaceDecimal = " + spaceDecimal);


        System.out.println("\n//////////////////   charAt()    ////////////////\n");
        // give me index take char!!!

        //   Length  123456
        String str= "String";
        //    INDEX: 012345

        // ALL INDEX starts with 0

        char zeroIndex= str.charAt(0); // I would like to see the FIRST char !!!
        System.out.println("zeroIndex = " + zeroIndex);

        str.charAt(1); //--> t
        str.charAt(2); //--> r
        str.charAt(3); //--> i

        str.charAt(5); //--> g
        str.charAt(str.length()-1); // -> will return ALWAYS last char in string!!
//        str.charAt(6); //--> will throw Exception, because there is no 6. index!!

       String input=  "Total result is 9";
       char expectedValue= '2';

       char actualValue= input.charAt(16);
       System.out.println("actualValue = " + actualValue);

        System.out.println("\n//////////////////   concat()    ////////////////\n");

        String name= "Nazli", surname= "Polat";

        String fullName= name.concat(surname);   // name+surname
//         fullName= name + surname;

        System.out.println("fullName = " + fullName);
        System.out.println("name = " + name); // name will not change!!


        System.out.println("\n//////////////////   contains()    ////////////////\n");


        test= "Java is my programming language."; //Java is existing in this string!!

        for (int i = 0; i < test.length()-3; i++) {
            if(test.charAt(i) == 'J' && test.charAt(i+1) == 'a' && test.charAt(i+2) == 'v' && test.charAt(i+3) == 'a' ){
                System.out.println("yes contains!!!");
            }
        }

        System.out.println("test.contains('Java') = " + test.contains("Java")); // true!!!
        System.out.println("test.contains('java') = " + test.contains("java")); // false!!!
        System.out.println("test.contains('Java ') = " + test.contains("Java ")); // true!!!
        System.out.println("test.contains('language. ') = " + test.contains("language. ")); // false!!!
        System.out.println("test.contains('ava') = " + test.contains("ava")); // true!!!
        System.out.println("test.contains('a') = " + test.contains("a ")); // true!!!


        input= "1-16 of 216 results for";
        String expectedData= "216";
        // if I need verify a value in string, basically call contains method!!
        System.out.println("Verify that actual result is equal expected one: ");

        if(input.contains(expectedData)){
            System.out.println("TEST PASSED");
        }else{
            System.out.println("TEST FAIL!!");
        }


        System.out.println("\n//////////////////   indexOf()    ////////////////\n");
        // give me char/string take index!!!
        input = "Seyit is a Test Engineer";

        System.out.println("input.indexOf(\"S\") = " + input.indexOf("S")); // --> 0
        System.out.println("input.indexOf(\"s\") = " + input.indexOf("s")); // --> 7 !! it will return the first one's index from left
        System.out.println("input.lastindexOf(\"s\") = " + input.lastIndexOf("s")); // --> 13 !! it will return the last one's index from right to left!!
        System.out.println("input.indexOf(\"x\") = " + input.indexOf("x")); // --> -1 if it is not EXIST!!!!

        System.out.println("input.indexOf(\"Seyit\") = " + input.indexOf("Seyit")); // 0-> it will check the first char and return its value

        System.out.println("input.indexOf(\"Test\") = " + input.indexOf("Test")); // 11
        System.out.println("input.indexOf(\"test\") = " + input.indexOf("test")); // -1


    }
}
