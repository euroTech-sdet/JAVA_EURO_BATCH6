package days.day59;

public class Toyota extends Car implements CleaningTheCar {


    @Override
    public void washTheCar() {
        System.out.println("washing car in front of home");
    }

    @Override
    public void sweepInside() {
        System.out.println("cleaning inside by machine");
    }
}
