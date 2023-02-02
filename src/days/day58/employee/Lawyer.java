package days.day58.employee;

public class Lawyer extends Employee {
    // 10 bonus
    float bonus = 0.10f;

    Lawyer() {
        super.salary = 3000;
    }

    {
        super.salary = 4000;
        super.bonus = this.bonus;
    }

    @Override
    public void setSalary(double salary) {
        this.salary = salary;
        System.out.println("salary = " + salary);
    }
}
