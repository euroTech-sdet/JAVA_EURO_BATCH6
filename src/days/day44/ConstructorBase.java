package days.day44;

public class ConstructorBase {

    int value;

    String str= "Default" ;

    boolean flag;

    double rate;

    static int objectCounter=0;  // should be keep the object number dynamically

    // 1- Don't type a return type
    // 2- Method name must be same with Class name
    public ConstructorBase(){   // Default constructor method!!
        rate=1.0;
        flag = true;
        System.out.println("Inside Constructor!");
        objectCounter++;
    }

    public void ConstructorBase(){   // a method ...
    }

    public void test (){
    }
}

class TestConst{

    public static void main(String[] args) {

        System.out.println("BEGIN - Main Method");
        ConstructorBase obj1 = new ConstructorBase();
        System.out.println("obj1.objectCounter = " + ConstructorBase.objectCounter);  // obj1.objectCounter    // 1

        System.out.println("OBJ1 Created!!");

        System.out.println("obj1.value = " + obj1.value);
        System.out.println("obj1.flag = " + obj1.flag);
        System.out.println("obj1.str = " + obj1.str);
        System.out.println("obj1.rate = " + obj1.rate);

        System.out.println("////////////////////////////////////// \n");

        ConstructorBase obj2 = new ConstructorBase();
        System.out.println("obj1.objectCounter = " + ConstructorBase.objectCounter);  // 2

        System.out.println("obj2.rate = " + obj2.rate);
        System.out.println("obj2.str = " + obj2.str);

        System.out.println("END - Main Method");


        System.out.println("////////////////////////////////////// \n");

        ConstructorBase obj3 = new ConstructorBase();
        System.out.println("obj1.objectCounter = " + ConstructorBase.objectCounter);  // 3

        System.out.println("obj3.rate = " + obj3.rate);
        System.out.println("obj3.str = " + obj3.str);

        System.out.println("END - Main Method");
    }
}
