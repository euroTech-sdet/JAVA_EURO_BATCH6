package days.day22;

public class Methods {
    public static void main(String[] args) {

//        System.out.println("Istanbul");
//        System.out.println("Istanbul");

        System.out.println("we are in the main method");//1
        printNameOfTheCity();//2
        System.out.println("we are still in the main method");//3
        printTwoCityName();
        System.out.println("we are at the end of the main method.");
    }

    public static void printNameOfTheCity() {
        System.out.println("Istanbul");//2
    }

    static void printTwoCityName() {
        System.out.println("Oslo");
        System.out.println("London");
    }


}
