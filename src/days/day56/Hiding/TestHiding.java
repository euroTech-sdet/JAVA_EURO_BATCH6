package days.day56.Hiding;

public class TestHiding extends HidingFields {  // CHILD CLASS

    int childValue;
    int count;

    public TestHiding() {
        count = 222;
    }

    public static void main(String[] args) {
        TestHiding testHiding = new TestHiding();
        System.out.println("testHiding.parentValue = " + testHiding.parentValue);
        testHiding.test();
        testHiding.count = 333;
        System.out.println("testHiding.count = " + testHiding.count);

        testHiding.verify();  // this will get line 33


        ////////////////////////
        HidingFields hidingFields = new HidingFields();
        System.out.println("hidingFields.count = " + hidingFields.count);
        hidingFields.verify(); // this will get line 16
    }

    public void test() {

        System.out.println("childValue = " + childValue);
    }

    public static void verify()  {  //throws InterruptedException
        System.out.println("Child verify");
//        Thread.sleep(1000);
    }

}
