package days.day65_66;

public class ExpHandling {

    public static void main(String[] args) {

        System.out.println("Top of MAIN");

        try {  // only monitor and report to catch!!
            System.out.println("Test1");
            System.out.println("Test2");
            String expectedValue = "100021ABC, 12001ABC"; // null will come to the dB query call
            if (expectedValue.contains("10001ABC")) {  // invoice id
                System.out.println("TEST PASSED !!!");
            } else {
                System.out.println("TEST FAILED");
            }
            System.out.println("Test3" + (1 / 0));  // ArithmeticExp
            System.out.println("Test4");
// Solution -2
        } catch (NullPointerException n) {  // catch will catch and stop them if exception obj same level or lower
            System.out.println("Inside Catch Block");
            System.out.println("TEST STOPPED! CHECK DB CONNECTION!!!! ");
        }


//        } catch (Exception e) {  // catch will catch and stop them if exception obj same level or lower
//            System.out.println("Inside Catch Block");
//            System.out.println("TEST STOPPED! CHECK DB CONNECTION!!!! ");
//        }
// solution -1 put here
//        System.out.println("Test3" + (1/0));
//        System.out.println("Test4");
        System.out.println("End of MAIN");

    }
}
