package days.day48;

import java.util.ArrayList;

public class NamesTest {
    public static void main(String[] args) {
        Names names = new Names();
        ArrayList<String> namesList = names.wholeNamesList();
        System.out.println("namesList = " + namesList);
        for (int i = 0; i < 5; i++) {
            System.out.println("names.oneName() = " + names.oneName());
        }

        System.out.println("names.namesList(3) = " + names.namesList(3));
        System.out.println("names.namesList(5) = " + names.namesList(5));
        System.out.println("names.namesList(8) = " + names.namesList(8));
        System.out.println("names.namesList(100) = " + names.namesList(100));


    }
}
