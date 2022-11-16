package days.day17;

public class For3 {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("*********");
        }

        for (int i = 0; i < 3; i++) {
            System.out.print("hello");
            System.out.print(i);// hello0hello1hello2
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.print("hello");
            System.out.println(i);
        }// hello0
        //   hello1
        //   hello2
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.println("hello");
            System.out.print(i);
        }// hello
        // 0hello
        //1hello
        //2


    }
}
