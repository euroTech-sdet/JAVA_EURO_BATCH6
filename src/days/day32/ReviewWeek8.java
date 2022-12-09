package days.day32;

import java.util.Scanner;

public class ReviewWeek8 {

    static Scanner scanner = new Scanner(System.in);
    int instNum;  // instance variable!!
    //    String key = "JAva books"; //instance variable!!
    static public String key = "JAva books"; // class/ global variable

    public static void main(String[] args) {

//        System.out.println("instNum = " + instNum);
        int num;  // local
        scannerSample();

    }


    public void test() {
        System.out.println("instNum = " + instNum);
    }


    // enter "javaBooks" to search input
    // click search
    // Get all listed items
    // Verify that their item type are same with "key"
    // enter "ChildBook" to search input
    // click search
    // Get all listed items
    // Verify that their item type are same with "key"


    public void enterKey(String keyS) {
        keyS = key;
        System.out.println("key = " + keyS);
///

    }

    public void clickButton(String buttonName) {

    }

    public void getAllResult() {

    }

    public void verifyItemType() {

        String expectedKey = key;

//        verify(actual,expectedKey)
    }


    public static void scannerSample() {

//        System.out.println("Please enter length of tri. sides in one line with 1 space separation: ");
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int c = scanner.nextInt();
//
//        System.out.println("Perimeter= " + (a+b+c));

        System.out.println("Enter next value: ");
        String next = scanner.next();

        System.out.println("Enter nextline value: ");
        String nextLine = scanner.nextLine();


        System.out.println("next = " + next);

        System.out.println("nextLine = " + nextLine);


    }

}
