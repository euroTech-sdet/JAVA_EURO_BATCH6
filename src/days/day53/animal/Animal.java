package days.day53.animal;

public class Animal {
    //name
    //age

    //move
    //eat
    //makeSound
    private String name;
    int age;

    Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void moving() {
        System.out.println("animals are moving");
    }

    public void eating() {
        System.out.println("animals are eating");
    }

    public void makeSound() {
        System.out.println("animals are making sound");
    }

}
