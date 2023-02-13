package days.day65_66;

public class MultiCatchBlock {

    public static void main(String[] args) {

        System.out.println("Before TRY");
        try {
            System.out.println("Top TRY block");
            System.out.println("abcTest().contains " + abcTest().contains("test"));
            // let's assume that this method can throw these exceptions:
            // 1- nullPointer -> if DB/api connection issue , re-connected DB !! and continue test 1!
            // 2- arithmetic  -> if total value is 0 means test should be fail, db insertion not working, bug scenario..
            // 3- arrayIndexOutB -> if db data manipulated ... I need to skip test!! only handle!!!

            System.out.println("End TRY block");
        } catch (ArrayIndexOutOfBoundsException a){
//           a.printStackTrace();
            System.out.println("ARRAY size changed, skip this step!!");
        } catch (ArithmeticException b){
      //     b.printStackTrace();
            System.err.println("!!! INPUT VALUE IS 0. TEST FAIL!!!!!");
        }catch (NullPointerException c){
          // c.printStackTrace();
           //RE connect DB method!!
            System.out.println("DB connection RESET!! Read to go!!!");
            System.out.println("c.getMessage() = " + c.toString());
        }

        System.out.println("AFTER TRY");
    }


    public static String abcTest(){
        // do some automation...
        // do some automation...
        // do some automation...
//        int total_value= 0;
//        int finalPrice = 100/total_value;
        return null;
    }
}
