package days.day53;

import days.day54.AccessModifier;
import days.day54.TestInh;

public class TestInhOut  extends AccessModifier{

    public static void main(String[] args) {
        TestInh obj1Child = new TestInh();
//        obj1Child.password=2;  PRIVATE!!!

        TestInhOut objInhOut = new TestInhOut();  // --> CHILD!!
        objInhOut.isActive=false;

        AccessModifier obj2Parent = new AccessModifier(); // --> PARENT!!
//        obj2Parent.password=2;   PRIVATE!!!
//        obj2Parent.isActive = false;  //  protected no access!!


        objInhOut.testOverriding();
    }

    @Override
   public void testOverriding() {
//        super.testOverriding();
        System.out.println("Child class");
    }
}
