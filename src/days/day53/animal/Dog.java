package days.day53.animal;

public class Dog extends Animal {

    Dog(String name) {
        super(name);
//        this.name = name;
    }

    public void makeSound() {

        System.out.println("Dog is barking");
        System.out.println("super.getName() = " + super.getName());
        System.out.println("getName() = " + getName());

    }




}
