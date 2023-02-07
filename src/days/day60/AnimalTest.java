package days.day60;

import java.util.ArrayList;

public class AnimalTest {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();
        Cat cat = new Cat();
        cat.makeSound();
        Dog dog = new Dog();
        dog.makeSound();

        Animal animal1 = new Cat();
        animal1.makeSound();
        Animal animal2 = new Dog();
        animal2.makeSound();
        System.out.println("cat.city = " + cat.city);
        Animal animal3 = new Animal();
        System.out.println("animal3.city = " + animal3.city);
        Animal animal4 = new Cat();
        animal4.makeSound();
        cat.name = "Ginger";
        dog.name = "King";
        //  System.out.println("cat.name = " + cat.name);
        printCatName(cat);
        printDogName(dog);
        printName(cat);
        printName(dog);
        ArrayList<String> cities = new ArrayList<>();
        cities.add("London");
        ArrayList<Cat> listOfCats = new ArrayList<>();
        listOfCats.add(cat);
        Cat cat2 = new Cat();
        cat2.name = "Lion";
        listOfCats.add(cat2);
        ArrayList<Dog> listOfDogs = new ArrayList<>();
        listOfDogs.add(dog);
        ArrayList<Animal> listOfAnimals = new ArrayList();
        listOfAnimals.add(dog);//0
        listOfAnimals.add(cat);//1
        listOfAnimals.add(cat2);//2
        System.out.println(listOfAnimals.get(2).name);
        for (int i = 0; i < listOfAnimals.size(); i++) {
            System.out.println(listOfAnimals.get(i).name);
        }



    }

    // static printCatName()
    public static void printCatName(Cat cat) {
        System.out.println("cat.name = " + cat.name);
    }

    public static void printDogName(Dog dog) {
        System.out.println("dog.name = " + dog.name);
    }

    public static void printName(Animal animal) {
        System.out.println("animal.name = " + animal.name);
    }

}
