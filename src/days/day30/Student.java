package days.day30;

public class Student {
    int number;
    String name;
    int mathExamGrade;
    int scienceExamGrade;
    int literatureExamGrade;

    public static void main(String[] args) {
        int number = 101;
        Student student1 = new Student();
        student1.number = 200;
    }

    public void print() {

    }

    public void printExamResults() {
        System.out.println(name + " 's exam re sultrs= ");
        System.out.println("mathExamGrade = " + mathExamGrade);
        System.out.println("scienceExamGrade = " + scienceExamGrade);
        System.out.println("literatureExamGrade = " + literatureExamGrade);
    }

    public void averageOfTheResults() {
        int average = (mathExamGrade + scienceExamGrade + literatureExamGrade) / 3;
        System.out.println("average of math, science and literature  = " + average);
    }


}
