package days.day50;

public class InsBlock {

    ///////////////////////////// Data Fields /////////////////////////////////
    int value;
    static String text;

    ///////////////////////////// BLOCKS /////////////////////////////////
    { // non static block(Instance block) executes when the object is created. Because it
        System.out.println("------- Instance Block----------");
    }

    static {
        System.out.println("------------- Static Block --------------");
    }

    ///////////////////////////// Cons /////////////////////////////////
    public InsBlock(int value) {
        this.value = value;
        System.out.println("Inside Constructor");
    }

    ///////////////////////////// Methods /////////////////////////////////
    public static void main(String[] args) {
        System.out.println("\t-- MAIN Method First Line --");

        InsBlock obj1 = new InsBlock(11);
        System.out.println("obj1.value = " + obj1.value);

        InsBlock obj2 = new InsBlock(22);
        System.out.println("obj2.value = " + obj2.value);

        System.out.println("\t-- MAIN Method Last Line --");


    }

    public void test(){
        System.out.println("TEST METHOD");
    }
}
