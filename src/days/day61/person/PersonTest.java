package days.day61.person;

import java.util.ArrayList;

public class PersonTest {
    public static void main(String[] args) {
        Employer employer = new Employer();
        employer.eating();
        employer.sleeping();
        employer.speaking();
        Person person1 = new Person();
        Person person = new Employer();
        Person person2 = new Student();
        person1.speaking();//parent class speaking English
        person.speaking();// child class speaking turkish  employer
        person2.speaking();// student class    student   english
        Student student = new Student();
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(student);
        ArrayList<Person> personList = new ArrayList<>();
        personList.add(student);
        personList.add(employer);
    }


}
