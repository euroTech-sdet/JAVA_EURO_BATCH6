package days.day48;

public class Number {

    private int a;
    private int b;
    private String s;
    private double d;

    Number(int a, int b, String s, double d) {
        this.a = a;
        this.b = b;
        this.s = s;
        this.d = d;
    }

    Number() {

    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public String getS() {
        return s;
    }

    public double getD() {
        return d;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int x) {
        b = x;
    }

    public void setS(String str) {
        s = str;
    }

    public void setD(double d10) {
        this.d = d10;
    }

}
