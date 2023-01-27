package days.day55.Task1;

public class VehicleTest {
    public static void main(String[] args) {

        Car car1 = new Car("Keti");
        car1.brand="BMW";
        car1.doorNumber=5;
        System.out.println("car1.getName() = " + car1.getName());

        car1.fuelType="Bensin";

        car1.lights = true;

        car1.start();
        car1.setName("Gülcan");
        System.out.println("car1.getName() = " + car1.getName());
        //////////////////////////////////////////////
        Car car2=new Car("Akbaba");
        car2.doorNumber=3;
        car2.brand= "Mercedes";
        car2.stop();
        car2.honk(car2.getName());

        Plane plane1=new Plane();
        plane1.start();
        plane1.stop();

        Plane plane2 = new Plane("KingAirB350");






    }

}
