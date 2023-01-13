package days.day46;

import days.day47.Player;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        student1.name = "Tarik";
        student1.age = 24;
        student2.name = "Yusuf";
        student2.age = 30;
        System.out.println("student3.name = " + student3.name);
        student3.name = "Kseniia";
        student3.age = 25;
        student2.print();
        student1.print();
        student3.print();
        Math.min(10, 20);
        Student.print5();
        Student.print5();
        Student.print5();
        Student.print5();

        student1.studying();
        student2.studying();
        student1.printAge();
        student2.printAge();
        student3.printAge();
        student1.mathGrade = 90.50;
        student1.scienceGrade = 98.70;
        student1.literatureGrade = 75.65;
        student2.mathGrade = 95.35;
        student2.scienceGrade = 87.25;
        student2.literatureGrade = 99.10;
        student1.printExamResults();
        student2.printExamResults();
        student1.examResultsAverage();
        student2.examResultsAverage();



    }
}
