package days.day22;

public class Car {
    public static void main(String[] args) {
//        System.out.println("Get the keys");
//        System.out.println("open the doors");
//        System.out.println("sit on to the driver seat");
//        System.out.println("fasten your seat belt.");
//        System.out.println("start the car");
//        System.out.println("drive the car forward");
//   driving car backward

        driveForward();// 1
        stopTheCar();//1
        drivingBackward();// 1
        parkTheCar();
        driveBackward();// 2
        stopTheCar();//2
        drivingForward();//2


    }

    public static void parkTheCar() {
        System.out.println("parked the car");
    }

    public static void driveBackward() {
        getTheKeys();
        openTheDoors();
        seat();
        seatBelt();
        startTheCar();
        drivingBackward();
    }

    public static void driveForward() {
        getTheKeys();
        openTheDoors();
        seat();
        seatBelt();
        startTheCar();
        drivingForward();
    }

    public static void getTheKeys() {
        System.out.println("got the keys");
    }

    public static void openTheDoors() {
        System.out.println("doors are opened");
    }

    public static void seat() {
        System.out.println("you are on the driver seat");
    }

    public static void seatBelt() {
        System.out.println("fastened belts");
    }

    public static void startTheCar() {
        System.out.println("started the car");
    }

    public static void drivingForward() {
        System.out.println("you are moving forward");
    }

    public static void drivingBackward() {
        System.out.println("you are driving back");
    }

    public static void stopTheCar() {
        System.out.println("pushed the brakes");
    }


}
