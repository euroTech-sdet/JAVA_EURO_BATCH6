package days.day37;

import java.util.Arrays;

public class Arrays3 {
    public static void main(String[] args) {
        char[] characters = {'a', 'b', 'c', 'd'};
        //                   0     1    2    3
        System.out.println("characters[0] = " + characters[0]);
        System.out.println("characters[3] = " + characters[3]);
        System.out.println("characters.length = " + characters.length);
        characters[0] = 'n';
        System.out.println("Arrays.toString(characters) = " + Arrays.toString(characters));





    }
}
