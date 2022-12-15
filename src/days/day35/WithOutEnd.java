package days.day35;

public class WithOutEnd {
    public static void main(String[] args) {
//        withoutEnd("Hello") → "ell"
//        withoutEnd("java") → "av"
//        withoutEnd("coding") → "odin"
        String str = "java";
        //            01234
        System.out.println(str.substring(1, 4));
        System.out.println("str.length() = " + str.length());
        System.out.println(str.substring(1, str.length() - 1));

    }
}
