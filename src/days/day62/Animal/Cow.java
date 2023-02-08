package days.day62.Animal;

public class Cow extends Animal implements Vegetarian {

    Cow(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("cows are eating vegetables");
    }

    public void moving() {
        System.out.println(this.name+" is walking.");
    }
}
