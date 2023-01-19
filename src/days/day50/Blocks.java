package days.day50;

public class Blocks {

    static int test;

    public static void staticTest(){
        System.out.println(" !!Static Method!!");
    }

    public void test(){
        System.out.println("!!Non static Method!!!");
    }

    public static void main(String[] args) {

//        test(); no access to non static methods
        System.out.println("test = " + test);
        test=3;
        System.out.println("test = " + test);
        System.out.println("\t-- MAIN Method First Line --");

        staticTest();

        Blocks obj1 = new Blocks();
        obj1.test();

        Test testObj = new Test(100);

        System.out.println("\t-- MAIN Method Last Line--");
    }

    static {
        test=2;
        System.out.println("\t __ Static Block __ ");
    }

//    static {
//        test=4;
//        System.out.println("\t __ Static Block 2  __ ");
//    }



}


//static {  // must be type inside the class
//        System.out.println("\t __ Static Block __ ");
//        }
