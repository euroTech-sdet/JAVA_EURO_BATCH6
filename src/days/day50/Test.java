package days.day50;

public class Test {

    int testNumber;
    static String testName;

    public Test(int testNumber) {
        this.testNumber = testNumber;
        testName = "Cons Static Assignment";
        System.out.println("testName in Cons: "+ testName);
    }

    static {
        System.out.println(" HELLO FROM DIFFERENT TEST CLASS STATIC BLOCK !!!");
        System.out.println("testName before initializing = " + testName);
        testName = "Static Block Test";
        System.out.println("testName after initializing = " + testName);
    }
}
