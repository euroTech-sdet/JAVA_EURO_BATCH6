package days.day52;

public class Employee {
    String name;
    double salary;

    int employeeId;
    int vacationDays;
    char gender;
    int workHours;

    Employee(String name) {
        this.name = name;
        System.out.println("an object generated.");
    }

    public void working() {
        System.out.println(name + " is working");
    }

    public void leaveAnnual() {
        System.out.println(name + " is on vacation.");
    }

    public void raiseSalary() {

    }
}
