package days.day47;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Names {
    // create a list of name assign 20 values
    // create a method returns just a string name
    // create another method returns whole list
    // create another method returns a list up to the argument(parameter,int)
    private ArrayList<String> namesOfPeople = new ArrayList<>(Arrays.asList("Jale", "Lale", "Michael", "Mesut", "Querasma", "Nazli", "Tarik", "Bahadir", "Austine", "Gulcan", "Nihan", "Ozel", "Furkan", "Ali", "Keti"));

    public String oneName() {
        Random random = new Random();
        int index = random.nextInt(namesOfPeople.size());
        return namesOfPeople.get(index);
    }

}
