package days.day56;


public class Variables {

    String strInstance = "test"; // instance variable
    boolean isActive;
    static int varStatic;

    public Variables() {
    }

    public static void main(String[] args) {
        System.out.println("Top of Main Method");
        int num1 = 2; // local variable
        int num2 = 2;
        int num3 ;
        test();
//      System.out.println("num3 = " + num3);
        num3 = 3;

        System.out.println("End of Main Method");
    }

    public static void  test(){
        int mnumb1=3;
        System.out.println("mnumb1 = " + mnumb1);
    }
}

class TestVariable{

    static int count;

    public static void main(String[] args) {
        Variables obj = new Variables();
        System.out.println("obj.isActive = " + obj.isActive);
        count = 2;
        System.out.println("count = " + count);

    }
}
