package days.day47;

public class Person {

    String name;
    int birthYear;
    char gender;


    Person() {
        System.out.println("an object is created from person class");
    }

    Person(String name, int birthYear, char gender) {
        this.name = name;
        this.birthYear = birthYear;
        this.gender = gender;
    }

    public void printInfo() {
        System.out.println("this.name = " + this.name);
        System.out.println("this.birthYear = " + this.birthYear);
        System.out.println("this.gender = " + this.gender);
    }


}
