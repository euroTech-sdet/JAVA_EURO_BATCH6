package days.day48;

public class Student {


    private String name;
    private int birthYear;
    private String city;

    Student(String name, int birthYear, String city) {
        this.name = name;
        this.birthYear = birthYear;
        this.city = city;
        System.out.println("an object created from student class.");
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthYear(int birthYear) {// 1000      2100
        if (birthYear < 2005 || birthYear > 2010) {
            this.birthYear = 2008;  //   2005-2010
        } else {
            this.birthYear = birthYear;
        }
      //  this.birthYear = birthYear;

    }


    public void printName() {
        System.out.println("name = " + name);
    }


    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return this.birthYear;
    }

    public String getCity() {
        return city;
    }


}
