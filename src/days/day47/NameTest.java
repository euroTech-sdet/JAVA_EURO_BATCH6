package days.day47;

import days.day48.Names;

public class NameTest {
    public static void main(String[] args) {
        Names name = new Names();
        System.out.println("name.oneName() = " + name.oneName());
        System.out.println("name.oneName() = " + name.oneName());
        System.out.println("name.oneName() = " + name.oneName());
        System.out.println("name.oneName() = " + name.oneName());
        System.out.println("name.oneName() = " + name.oneName());
        for (int i = 0; i < 5; i++) {
            System.out.println("name.oneName() = " + name.oneName());
        }
    }
}
