package days.day36;

public class Strings {
    public static void main(String[] args) {
        String city = "London";
        //             012345
        String country = new String("Germany");
        //                                 0123456
        System.out.println(city.substring(0, 2));//Lo 01
        System.out.println(city.charAt(0));
        System.out.println(city.length());
        System.out.println(country.substring(3));// 3456
        String str = "WooHoo";
        //            012345
        str.substring(0,2);//will return first 2 letters
        str.substring(str.length()-2);// last 2 letters of the string
        System.out.println(str.substring(3));//second half
        System.out.println(str.substring(str.length()/2));//second half


    }
}
