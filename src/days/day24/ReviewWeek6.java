package days.day24;

public class ReviewWeek6 {

    public static void sleep(){
        System.out.println("SLEEEEP");
    }


    public static void main(String[] args) {
//        int a = 10;
//        System.out.println("FIRST LINE OF MAIN METHOD");
//        testMethod();
//        System.out.println(a);
//        System.out.println("LAST LINE OF MAIN METHOD");
//
String studentName= "Austine";
        printName("Kseniia");
        printName("Mehmet");
        printName("Nihan");
        printName(studentName);



    }


    public static void testMethod() {

        System.out.println("INSIDE TEST METHOD");
        sleep();
        System.out.println("END OF TEST METHOD");
    }


    public static void alone(){
        System.out.println("So alone :(");
        int test=10;
    }


    public static void printName(String name){  //name= "Kseniia"
        int test=10;
        System.out.println("Name is "+ name);
    }

}
