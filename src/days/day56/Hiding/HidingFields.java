package days.day56.Hiding;

public class HidingFields {  // PARENT CLASS

    int parentValue;
    int count; // we hid this variable

    public HidingFields() {
        count=111;
    }

    public void test(){
        System.out.println("parentValue = " + parentValue);
    }

    public static void verify(){
        System.out.println("Parent verify");
    }
}
