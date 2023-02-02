package days.day58.employee;

public class SDET extends Employee {
    //20 bonus
    float bonus = 0.20f;

    {
        salary = 4000;
        super.bonus = this.bonus;
    }

    @Override
    public void setSalary(double salary) {

    }
}
