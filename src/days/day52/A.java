package days.day52;

public class A {
    String city;
    int number;
    private String result;

    public String getResult() {
        return result;
    }

    public A(int number) {
        this.number = number;
    }



    public void print() {
        System.out.println("result = " + result);
        System.out.println("printing");
    }

    private void run() {
        System.out.println("running.");
    }
}
