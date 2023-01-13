package days.day47;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println("car1.speed = " + car1.speed);
        car1.accelareting();
        System.out.println("car1.speed = " + car1.speed);
        Car car2 = new Car();
        System.out.println("car2.speed = " + car2.speed);
        car1.breaks();
        System.out.println("car1.speed = " + car1.speed);
        car1.accelareting(40);
        System.out.println("car1.speed = " + car1.speed);
        car1.value = 1000;
        car1.hasAccident();
        System.out.println("car1.value = " + car1.value);
        car2.value = 2000;
        car2.modifyCar();
        System.out.println("car2.value = " + car2.value);
        Car car = new Car("Honda", "Accord", "Blue", "HK45KF5", 5000, 4, 2020, 0);
        car.printInfo();
        System.out.println("car.getBrand() = " + car.getBrand());
        System.out.println("car.getModel() = " + car.getModel());
        car.modifyCar();
        System.out.println("car.doors = " + car.doors);

    }
}
