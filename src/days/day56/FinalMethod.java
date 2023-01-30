package days.day56;

public class FinalMethod {  //  extends FinalClass  can not inherited, it is final class!!!


    final public void testFinal() {

    }
//    private void testFinal() {
//
//    }
}

class FinalTest extends FinalMethod {

//    @Override
//    public void testFinal() {
//
//    }

    public static void main(String[] args) {
        FinalTest obj = new FinalTest();
        obj.testFinal();
    }
}


final class FinalClass extends FinalMethod {

}
