package days.day16;

public class Blocks {
    public static void main(String[] args) {
        System.out.println("we are in the main block");
        {
            System.out.println("outer block");
            {
                System.out.println("inner block");
            }
        }
        System.out.println("again in the main block");


    }
}
