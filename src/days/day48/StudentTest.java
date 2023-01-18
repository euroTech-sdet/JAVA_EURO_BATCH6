package days.day48;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Ali", 2010, "Istanbul");
//        student.name = "ALi";
//        student.city = "London";
//        student.birthYear = 2000;
        String student1Name = student1.getName();
        System.out.println("student1Name = " + student1Name);
        System.out.println("student1.getBirthYear() = " + student1.getBirthYear());
        System.out.println("student1.getCity() = " + student1.getCity());
        student1.setCity("Bremen");
        System.out.println("student1.getCity() = " + student1.getCity());
        System.out.println("student1.getBirthYear() = " + student1.getBirthYear());
        student1.setBirthYear(1000);
        System.out.println("student1.getBirthYear() = " + student1.getBirthYear());

    }
}
