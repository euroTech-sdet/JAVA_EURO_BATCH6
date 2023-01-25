package days.day53;

public class SuperTest {
    public static void main(String[] args) {
        ChildClass childClass = new ChildClass();
        System.out.println(childClass instanceof ChildClass);
        System.out.println("childClass.num = " + childClass.num);
        childClass.print();
        SuperClass superClass=new SuperClass();
        System.out.println("superClass.num = " + superClass.num);
        System.out.println("childClass.getNum() = " + childClass.getNum());

    }
}
