package days.day58.employee;

public abstract class Employee extends Salary {

    float bonus;

    public void increaseSalary() {
        System.out.println("this.bonus = " + this.bonus);
        salary = salary * (1.0 + this.bonus);
        System.out.println("salary = " + salary);
    }


}
