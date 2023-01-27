package days.day55.Task1;

public class Plane extends Vehicle {

    {
        proppelerSize= 1.1;
    }

    static {
        planeCount = 11;
    }

    double proppelerSize;
    String engineType = "hybrid";
    public static int planeCount=0;

    public void motorRpm(){

    }
    public void pressureCheck(){

    }
    public void taxi(){

    }

    public Plane(){
       super();

    }

    public Plane(String name){
          super(name);
    }

}