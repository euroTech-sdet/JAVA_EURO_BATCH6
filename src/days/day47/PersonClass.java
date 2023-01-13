package days.day47;

public class PersonClass {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.birthYear = 1980;
        person1.name = "Veli";
        person1.gender = 'm';

        person1.printInfo();

        Person person2 = new Person(" Furkan ",2000,'m');
        System.out.println("person2.name = " + person2.name);
    }
}
