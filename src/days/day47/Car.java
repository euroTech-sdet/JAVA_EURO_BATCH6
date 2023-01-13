package days.day47;

public class Car {
    private String brand;
    private String model;
    String color;
    String plateNumber;
    double value;
    int doors;
    int year;
    int speed;

    Car(String brand, String model, String color, String plateNumber, double value, int doors, int year, int speed) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.plateNumber = plateNumber;
        this.value = value;
        this.doors = doors;
        this.year = year;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return this.brand;
    }

    Car() {

    }

    public void accelareting() {
        speed += 10;// speed = speed + 10
    }

    public void accelareting(int number) {
        this.speed += number;
    }

    public void breaks() {
        speed = speed - 5;// speed -= 5
    }

    public void hasAccident() {
        value = 0.90 * value;
    }

    public void modifyCar() {
        doors = 2;
        value = value * 1.1;
    }

    public void printInfo() {
        System.out.println("this.brand = " + this.brand);
        System.out.println("this.value = " + this.value);
        System.out.println("this.color = " + this.color);
        System.out.println("this.speed = " + this.speed);
        System.out.println("this.doors = " + this.doors);
        System.out.println("this.model = " + this.model);
    }


}
