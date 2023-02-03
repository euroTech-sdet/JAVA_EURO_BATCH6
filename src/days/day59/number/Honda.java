package days.day59.number;


public class Honda extends Car implements CleaningTheCar, ModifyTheCar {

    enum Models {
        ACCORD;
    }

    int hp = 150;
    Models model = Models.ACCORD;

    @Override
    public void washTheCar() {
        System.out.println("washing the car in the station");
    }

    @Override
    public void sweepInside() {
        System.out.println("hired someone to clean the car.");
    }

    @Override
    public void boostThePower() {
        hp = hp + 200;
    }

    @Override
    public void changeTheTyres() {
        System.out.println("Changed the tyres of the honda.");
    }
}
