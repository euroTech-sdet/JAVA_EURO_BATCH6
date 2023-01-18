package days.day48;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Names {
    // create a list of name assign 20 values
    // create a method returns just a string name
    // create another method returns whole list
    // create another method returns a list up to the argument(parameter,int)
    private ArrayList<String> namesOfPeople = new ArrayList<>(Arrays.asList("Jale", "Lale", "Michael",
            "Mesut", "Querasma", "Nazli", "Tarik", "Bahadir", "Austine",
            "Gulcan", "Nihan", "Ozel", "Furkan", "Ali", "Keti"));

    public String oneName() {
        Random random = new Random();
        int index = random.nextInt(namesOfPeople.size());
        return namesOfPeople.get(index);
    }

    public ArrayList<String> wholeNamesList() {
        return namesOfPeople;
    }

    public ArrayList<String> namesList(int number) {
        // number 50    names 20   restrict
//        if(number>20)
        if (number > namesOfPeople.size()) {
            number = 20;
        }
        ArrayList<String> numberNames = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            numberNames.add(oneName());
        }
        return numberNames;
    }

}
