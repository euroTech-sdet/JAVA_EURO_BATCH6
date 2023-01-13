package days.day46;

public class Student {
    String name;
    int age;
    double mathGrade;
    double scienceGrade;
    double literatureGrade;
    double resultsAverage;


    public void print() {
        System.out.println("name = " + name);
    }

    public void studying() {
        System.out.println(name + " is studying");
    }
    //printAge

    public void printAge() {
        System.out.println(age);
    }

    public void printExamResults() {
        // Tarik's exam results are printed.
        String str = name + "'s exam results are printed.";
        System.out.println("str = " + str);
        System.out.println("mathGrade = " + mathGrade);
        System.out.println("scienceGrade = " + scienceGrade);
        System.out.println("literatureGrade = " + literatureGrade);
    }

    // examAverage--->method name
    // Tarik's exam average is ......

    public void examResultsAverage() {
        resultsAverage = (scienceGrade + mathGrade + literatureGrade) / 3;
        System.out.println(name + "'s exams average is " + resultsAverage);
    }


    public static void print5() {
        System.out.println("Hello Student");
    }


}
