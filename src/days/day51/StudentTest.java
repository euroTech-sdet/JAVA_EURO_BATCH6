package days.day51;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Ali");
        Student student2 = new Student("Veli");
        Student student3 = new Student("Fatma");
        Student student4 = new Student("Keti");
        Student student5 = new Student("Ronaldo");
        student1.studentNumber = 1000;
        System.out.println("student1.studentNumber = " + student1.studentNumber);
        System.out.println("student2.studentNumber = " + student2.studentNumber);
        System.out.println("Student.totalStudentNumber = " + Student.totalStudentNumber);
        System.out.println("student4.studentNumber = " + student4.studentNumber);//504
        System.out.println("student3.studentNumber = " + student3.studentNumber);//503
        System.out.println("student2.studentNumber = " + student2.studentNumber);//502
//        System.out.println("Student.nameList = " + Student.nameList);
        System.out.println("student5.nameList = " + student5.nameList);
    }
}
