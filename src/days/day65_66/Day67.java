package days.day65_66;

public class Day67 {

    public static void main(String[] args) {

//        System.out.println("MAIN METHOD");
//        try{
//            int a = 1;
//            int b = 0;
//            System.out.println("Test value= " + (a/b));
//       }finally {
//            System.out.println("FINALLY BLOCK !!!");
//        }

///////////////////////////

        try {
            int a = 1;
            int b = 0;
            System.out.println("Test value= " + (a/b));
            System.out.println("Test");
        }catch (Exception e){
            System.out.println("WE CAUGHT EXCEPTION!!");
        }

        System.out.println("END OF MAIN");

///////////////////////////////

        try {
            System.out.println("try block 1. line");
            throw new IllegalAccessException();
          //  System.out.println("try block last line");
        } catch (Exception e) {
            System.out.println("WE CAUGHT EXCEPTION!!");
            throw new NullPointerException();
        }

      //  System.out.println("END OF MAIN");


    }


    public void test() {
        System.out.println("TEST");
        return;
//        System.out.println("TEST");  UNREACHABLE STATEMENT!!!
    }
}
