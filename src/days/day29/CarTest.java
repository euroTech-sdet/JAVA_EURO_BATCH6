package days.day29;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car.carCount++;
        car1.city= "London";
        car1.brand = "Honda";
        car1.color = "Blue";
        car1.year = 2020;
        car1.doorNumber = 4;
        car1.speed = 10;
        car1.moving();
//        car1.breaks();
        car1.accelerating();
        System.out.println("car1.carCount = " + car1.carCount); // 1
        System.out.println("Car.carCount = " + Car.carCount); // 1

        Car car2 = new Car();
        car2.carCount++;  //Car.carCount++
        System.out.println("Car.carCount = " + Car.carCount); // 2
        System.out.println("car2.carCount = " + car2.carCount); // 2
        car2.speed = 5;
        car2.brand = "Toyota";
        car2.moving();
        System.out.println("car1.speed = " + car1.speed);
        car2.accelerating();
        System.out.println("car2.speed = " + car2.speed);
        System.out.println("car1.speed = " + car1.speed);
        car2.breaks();
        car1.breaks();
        car2.color = "Black";
        car2.year = 2000;
        car1.printInfo();
        car2.printInfo();
        System.out.println("car1.city = " + car1.city);
        System.out.println("car2.city = " + car2.city);
        car1.city = "London";

        System.out.println("car1.city = " + car1.city);


    }
}
