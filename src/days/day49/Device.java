package days.day49;

public class Device {

    String name;
    long serialNumber;
    double value;
    boolean isActive;
    private String status;

    static int deviceCounter;

    public Device(String name, long serialNumber, double value) {
        this.name = name;
        this.serialNumber = serialNumber;
        this.value = value;
        this.isActive = true;
        deviceCounter++;
    }

    public void setStatus(String newCondition){
        this.status = newCondition;
    }

    public void test(){
        name = "Test";
        deviceCounter=222222;
    }

    public static void staticTest(){
//        name = "Test"; can't access name, which objs name ??
//        this.name ="Test"; can't use this keyword, because it is referring to the obj and we cant provide an object to static methods!!
        String name="Test";
        System.out.println("name = " + name);

    }

    public String getStatus() {
        return status;
    }


    public static void main(String[] args) {

        Device d1= new Device("Laptop",10001, 500);
        d1.setStatus("Good");
        d1.name= "Test";
        d1.test();

        System.out.println("d1.status = " + d1.getStatus());
        System.out.println("Device.deviceCounter = " + Device.deviceCounter);

        Device d2= new Device("Monitor",10002, 200);
        d2.setStatus("Broken");
        System.out.println("d2.status = " + d2.getStatus());
        System.out.println("d2.deviceCounter = " + d2.deviceCounter);
        System.out.println("Device.deviceCounter = " + Device.deviceCounter);

        Device d3= new Device("Keyboard",10003, 50);
        System.out.println("Device.deviceCounter = " + Device.deviceCounter);

        Device.staticTest();
//        name= "AsusLaptop"; can't access name, which objs name ??
    }
}










class TestDevice {



}
