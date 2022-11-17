package days.day19;

public class DoWhileLoop {

    public static void main(String[] args) {

        int num = 0;

        while (num < 10) {
            System.out.println(num);
            num++;
        }
        //
        System.out.println("\n//////////////////\n");
        num = 0;
        do{
            System.out.println(num);
            num++;
        } while(num < 10);


        System.out.println("\n//////////////////\n");

        // Let's create a code, to print numbers <8
        num=11;
        while(num<8){
            System.out.println("num = " + num);
            num++;
        }
        System.out.println("\n//////////////////\n");
        num=11;
        do{
            System.out.println("num = " + num);
            num++;
        }while (num<8);

        System.out.println("\n//////////////////\n");

    }
}
