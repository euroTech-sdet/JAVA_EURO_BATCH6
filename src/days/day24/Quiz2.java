package days.day24;

public class Quiz2 {

    public static void main(String[] args) {

        //

        boolean flag = true;

        boolean xx = (14 > 10); //? true:false


        ////////////

        int sum = 0;
        for (int x = 0; x < 10; x++) {
            sum = 0;

            if (x % 3 == 0) {
                sum += x;
            }
        }

        //  System.out.println(sum);  //9


        ////////////////////

        int test = 5;


        switch (test) {

            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;

            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;

            default: //(if all case are false)
                System.out.println("default");

        }


    }
}
