package days.day23;

public class Return {
    public static void main(String[] args) {
        int fatherBirthYear = 1970;
        int childBirthYear = 2000;
        int ageOfTheFather = ageCalculater(fatherBirthYear);//52
        ageCalculater(1990);
        int ageOfTheChild = ageCalculater(childBirthYear);//22
        System.out.println("ageOfTheFather-ageOfTheChild = " + (ageOfTheFather - ageOfTheChild));
        int year = 2022;
        int birthYear = 2000;
        int myAge = year - birthYear;
        System.out.println("myAge = " + myAge);
    }

    public static int ageCalculater(int birthYear) {
        int age = 2022 - birthYear;
        System.out.println("age = " + age);
        return age;
    }


}
