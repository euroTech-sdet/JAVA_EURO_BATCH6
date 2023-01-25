package days.day53.animal;

public class AnimalTest {
    public static void main(String[] args) {
        Cat cat = new Cat("ginger");
        cat.eating();
        //  System.out.println("cat.name = " + cat.name);
        Dog dog = new Dog("King");
        //  System.out.println("dog.name = " + dog.name);
        dog.makeSound();
        // System.out.println("dog.name = " + dog.name);
        dog.makeSound();// dog is barking
        cat.makeSound();
        System.out.println("cat.getName() = " + cat.getName());
        System.out.println("dog.getName() = " + dog.getName());
        Lion lion = new Lion("Oscar", "Orange");
        System.out.println("lion.getName() = " + lion.getName());
        lion.makeSound();// Oscar is roaring
      //  System.out.println("lion.color = " + lion.color);
       // lion.color = "White";
        System.out.println("lion.getColor() = " + lion.getColor());
        lion.setColor("Black");
        System.out.println("lion.getColor() = " + lion.getColor());


    }
}
