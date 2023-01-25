package days.day53;

public class ChildClass extends SuperClass {

    int num = 40;

    public void print() {
        System.out.println("print method from child class");
        System.out.println("from child class " + this.num);
        System.out.println("super.num = " + super.num);
        super.print();
    }

}
