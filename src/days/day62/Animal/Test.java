package days.day62.Animal;

public class Test {
    public static void main(String[] args) {
        //Sheep is animal
        //sheep is sheep
        //sheep is vegetarian
        Vegetarian vegetarian = new Sheep("Sheep");
        vegetarian.eat();
        Cow cow = new Cow("cow");
        Animal animal = new Animal("Animal");
        animal.moving();
        animal = new Sheep("Sheep");
        animal.moving();
        animal = new Cow("Cow");
        animal.moving();



    }
}
