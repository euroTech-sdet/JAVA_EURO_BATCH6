package days.day49;

public class StaticFields {

    ///////////////////////// DATA FIELDS /////////////////////////
    int instanceInt;
    public static int classInt; // global variable
    static int test;
//    int orderNumber ;
    public static int orderNumber ;

    ///////////////////////// BLOCKS /////////////////////////
    {  // instance block
//        static int test;  ERROR!!
    }

    static {  // static block
//        static int test;  ERROR!!
    }


    //////////////////////// METHODS ////////////////////////
    public static void main(String[] args) {
        int localInt;
//        static int test;  ERROR!!
        System.out.println("StaticFields.orderNumber = " + StaticFields.orderNumber);  //0
        StaticFields obj = new StaticFields(1);
        System.out.println("StaticFields.orderNumber = " + StaticFields.orderNumber);  //11
        System.out.println("obj.orderNumber = " + obj.orderNumber);                    //11

        orderNumber = 22;
        System.out.println("StaticFields.orderNumber = " + StaticFields.orderNumber);  //22
        System.out.println("obj.orderNumber = " + obj.orderNumber);                    //22

        StaticFields obj2 = new StaticFields(1);
        System.out.println("StaticFields.orderNumber = " + StaticFields.orderNumber);  //11
        System.out.println("obj.orderNumber = " + obj.orderNumber);                    //11
        System.out.println("obj2.orderNumber = " + obj2.orderNumber);                  //11


    }
//RECORD!!!
    public StaticFields(int instanceInt) {  // no arg constructor
//        static int test;  ERROR!!
        orderNumber = 11;

        this.instanceInt=instanceInt;
    }

    public void test(){
//        static int test;  ERROR!!
        orderNumber=3333;
    }


    public void createOrder(){
        //
        //
        //
        // system create a unique order number,
        // need to store it!!
        orderNumber =123123123;
    }

    public void verifyOrderWithNumber(){

        // use filter option and enter order number!!
//        orderNumber
    }

    public void deleteOrder(){ //rollback
//        orderNumber...
    }

    static{
//        orderNumber   you can not call it in here !!!
    }
}

