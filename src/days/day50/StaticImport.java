package days.day50;

//import static java.lang.Character.isAlphabetic;
//import static java.lang.Character.isDigit;
import static java.lang.Character.*;  // hey java go to character class , and bring all static fields methods to my class , run and up
// do not prefer statically import everything with * , it will unnecessarily import every static field !!!
public class StaticImport {


    public static void main(String[] args) {

        System.out.println("MAX_VALUE = " + MAX_VALUE);
        String test= "A^*(BCDF£14t2323irwe44";

        for (int i = 0; i < test.length(); i++) {

          char c=  test.charAt(i);

            if(isAlphabetic(c)){
                System.out.println(c+ " is letter!");
            }else if(isDigit(c)){
                System.out.println(c+ " is digit!");
            } else{
                System.out.println(c+ " is character!");
            }


        }

    }

}
