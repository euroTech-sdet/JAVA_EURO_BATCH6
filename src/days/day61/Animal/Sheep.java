package days.day61.Animal;

public class Sheep extends Animal implements Vegetarian {

    Sheep(String name) {
        super(name);
    }

    public void moving() {
        System.out.println(this.name + " is walking");
    }

    @Override
    public void eat() {
        System.out.println("sheep is not eating meat");
    }
}
