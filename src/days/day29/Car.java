package days.day29;

public class Car {
    String city = "Munich";
    String color;
    String brand;
    int year;
    int doorNumber;
    int speed;

    public void moving() {
        System.out.println("car is moving");
        System.out.println("car's initial speed is = " + speed);
    }

    public void accelerating() {// car speed is increasing
        speed = speed + 30;
        System.out.println("now speed of the car is = " + speed);
    }

    public void breaks() {
        speed -= 20;
        System.out.println("car is getting slower.");
        System.out.println("after break now speed of the " + brand + " is = " + speed);
    }

    public void stops() {
        System.out.println("car stopped");
    }

    public void printInfo() {
        System.out.println("the color of the car is  = " + color);
        System.out.println("year of the car is  = " + year);
        System.out.println("speed of the car = " + speed);
        System.out.println("brand = " + brand);
    }


}
