package days.day51;

import java.util.ArrayList;

public class Student {
    int studentNumber;//
    static int totalStudentNumber;
    String name;
    static ArrayList<String> nameList = new ArrayList<>();

    // math science literature ----->grade ---->list
    // whole student exam results ---->list

    Student(String name) {
        this.name = name;
        totalStudentNumber++;
        studentNumber = totalStudentNumber + 500;
        System.out.println("totalStudentNumber = " + totalStudentNumber);
        nameList.add(name);
    }
}
