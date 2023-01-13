package days.day47;

public class PeopleTest {
    public static void main(String[] args) {
        People people = new People("Bahadir", 1998);
        // people.name = "Veli";
        System.out.println("people.getName() = " + people.getName());

        People people1 = new People("Keti", 2000);
        String keti = people1.getName();
        System.out.println("keti = " + keti);
//        System.out.println("people1.birthYear = " + people1.birthYear);
//        people1.birthYear = 1990;
        System.out.println("people1.getBirthYear() = " + people1.getBirthYear());
        System.out.println("people.getBirthYear() = " + people.getBirthYear());

    }
}
