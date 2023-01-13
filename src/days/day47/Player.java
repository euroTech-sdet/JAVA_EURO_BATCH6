package days.day47;

import java.time.LocalDate;

public class Player {

    String name;
    String clubName = "Chelsea";

    String city;

    int age;


    Player(String name, String clubName, String city, int birthyear) {
        LocalDate localDate = LocalDate.now();
        this.name = name;
        this.clubName = clubName;
        this.city = city;
//        age = 2023 - birtyear; 1980--->43
        age = localDate.getYear() - birthyear;
    }

    public Player(String city, String name) {
        this.city = city;
//        player's' name
        this.name = name;
        System.out.println("a new object created from Player class.");
    }


    Player(String name) {
        this.name=name;
    }

    Player() {
        System.out.println("without parameter");
    }

    public void printPlayerInfo() {
        System.out.println("this.name = " + this.name);
        System.out.println("age = " + age);
        System.out.println("clubName = " + clubName);
        System.out.println("this.city = " + this.city);
        //  Ronaldo is 40 years old and living in Manchester and Ronaldo is playing for Leicestercity
        System.out.println(name + " is " + age + " years old and living in " + city + " and " + name + " is playing for " + clubName);
    }


}
