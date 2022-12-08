package days.day29;

public class PersonTest {
    public static void main(String[] args) {
        Person ali = new Person();
        ali.city = "Oslo";
        ali.birthYear = 2000;
        ali.gender = 'm';
        ali.occupation = "Automation Test Engineer";
        ali.name = "Ali";
        Person michael = new Person();
        michael.city = "Roma";
        michael.name = "Michael";
        michael.birthYear = 1990;
        michael.gender = 'm';
        michael.occupation = "Teacher";
        ali.givesAge();
        michael.givesAge();



    }

}
