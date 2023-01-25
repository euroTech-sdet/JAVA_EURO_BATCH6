package days.day52;

import days.day48.Names;

public class EmployeeTest {
    public static void main(String[] args) {
        Names names = new Names();
        Teacher teacher = new Teacher("Ali");
        teacher.name = names.oneName();
        teacher.working();
        Lawyer lawyer = new Lawyer("Seyit");
        //lawyer.name = names.oneName();
        System.out.println("lawyer.name = " + lawyer.name);
        System.out.println("teacher.name = " + teacher.name);
        Sdet sdet = new Sdet(names.oneName());
        sdet.name = names.oneName();
        sdet.java = true;
        sdet.testing();
        lawyer.joinCourt();
        System.out.println("lawyer.name = " + lawyer.name);

    }
}
