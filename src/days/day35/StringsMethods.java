package days.day35;

public class StringsMethods {
    public static void main(String[] args) {
        String str = new String("Hello Again");
        //                              01234
        String city = "Oslo";
        //             0123
        System.out.println("str.length() = " + str.length());
        int lengthOfCity = city.length();
        System.out.println("lengthOfCity = " + lengthOfCity);
        System.out.println("str.charAt(0) = " + str.charAt(0));
        //                                             Hello --->length 5
        System.out.println("str.charAt(4) = " + str.charAt(4));
        lastLetter(str);//Hello Again
        lastLetter(city);//Oslo
        //    System.out.println("str.charAt(5) = " + str.charAt(20));
//        System.out.println("city.charAt(4) = " + city.charAt(4));

    }

    public static void lastLetter(String str) {
        System.out.println(str.charAt(str.length() - 1));
    }
}
