package days.day30;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.number = 500;
        student1.name = "Stephen";
        Student student2 = new Student();
        student2.name = "Tarik";
        student2.number = 600;
        student1.scienceExamGrade = 80;
        student1.mathExamGrade = 60;
        student1.literatureExamGrade = 90;
        student2.literatureExamGrade = 70;
        student2.scienceExamGrade = 60;
        student2.mathExamGrade = 80;
        student1.printExamResults();
        student2.printExamResults();
        student2.averageOfTheResults();
        student1.averageOfTheResults();

    }
}
