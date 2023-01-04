package days.day41;

public class WrapperReview {


    public static void main(String[] args) {
        System.out.println(1 == 1.0);

        Integer intObj = Integer.valueOf("2");
        int value = 2;

        Integer intObj1 = Integer.valueOf("128");
        Integer intObj2 = Integer.valueOf("128");

        System.out.println("intObj1=intObj2 = " + (intObj1 == intObj2));
        System.out.println("intObj1.equals(intObj2) = " + intObj1.equals(intObj2));
        System.out.println(value == intObj);

        String str1 = "2";
        String str2 = new String("2");

        System.out.println("str1==str2 = " + (str1 == str2));
        System.out.println("str1 equals to str2 = " + (str1.equals(str2)));


        ////////////////////////
        String actualResult= "1-221 of 10212 results for";
        String resultNumber = actualResult.substring(actualResult.indexOf("f")+2 ,actualResult.indexOf("r")-1);
        Integer obj1 = Integer.valueOf(resultNumber);
        int value2= 111;
        String str3 = String.valueOf(value2);

    }
}
