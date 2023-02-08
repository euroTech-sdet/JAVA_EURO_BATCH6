package days.day61;

public class CarTest {
    public static void main(String[] args) {
        Honda honda = new Honda();
        honda.moving();
        honda.breaks();
        Car car = new Car();
        car.moving();
        Car car1 = new Honda();
        car1.moving();
        System.out.println("car.getClass() = " + car.getClass());
        System.out.println("car.getClass().getName() = " + car.getClass().getName());


    }
}
