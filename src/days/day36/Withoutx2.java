package days.day36;

public class Withoutx2 {
    public static void main(String[] args) {
        String str="HxiHix";
      if(str.substring(0,2).contains("x")){
        str=  str.substring(0, 2).replace("x", "").concat(str.substring(2));
      }
        System.out.println("str = " + str);


    }
}
