package days.day58.last;

import days.day58.last.A;

public class B extends A { // child class

    B() {
        super(10);
        System.out.println("super.a5 = " + super.a5);
    }

    @Override
    public void print() {
        System.out.println("B");
    }
}
