package days.day53;

public class Vehicle {
    // parent class
    String name;
    int weight;
    float length;
    int seats;
    boolean lights;
    String color;
    String city = "Oslo";




    public void start() {
        System.out.println("Vehicle started");
    }

    public void stop() {
        System.out.println("Vehicle stopped");
    }

    public void move() {
        System.out.println("Vehicle is moving.");
    }


}
