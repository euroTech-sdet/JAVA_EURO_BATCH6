package days.day68;

public class ExpHandling2 {

    public static void main(String[] args) throws InterruptedException {

        try {
            System.out.println("try block");
            System.out.println(1/0);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("catch block");
        }

//        throw new OutOfMemoryError();
//        System.out.println("Hello");  -->Unreachable statement


        pauseRun();

    }


    public static void pauseRun() throws InterruptedException {
        System.out.println("BEFORE sleep");
        Thread.sleep(2000);
        System.out.println("AFTER sleep");
    }

    public static void pauseRun2()  {
        System.out.println("BEFORE sleep");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("AFTER sleep");
    }

    public static void test() throws InterruptedException{
        //
        pauseRun();
        //
    }

    public static void test2() {
        //
        pauseRun2();
        //
    }
}
