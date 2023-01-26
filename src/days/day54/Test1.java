package days.day54;

public class Test1 {

    public static void main(String[] args) {

        AccessModifier obj1 = new AccessModifier();

        System.out.println("obj1.value = " + obj1.value);
//        System.out.println("obj1.password = " + obj1.password);
//        obj1.password= "admin";

        obj1.setPassword("newPassword");
        System.out.println("obj1.getPassword() = " + obj1.getPassword());

        obj1.pageElement="test1";

        obj1.isActive= false;

        Test2 objTest2= new Test2();
    }
}
