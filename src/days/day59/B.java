package days.day59;

public interface B {

    int b = 20;
    int number = 10;
    String city = "Oslo";

    void printB();

    static void writeB() {
        System.out.println("Writing sthng.");
    }

    default void writeC() {
        System.out.println("write c");
        writeD();
    }

    private void writeD() {
        System.out.println("private");
    }


}
