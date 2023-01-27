package days.day55.Task1;

public class Car  extends Vehicle {
    double tireSize;
    String city= "London";
    String brand;
    String gearBox; // manuel
    String fuelType; // petrol

    int doorNumber;
    static int honkNumber=0;


    public Car (String name){
        super(name);

    }
    public void hadAccident(){
        System.out.println("this.city = " + this.city);
        System.out.println("super.city = " + super.city);
    }
    public void honk(String name){
        honkNumber++;

    }
    public void handBreak(){

    }
    public void openTrunk(){

    }
}