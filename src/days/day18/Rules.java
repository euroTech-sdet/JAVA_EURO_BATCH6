package days.day18;

public class Rules {
    public static void main(String[] args) {
            // declaring and assigning out of the loop is possible
        //      multiple condition is possible
        //     inside the block increment or decrement is possible
        //     possible to use multiple variable
        int i = 0;
        for (i = 1; i < 10 && i >= 1; i++) {  //3   5   7   9 11
            System.out.println(i);//1 3 5 7 9
            i++;//2 4 6 8 10
        }
        System.out.println("out of the block " + i);// 11
        int x = 0;
        for (x = 5, i = 0; i < 5 && x < 10; i++, x++) {
            System.out.println("i = " + i);//0
            System.out.println("x = " + x);//5
            //                               1
            //                               6
        }
    }
}
