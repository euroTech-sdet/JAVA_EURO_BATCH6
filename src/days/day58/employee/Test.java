package days.day58.employee;

public class Test {
    public static void main(String[] args) {
        // Salary salary = new Salary(); abstract
//        new Employee(); abstract
        Lawyer lawyer = new Lawyer();
        System.out.println("lawyer.salary = " + lawyer.salary);
        int a = 10;// instance block
        a = 20;// constructor
        System.out.println("a = " + a);
        lawyer.setSalary(5000);
        System.out.println("lawyer.salary = " + lawyer.salary);
        lawyer.increaseSalary();
        System.out.println("lawyer.salary = " + lawyer.salary);
        SDET sdet = new SDET();
        System.out.println("sdet.salary = " + sdet.salary);
        sdet.increaseSalary();
        System.out.println("sdet.salary = " + sdet.salary);

    }
}
