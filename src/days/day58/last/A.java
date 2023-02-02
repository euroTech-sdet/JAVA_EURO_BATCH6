package days.day58.last;

public abstract class A {
    int a5 = 10;

    public A() {//parent class
        System.out.println("parent class constructor without arg");
    }

    public A(int n) {
        System.out.println("parent class constructor with arg");
    }

    public abstract void print();

    public void printSthng() {
        System.out.println("HEllo");
    }
}


