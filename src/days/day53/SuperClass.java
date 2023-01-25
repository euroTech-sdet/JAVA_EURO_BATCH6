package days.day53;

public class SuperClass {
    int num = 50;


    public void print() {
        System.out.println("parent class print method");
        System.out.println("this.num = " + this.num);
    }

    public int getNum() {
        return num;
    }


}
